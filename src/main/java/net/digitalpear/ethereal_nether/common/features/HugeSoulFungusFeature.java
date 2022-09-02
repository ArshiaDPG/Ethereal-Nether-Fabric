package net.digitalpear.ethereal_nether.common.features;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class HugeSoulFungusFeature extends Feature<HugeSoulFungusFeatureConfig> {

    public HugeSoulFungusFeature(Codec<HugeSoulFungusFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<HugeSoulFungusFeatureConfig> context) {
        World world = context.getWorld().toServerWorld();
        BlockPos startPos = world.getSpawnPos();
        BlockState stem = context.getConfig().stemState;
        BlockState validSpawn = context.getConfig().validBaseBlock;
        Random random = context.getRandom();
        BlockPos newPos;



            for (int x = -1; x < 1; x++){
                for (int z = -1; z < 1; z++) {
                    for (int y = -1; y < 2; y++) {
                        newPos = startPos.add(x, y, z);
                        if ((world.getBlockState(newPos).isOf(validSpawn.getBlock()) || world.getBlockState(newPos).isOf(stem.getBlock())) && random.nextFloat() > 0.3) {
                            world.setBlockState(newPos, stem);
                        }
                    }
                }
            }
            newPos = startPos;
            for (int i = 0; i < random.nextBetween(7, 20); i++) {
                if (isReplaceable(world, newPos, true)) {
                    world.setBlockState(newPos, stem);
                    newPos = startPos.up(i);
                    if (random.nextFloat() > 0.4) {
                        placeShelfCap(world, context.getConfig(), newPos, random);
                    }
                }
                else{
                    generateHat(world, context.getConfig(), newPos, random);
                    break;
                }

            }

        return true;
    }
    private static boolean isReplaceable(WorldAccess world, BlockPos pos, boolean replacePlants) {
        return world.testBlockState(pos, (state) -> {
            Material material = state.getMaterial();
            return state.getMaterial().isReplaceable() || replacePlants && material == Material.PLANT;
        });
    }

    public static void placeShelfCap(World world,HugeSoulFungusFeatureConfig config, BlockPos startPos, Random random){
        for (int x = -1; x < 1; x++){
            for (int z = -1; z < 1; z++){
                if (random.nextBoolean()){
                    world.setBlockState(startPos.add(x, 0, z), random.nextBoolean() ? config.spottedStemState : config.hatState);
                }
            }
        }
    }
    public static void generateHat(World world,HugeSoulFungusFeatureConfig config, BlockPos startPos, Random random){
        for (int x = -5; x < 5; x++) {
            for (int z = -5; z < 5; z++) {
                world.setBlockState(startPos.add(x, 0, z), random.nextBoolean() ? config.spottedStemState : config.hatState);
            }
        }
    }
}
