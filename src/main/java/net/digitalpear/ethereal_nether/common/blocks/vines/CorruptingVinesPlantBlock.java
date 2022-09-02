package net.digitalpear.ethereal_nether.common.blocks.vines;

import net.digitalpear.ethereal_nether.init.ENBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class CorruptingVinesPlantBlock extends AbstractPlantBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public CorruptingVinesPlantBlock(Settings settings) {
        super(settings, Direction.UP, SHAPE, false);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ENBlocks.CORRUPTING_VINES;
    }
}
