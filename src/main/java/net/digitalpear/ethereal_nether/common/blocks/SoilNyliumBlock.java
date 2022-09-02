package net.digitalpear.ethereal_nether.common.blocks;

import net.digitalpear.ethereal_nether.init.ENBlocks;
import net.digitalpear.ethereal_nether.init.ENConfiguredFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.NetherConfiguredFeatures;

public class SoilNyliumBlock extends Block implements Fertilizable {
    public SoilNyliumBlock(Settings settings) {
        super(settings);
    }

    private static boolean stayAlive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
        return i < world.getMaxLightLevel();
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!stayAlive(state, world, pos)) {
            world.setBlockState(pos, Blocks.SOUL_SOIL.getDefaultState());
        }

    }

    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockState blockState = world.getBlockState(pos);
        BlockPos blockPos = pos.up();
        ChunkGenerator chunkGenerator = world.getChunkManager().getChunkGenerator();
        if (blockState.isOf(ENBlocks.TAINTED_NYLIUM)) {
            NetherConfiguredFeatures.CRIMSON_FOREST_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
        } else if (blockState.isOf(ENBlocks.SANGUINATED_NYLIUM)) {
            NetherConfiguredFeatures.WARPED_FOREST_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            if (random.nextInt(8) == 0) {
                NetherConfiguredFeatures.TWISTING_VINES_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            }
        }
    }
}