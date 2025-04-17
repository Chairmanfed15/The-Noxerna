package net.chairmanfed.noxerna.block.portal;

/* import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.chairmanfed.noxerna.registry.NoxernaDimension;
import net.minecraft.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Portal;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.portal.DimensionTransition;
import net.minecraft.world.level.portal.PortalShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.Optional;

public class NoxernaPortalBlock extends Block implements Portal {
    public static final MapCodec<NoxernaPortalBlock> CODEC = simpleCodec(NoxernaPortalBlock::new);
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.HORIZONTAL_AXIS;
    private static final Logger LOGGER = LogUtils.getLogger();
    protected static final int AABB_OFFSET = 2;
    protected static final VoxelShape X_AXIS_AABB = Block.box(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
    protected static final VoxelShape Z_AXIS_AABB = Block.box(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

    @Override
    public MapCodec<NoxernaPortalBlock> codec() {
        return codec();
    }

    public NoxernaPortalBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.X));
    }

    @Override
    protected VoxelShape getShape(
            BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
        switch ((Direction.Axis)blockState.getValue(AXIS)) {
            case Z:
                return Z_AXIS_AABB;
            case X:
            default:
                return X_AXIS_AABB;
        }
    }

    @Override
    protected BlockState updateShape(
            BlockState blockState, Direction facing, BlockState facingState, LevelAccessor level,
            BlockPos currentPos, BlockPos facingPos) {
        Direction.Axis direction$axis = facing.getAxis();
        Direction.Axis direction$axis1 = blockState.getValue(AXIS);
        boolean flag = direction$axis1 != direction$axis && direction$axis.isHorizontal();
        return !flag && !facingState.is(this) && !new PortalShape(level, currentPos, direction$axis1).isComplete()
                ? Blocks.AIR.defaultBlockState()
                : super.updateShape(blockState, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    protected void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity) {
        if (entity.canUsePortal(false)) {
            entity.setAsInsidePortal(this, blockPos);
        }
    }

    @Override
    public int getPortalTransitionTime(ServerLevel serverLevel, Entity entity) {
        return entity instanceof Player player
                ? Math.max(
                1,
                serverLevel.getGameRules()
                        .getInt(
                                player.getAbilities().invulnerable
                                        ? GameRules.RULE_PLAYERS_NETHER_PORTAL_CREATIVE_DELAY
                                        : GameRules.RULE_PLAYERS_NETHER_PORTAL_DEFAULT_DELAY
                        )
        )
                : 0;
    }
    @Nullable
    @Override
    public DimensionTransition getPortalDestination(ServerLevel serverLevel, Entity entity, BlockPos blockPos) {
        ResourceKey<Level> resourcekey = serverLevel.dimension() == NoxernaDimension.DIMENSION_KEY ? Level.OVERWORLD : NoxernaDimension.DIMENSION_KEY;
        ServerLevel serverlevel = serverLevel.getServer().getLevel(resourcekey);
        if (serverlevel == null) {
            return null;
        } else {
            boolean flag = serverlevel.dimension() == NoxernaDimension.DIMENSION_KEY;
            WorldBorder worldborder = serverlevel.getWorldBorder();
            double d0 = DimensionType.getTeleportationScale(serverLevel.dimensionType(), serverlevel.dimensionType());
            BlockPos blockpos = worldborder.clampToBounds(entity.getX() * d0, entity.getY(), entity.getZ() * d0);
            return this.getExitPortal(serverlevel, entity, blockPos, blockpos, flag, worldborder);
        }
    }

    @javax.annotation.Nullable
    private DimensionTransition getExitPortal(
            ServerLevel pLevel, Entity pEntity, BlockPos pPos, BlockPos pExitPos, boolean pIsNether, WorldBorder pWorldBorder
    ) {
        Optional<BlockPos> optional = pLevel.getPortalForcer().findClosestPortalPosition(pExitPos, pIsNether, pWorldBorder);
        BlockUtil.FoundRectangle blockutil$foundrectangle;
        DimensionTransition.PostDimensionTransition dimensiontransition$postdimensiontransition;
        if (optional.isPresent()) {
            BlockPos blockpos = optional.get();
            BlockState blockstate = pLevel.getBlockState(blockpos);
            blockutil$foundrectangle = BlockUtil.getLargestRectangleAround(
                    blockpos,
                    blockstate.getValue(BlockStateProperties.HORIZONTAL_AXIS),
                    21,
                    Direction.Axis.Y,
                    21,
                    p_351970_ -> pLevel.getBlockState(p_351970_) == blockstate
            );
            dimensiontransition$postdimensiontransition = DimensionTransition.PLAY_PORTAL_SOUND.then(p_351967_ -> p_351967_.placePortalTicket(blockpos));
        } else {
            Direction.Axis direction$axis = pEntity.level().getBlockState(pPos).getOptionalValue(AXIS).orElse(Direction.Axis.X);
            Optional<BlockUtil.FoundRectangle> optional1 = pLevel.getPortalForcer().createPortal(pExitPos, direction$axis);
            if (optional1.isEmpty()) {
                LOGGER.error("Unable to create a portal, likely target out of worldborder");
                return null;
            }
            blockutil$foundrectangle = optional1.get();
            dimensiontransition$postdimensiontransition = DimensionTransition.PLAY_PORTAL_SOUND.then(DimensionTransition.PLACE_PORTAL_TICKET);
        }
        return getDimensionTransitionFromExit(pEntity, pPos, blockutil$foundrectangle, pLevel, dimensiontransition$postdimensiontransition);
    }
}
*/