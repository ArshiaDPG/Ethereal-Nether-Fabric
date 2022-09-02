package net.digitalpear.ethereal_nether.init;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.digitalpear.ethereal_nether.common.features.ENFeature;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeFungusFeatureConfig;


public class ENConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<HugeFungusFeatureConfig, ?>> TAINTED_FUNGUS = register("tainted_fungus",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeFungusFeatureConfig(
                    ENBlocks.TAINTED_NYLIUM.getDefaultState(),
                    ENBlocks.TAINTED_STEM.getDefaultState(),
                    ENBlocks.TAINTED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_TAINTED_WART_CAP.getDefaultState(), false));
    public static final RegistryEntry<ConfiguredFeature<HugeFungusFeatureConfig, ?>> TAINTED_FUNGUS_PLANTED = register("tainted_fungus_planted",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeFungusFeatureConfig(
                    ENBlocks.TAINTED_NYLIUM.getDefaultState(),
                    ENBlocks.TAINTED_STEM.getDefaultState(),
                    ENBlocks.TAINTED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_TAINTED_WART_CAP.getDefaultState(), true));

    public static final RegistryEntry<ConfiguredFeature<HugeFungusFeatureConfig, ?>> SANGUINATED_FUNGUS = register("sanguinated_fungus",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeFungusFeatureConfig(
                    ENBlocks.SANGUINATED_NYLIUM.getDefaultState(),
                    ENBlocks.SANGUINATED_STEM.getDefaultState(),
                    ENBlocks.SANGUINATED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_SANGUINATED_WART_CAP.getDefaultState(), false));
    public static final RegistryEntry<ConfiguredFeature<HugeFungusFeatureConfig, ?>> SANGUINATED_FUNGUS_PLANTED = register("sanguinated_fungus_planted",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeFungusFeatureConfig(
                    ENBlocks.SANGUINATED_NYLIUM.getDefaultState(),
                    ENBlocks.SANGUINATED_STEM.getDefaultState(),
                    ENBlocks.SANGUINATED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_SANGUINATED_WART_CAP.getDefaultState(), true));


//    public static final WeightedBlockStateProvider TAINTED_FOREST_VEGETATION_PROVIDER = new WeightedBlockStateProvider(DataPool.builder()
//            .add(ENBlocks.TAINTED_ROOTS.getDefaultState(), 85)
//            .add(ENBlocks.SANGUINATED_ROOTS.getDefaultState(), 1)
//            .add(ENBlocks.TAINTED_FUNGUS.getDefaultState(), 13)
//            .add(ENBlocks.SANGUINATED_FUNGUS.getDefaultState(), 1));
//
//
//    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> TAINTED_FOREST_VEGETATION =
//            register("tainted_forest_vegetation", Feature.NETHER_FOREST_VEGETATION,
//                    new NetherForestVegetationFeatureConfig(TAINTED_FOREST_VEGETATION_PROVIDER, 8, 4));
//
//    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> TAINTED_FOREST_VEGETATION_BONEMEAL =
//            register("tainted_forest_vegetation_bonemeal", Feature.NETHER_FOREST_VEGETATION,
//                    new NetherForestVegetationFeatureConfig(TAINTED_FOREST_VEGETATION_PROVIDER, 3, 1));


    public static <FC extends FeatureConfig, F extends Feature<FC>> RegistryEntry register(String id, F feature, FC config) {
        return BuiltinRegistries.addCasted(BuiltinRegistries.CONFIGURED_FEATURE, EtherealNether.MOD_ID + ":" + id, new ConfiguredFeature(feature, config));
    }

    public static void init(){
    }
}
