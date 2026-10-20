package net.drew.diagonal_leaves.mixin.accesswidener;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;

//? if <1.21.11 {
/*import net.minecraft.world.level.LevelAccessor;
*///?}
//? if >=1.21.11 {

import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;

//?}

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(LeavesBlock.class)
public interface ILeavesBlockAW {
    @Invoker("updateShape")
    //? if < 1.21.11 {
    /*BlockState invokeUpdateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2);
    *///?}
    //? if >= 1.21.11 {
    
    BlockState invokeUpdateShape(
        final BlockState state,
        final LevelReader level,
        final ScheduledTickAccess tickAccess,
        final BlockPos pos,
        final Direction directionToNeighbour,
        final BlockPos neighbourPos, BlockState neighbourState,
        final RandomSource random
    );
    
    //?}
}
