package net.digitalpear.ethereal_nether.common.blocks;

import net.digitalpear.ethereal_nether.common.features.HugeSoulFungusFeatureConfig;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.HugeFungusFeatureConfig;

import java.util.function.Supplier;

public class SoulFungusBlock extends PlantBlock implements Fertilizable {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 9.0D, 12.0D);
    private static final double GROW_CHANCE = 0.4D;
    private final Supplier<RegistryEntry<ConfiguredFeature<HugeSoulFungusFeatureConfig, ?>>> feature;

    public SoulFungusBlock(Settings settings, Supplier<RegistryEntry<ConfiguredFeature<HugeSoulFungusFeatureConfig, ?>>> feature) {
        super(settings);
        this.feature = feature;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.NYLIUM) || floor.isOf(Blocks.MYCELIUM) || floor.isOf(Blocks.SOUL_SOIL) || super.canPlantOnTop(floor, world, pos);
    }

    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        Block block = ((HugeSoulFungusFeatureConfig)((ConfiguredFeature)((RegistryEntry)this.feature.get()).value()).config()).validBaseBlock.getBlock();
        BlockState blockState = world.getBlockState(pos.down());
        return blockState.isOf(block);
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return (double)random.nextFloat() < GROW_CHANCE;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        ((ConfiguredFeature)((RegistryEntry)this.feature.get()).value()).generate(world, world.getChunkManager().getChunkGenerator(), random, pos);
    }
}
