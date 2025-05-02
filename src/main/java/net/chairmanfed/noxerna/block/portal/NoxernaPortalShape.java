package net.chairmanfed.noxerna.block.portal;

import net.chairmanfed.noxerna.block.NoxernaBlocks;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Based on {@link net.minecraft.world.level.portal.PortalShape}
 */
public class NoxernaPortalShape {
    private static final BlockBehaviour.StatePredicate FRAME = ((state, level, pos) -> state.is(NoxernaBlocks.NOXERNA_PORTAL_FRAME));
    private final LevelAccessor level;
    private final Direction.Axis axis;
    private final Direction rightDir;
    private int numPortalBlocks;
    @Nullable
    private BlockPos bottomLeft;
    private int height;
    private final int width;

    public static Optional<NoxernaPortalShape> findEmptyPortalShape(LevelAccessor level, BlockPos bottomLeft, Direction.Axis axis) {
        return findPortalShape(level, bottomLeft, p_77727_ -> p_77727_.isValid() && p_77727_.numPortalBlocks == 0, axis);
    }
    public static Optional<NoxernaPortalShape> findPortalShape(LevelAccessor level, BlockPos bottomLeft, Predicate<NoxernaPortalShape> predicate, Direction.Axis axis) {
        Optional<NoxernaPortalShape> optional = Optional.of(new NoxernaPortalShape(level, bottomLeft, axis)).filter(predicate);
        if (optional.isPresent()) {
            return optional;
        } else {
            Direction.Axis direction$axis = axis == Direction.Axis.X ? Direction.Axis.Z : Direction.Axis.X;
            return Optional.of(new NoxernaPortalShape(level, bottomLeft, direction$axis)).filter(predicate);
        }
    }
    public NoxernaPortalShape(LevelAccessor level, BlockPos bottomLeft, Direction.Axis axis) {
        this.level = level;
        this.axis = axis;
        this.rightDir = axis == Direction.Axis.X ? Direction.WEST : Direction.SOUTH;
        this.bottomLeft = this.calculateBottomLeft(bottomLeft);
        if (this.bottomLeft == null) {
            this.bottomLeft = bottomLeft;
            this.width = 1;
            this.height = 1;
        } else {
            this.width = this.calculateWidth();
            if (this.width > 0) {
                this.height = this.calculateHeight();
            }
        }
    }
    @Nullable
    private BlockPos calculateBottomLeft(BlockPos pos) {
        int i = Math.max(this.level.getMinBuildHeight(), pos.getY() - 21);

        while (pos.getY() > i && isEmpty(this.level.getBlockState(pos.below()))) {
            pos = pos.below();
        }

        Direction direction = this.rightDir.getOpposite();
        int j = this.getDistanceUntilEdgeAboveFrame(pos, direction) - 1;
        return j < 0 ? null : pos.relative(direction, j);
    }
    private int calculateWidth() {
        int i = this.getDistanceUntilEdgeAboveFrame(this.bottomLeft, this.rightDir);
        return i >= 3 && i <= 21 ? i : 0;
    }
    private int getDistanceUntilEdgeAboveFrame(BlockPos pos, Direction direction) {
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        for (int i = 0; i <= 21; i++) {
            blockpos$mutableblockpos.set(pos).move(direction, i);
            BlockState blockstate = this.level.getBlockState(blockpos$mutableblockpos);
            if (!isEmpty(blockstate)) {
                if (FRAME.test(blockstate, this.level, blockpos$mutableblockpos)) {
                    return i;
                }
                break;
            }
            BlockState blockstate1 = this.level.getBlockState(blockpos$mutableblockpos.move(Direction.DOWN));
            if (!FRAME.test(blockstate1, this.level, blockpos$mutableblockpos)) {
                break;
            }
        }
        return 0;
    }
    private int calculateHeight() {
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        int i = this.getDistanceUntilTop(blockpos$mutableblockpos);
        return i >= 4 && i <= 21 && this.hasTopFrame(blockpos$mutableblockpos, i) ? i : 0;
    }
    private boolean hasTopFrame(BlockPos.MutableBlockPos pos, int distanceToTop) {
        for (int i = 0; i < this.width; i++) {
            BlockPos.MutableBlockPos blockpos$mutableblockpos = pos.set(this.bottomLeft).move(Direction.UP, distanceToTop).move(this.rightDir, i);
            if (!FRAME.test(this.level.getBlockState(blockpos$mutableblockpos), this.level, blockpos$mutableblockpos)) {
                return false;
            }
        }
        return true;
    }
    private int getDistanceUntilTop(BlockPos.MutableBlockPos pos) {
        for (int i = 0; i < 21; i++) {
            pos.set(this.bottomLeft).move(Direction.UP, i).move(this.rightDir, -1);
            if (!FRAME.test(this.level.getBlockState(pos), this.level, pos)) {
                return i;
            }

            pos.set(this.bottomLeft).move(Direction.UP, i).move(this.rightDir, this.width);
            if (!FRAME.test(this.level.getBlockState(pos), this.level, pos)) {
                return i;
            }

            for (int j = 0; j < this.width; j++) {
                pos.set(this.bottomLeft).move(Direction.UP, i).move(this.rightDir, j);
                BlockState blockstate = this.level.getBlockState(pos);
                if (!isEmpty(blockstate)) {
                    return i;
                }

                if (blockstate.is(NoxernaBlocks.NOXERNA_PORTAL)) {
                    this.numPortalBlocks++;
                }
            }
        }

        return 21;
    }
    private static boolean isEmpty(BlockState state) {
        return state.isAir() || state.is(BlockTags.FIRE) || state.is(NoxernaBlocks.NOXERNA_PORTAL);
    }
    public boolean isValid() {
        return this.bottomLeft != null && this.width >= 2 && this.width <= 21 && this.height >= 3 && this.height <= 21;
    }
    public void createPortalBlocks() {
        BlockState blockstate = NoxernaBlocks.NOXERNA_PORTAL.get().defaultBlockState().setValue(NoxernaPortalBlock.AXIS, this.axis);
        BlockPos.betweenClosed(this.bottomLeft, this.bottomLeft.relative(Direction.UP, this.height - 1).relative(this.rightDir, this.width - 1))
                .forEach(pos -> this.level.setBlock(pos, blockstate, 18));
    }
    public boolean isComplete() {
        return this.isValid() && this.numPortalBlocks == this.width * this.height;
    }
    public static Vec3 getRelativePosition(BlockUtil.FoundRectangle pFoundRectangle, Direction.Axis pAxis, Vec3 pPos, EntityDimensions pEntityDimensions) {
        double d0 = (double)pFoundRectangle.axis1Size - (double)pEntityDimensions.width();
        double d1 = (double)pFoundRectangle.axis2Size - (double)pEntityDimensions.height();
        BlockPos blockpos = pFoundRectangle.minCorner;
        double d2;
        if (d0 > 0.0) {
            double d3 = (double)blockpos.get(pAxis) + (double)pEntityDimensions.width() / 2.0;
            d2 = Mth.clamp(Mth.inverseLerp(pPos.get(pAxis) - d3, 0.0, d0), 0.0, 1.0);
        } else {
            d2 = 0.5;
        }

        double d5;
        if (d1 > 0.0) {
            Direction.Axis direction$axis = Direction.Axis.Y;
            d5 = Mth.clamp(Mth.inverseLerp(pPos.get(direction$axis) - (double)blockpos.get(direction$axis), 0.0, d1), 0.0, 1.0);
        } else {
            d5 = 0.0;
        }

        Direction.Axis direction$axis1 = pAxis == Direction.Axis.X ? Direction.Axis.Z : Direction.Axis.X;
        double d4 = pPos.get(direction$axis1) - ((double)blockpos.get(direction$axis1) + 0.5);
        return new Vec3(d2, d5, d4);
    }
    public static Vec3 findCollisionFreePosition(Vec3 pPos, ServerLevel pLevel, Entity pEntity, EntityDimensions pDimensions) {
        if (!(pDimensions.width() > 4.0F) && !(pDimensions.height() > 4.0F)) {
            double d0 = (double)pDimensions.height() / 2.0;
            Vec3 vec3 = pPos.add(0.0, d0, 0.0);
            VoxelShape voxelshape = Shapes.create(
                    AABB.ofSize(vec3, (double)pDimensions.width(), 0.0, (double)pDimensions.width()).expandTowards(0.0, 1.0, 0.0).inflate(1.0E-6)
            );
            Optional<Vec3> optional = pLevel.findFreePosition(
                    pEntity, voxelshape, vec3, (double)pDimensions.width(), (double)pDimensions.height(), (double)pDimensions.width()
            );
            Optional<Vec3> optional1 = optional.map(p_259019_ -> p_259019_.subtract(0.0, d0, 0.0));
            return optional1.orElse(pPos);
        } else {
            return pPos;
        }
    }
}
