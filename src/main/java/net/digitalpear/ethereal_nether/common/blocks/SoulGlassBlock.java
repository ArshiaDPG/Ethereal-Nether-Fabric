package net.digitalpear.ethereal_nether.common.blocks;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class SoulGlassBlock extends AbstractGlassBlock {
    public SoulGlassBlock(Settings settings) {
        super(settings);
    }

    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }
}