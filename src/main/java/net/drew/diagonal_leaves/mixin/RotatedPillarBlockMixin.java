package net.drew.diagonal_leaves.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.drew.diagonal_leaves.util.ModUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RotatedPillarBlock.class)
public class RotatedPillarBlockMixin extends BlockBehaviourMixin
{
    //? if < 1.21.11 {
    /*@Override
    protected void mixin$onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving, CallbackInfo ci) {
        if(state.is(BlockTags.LOGS)) ModUtils.updateBlocksDiagonally(newState, pos, level);
    }
    *///?}

    //? if >= 1.21.11 {
    
    @Override
    protected void mixin$affectNeighborsAfterRemoval(BlockState state, ServerLevel level, BlockPos pos, boolean movedByPiston, CallbackInfo ci) {
        ModUtils.updateBlocksDiagonally(state, pos, level);
    }
    
    //?}

    @Override
    protected void mixin$onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving, CallbackInfo ci) {
        if(state.is(BlockTags.LOGS)) ModUtils.updateBlocksDiagonally(state, pos, level);
    }
}
