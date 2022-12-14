package net.digitalpear.ethereal_nether.init;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.digitalpear.ethereal_nether.common.features.ENFeature;
import net.digitalpear.ethereal_nether.common.features.HugeSoulFungusFeatureConfig;
import net.minecraft.block.BlockState;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;


public class ENConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<HugeSoulFungusFeatureConfig, ?>> TAINTED_FUNGUS = register("tainted_fungus",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeSoulFungusFeatureConfig(
                    ENBlocks.TAINTED_NYLIUM.getDefaultState(),
                    ENBlocks.TAINTED_STEM.getDefaultState(),
                    ENBlocks.TAINTED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_TAINTED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_TAINTED_WART_CAP.getDefaultState(), false));
    public static final RegistryEntry<ConfiguredFeature<HugeSoulFungusFeatureConfig, ?>> TAINTED_FUNGUS_PLANTED = register("tainted_fungus_planted",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeSoulFungusFeatureConfig(
                    ENBlocks.TAINTED_NYLIUM.getDefaultState(),
                    ENBlocks.TAINTED_STEM.getDefaultState(),
                    ENBlocks.TAINTED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_TAINTED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_TAINTED_WART_CAP.getDefaultState(), true));

    public static final RegistryEntry<ConfiguredFeature<HugeSoulFungusFeatureConfig, ?>> SANGUINATED_FUNGUS = register("sanguinated_fungus",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeSoulFungusFeatureConfig(
                    ENBlocks.SANGUINATED_NYLIUM.getDefaultState(),
                    ENBlocks.SANGUINATED_STEM.getDefaultState(),
                    ENBlocks.SANGUINATED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_SANGUINATED_WART_CAP.getDefaultState(),
                    ENBlocks.SANGUINATED_SHROOMLIGHT.getDefaultState(), false));

    public static final RegistryEntry<ConfiguredFeature<HugeSoulFungusFeatureConfig, ?>> SANGUINATED_FUNGUS_PLANTED = register("sanguinated_fungus_planted",
            ENFeature.HUGE_SOUL_FUNGUS, new HugeSoulFungusFeatureConfig(
                    ENBlocks.SANGUINATED_NYLIUM.getDefaultState(),
                    ENBlocks.SANGUINATED_STEM.getDefaultState(),
                    ENBlocks.SANGUINATED_WART_CAP.getDefaultState(),
                    ENBlocks.SPOTTED_SANGUINATED_WART_CAP.getDefaultState(),
                    ENBlocks.SANGUINATED_SHROOMLIGHT.getDefaultState(), true));


    public static final WeightedBlockStateProvider TAINTED_FOREST_VEGETATION_PROVIDER = new WeightedBlockStateProvider(DataPool.<BlockState>builder()
            .add(ENBlocks.TAINTED_ROOTS.getDefaultState(), 85)
            .add(ENBlocks.SANGUINATED_ROOTS.getDefaultState(), 1)
            .add(ENBlocks.TAINTED_FUNGUS.getDefaultState(), 13)
            .add(ENBlocks.SANGUINATED_FUNGUS.getDefaultState(), 1));


    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> TAINTED_FOREST_VEGETATION =
            register("tainted_forest_vegetation", Feature.NETHER_FOREST_VEGETATION,
                    new NetherForestVegetationFeatureConfig(TAINTED_FOREST_VEGETATION_PROVIDER, 8, 4));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> TAINTED_FOREST_VEGETATION_BONEMEAL =
            register("tainted_forest_vegetation_bonemeal", Feature.NETHER_FOREST_VEGETATION,
                    new NetherForestVegetationFeatureConfig(TAINTED_FOREST_VEGETATION_PROVIDER, 3, 1));

    public static final WeightedBlockStateProvider SANGUINATED_FOREST_VEGETATION_PROVIDER = new WeightedBlockStateProvider(DataPool.<BlockState>builder()
            .add(ENBlocks.SANGUINATED_ROOTS.getDefaultState(), 85)
            .add(ENBlocks.TAINTED_ROOTS.getDefaultState(), 1)
            .add(ENBlocks.SANGUINATED_FUNGUS.getDefaultState(), 13)
            .add(ENBlocks.TAINTED_FUNGUS.getDefaultState(), 1));


    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> SANGUINATED_FOREST_VEGETATION =
            register("sanguinated_forest_vegetation", Feature.NETHER_FOREST_VEGETATION,
                    new NetherForestVegetationFeatureConfig(SANGUINATED_FOREST_VEGETATION_PROVIDER, 8, 4));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> SANGUINATED_FOREST_VEGETATION_BONEMEAL =
            register("sanguinated_forest_vegetation_bonemeal", Feature.NETHER_FOREST_VEGETATION,
                    new NetherForestVegetationFeatureConfig(SANGUINATED_FOREST_VEGETATION_PROVIDER, 3, 1));


    public static final RegistryEntry<ConfiguredFeature<TwistingVinesFeatureConfig, ?>> CORRUPTING_VINES = register("corrupting_vines", ENFeature.CORRUPTING_VINES, new TwistingVinesFeatureConfig(8, 4, 8));
    public static final RegistryEntry<ConfiguredFeature<TwistingVinesFeatureConfig, ?>> CORRUPTING_VINES_BONEMEAL = register("corrupting_vines_bonemeal", ENFeature.CORRUPTING_VINES, new TwistingVinesFeatureConfig(3, 1, 2));


    public static <FC extends FeatureConfig, F extends Feature<FC>> RegistryEntry register(String id, F feature, FC config) {
        return BuiltinRegistries.addCasted(BuiltinRegistries.CONFIGURED_FEATURE, EtherealNether.MOD_ID + ":" + id, new ConfiguredFeature(feature, config));
    }

    public static void init(){
    }
}
