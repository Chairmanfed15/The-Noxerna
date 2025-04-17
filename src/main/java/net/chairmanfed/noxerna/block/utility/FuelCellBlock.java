package net.chairmanfed.noxerna.block.utility;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FuelCellBlock extends DirectionalBlock implements SimpleWaterloggedBlock {
    public static final MapCodec<FuelCellBlock> CODEC = simpleCodec(FuelCellBlock::new);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape EAST_AABB = Block.box(0.0,5.0,5.0,8.0,11.0,11.0);
    protected static final VoxelShape WEST_AABB = Block.box(8.0,5.0,5.0,16.0,11.0,11.0);
    protected static final VoxelShape SOUTH_AABB = Block.box(5.0,5.0,0.0,11.0,11.0,8.0);
    protected static final VoxelShape NORTH_AABB = Block.box(5.0,5.0,8.0,11.0,11.0,16.0);
    protected static final VoxelShape UP_AABB = Block.box(5.0,0.0,5.0,11.0,8.0,11.0);
    protected static final VoxelShape DOWN_AABB = Block.box(5.0,8.0,5.0,11.0,16.0,11.0);

    @Override
    public MapCodec<FuelCellBlock> codec() {
        return CODEC;
    }

    public FuelCellBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(
                this.getStateDefinition().any()
                        .setValue(FACING, Direction.UP)
                        .setValue(WATERLOGGED, Boolean.valueOf(false))
        );
    }

    @Override
    protected VoxelShape getShape(
            BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        switch ((Direction)blockState.getValue(FACING)) {
            case DOWN:
                return DOWN_AABB;
            case UP:
            default:
                return UP_AABB;
            case NORTH:
                return NORTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
                return EAST_AABB;
        }
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        boolean flag = fluidstate.getType() == Fluids.WATER;
        return this.defaultBlockState()
                .setValue(FACING, context.getClickedFace())
                .setValue(WATERLOGGED, Boolean.valueOf(flag));
    }
    protected BlockState updateShape(
            BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos
    ) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }
        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }
    @Override
    protected boolean isPathfindable(BlockState pState, PathComputationType pPathComputationType) {
        return false;
    }
}
