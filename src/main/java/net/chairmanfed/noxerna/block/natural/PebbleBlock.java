package net.chairmanfed.noxerna.block.natural;

import com.mojang.serialization.MapCodec;
import net.chairmanfed.noxerna.block.NoxernaBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class PebbleBlock extends Block implements SimpleWaterloggedBlock {
    public static final MapCodec<PebbleBlock> CODEC = simpleCodec(PebbleBlock::new);
    public static final int MAX_PEBBLES = 4;
    public static final IntegerProperty PEBBLES = NoxernaBlockStateProperties.PEBBLE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape ONE_AABB = Block.box(6.0, 0.0, 6.0, 10.0, 2.0, 10.0);
    protected static final VoxelShape TWO_AABB = Block.box(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);
    protected static final VoxelShape THREE_AABB = Block.box(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);
    protected static final VoxelShape FOUR_AABB = Block.box(1.0, 0.0, 1.0, 15.0, 4.0, 15.0);

    @Override
    public MapCodec<PebbleBlock> codec() {
        return CODEC;
    }

    public PebbleBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(
                this.getStateDefinition().any()
                        .setValue(PEBBLES, Integer.valueOf(1)).
                        setValue(WATERLOGGED, Boolean.valueOf(false))
        );
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockState = context.getLevel().getBlockState(context.getClickedPos());
        if (blockState.is(this)) {
            return blockState.setValue(PEBBLES, Integer.valueOf(Math.min(4, blockState.getValue(PEBBLES) + 1)));
        } else {
            FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
            boolean flag = fluidState.getType() == Fluids.WATER;
            return super.getStateForPlacement(context).setValue(WATERLOGGED, Boolean.valueOf(flag));
        }
    }
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return !blockState.getCollisionShape(blockGetter, blockPos).getFaceShape(Direction.UP).isEmpty() || blockState.isFaceSturdy(blockGetter, blockPos, Direction.UP);
    }
    @Override
    protected boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        BlockPos blockPos1 = blockPos.below();
        return this.mayPlaceOn(levelReader.getBlockState(blockPos1), levelReader, blockPos1);
    }
    @Override
    protected BlockState updateShape(BlockState blockState, Direction facing, BlockState facingState,
                                     LevelAccessor levelAccessor, BlockPos currentPos, BlockPos facingPos) {
        if (!blockState.canSurvive(levelAccessor, currentPos)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            if (blockState.getValue(WATERLOGGED)) {
                levelAccessor.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
            }
            return super.updateShape(blockState, facing, facingState, levelAccessor, currentPos, facingPos);
        }
    }
    @Override
    protected boolean canBeReplaced(BlockState blockState, BlockPlaceContext blockPlaceContext) {
        return !blockPlaceContext.isSecondaryUseActive() && blockPlaceContext.getItemInHand().is(this.asItem()) && blockState.getValue(PEBBLES) < 4
                ? true
                : super.canBeReplaced(blockState, blockPlaceContext);
    }
    @Override
    protected VoxelShape getShape(BlockState blockState, BlockGetter blockGetter,
                                  BlockPos blockPos, CollisionContext context) {
        switch (blockState.getValue(PEBBLES)) {
            case 1:
            default:
                return ONE_AABB;
            case 2:
                return TWO_AABB;
            case 3:
                return THREE_AABB;
            case 4:
                return FOUR_AABB;
        }
    }
    @Override
    protected FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PEBBLES, WATERLOGGED);
    }
    @Override
    protected boolean isPathfindable(BlockState pState, PathComputationType pPathComputationType) {
        return false;
    }
}
