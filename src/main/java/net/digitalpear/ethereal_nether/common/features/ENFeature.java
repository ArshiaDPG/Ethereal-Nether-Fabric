package net.digitalpear.ethereal_nether.common.features;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeFungusFeature;
import net.minecraft.world.gen.feature.HugeFungusFeatureConfig;

public class ENFeature {
    public static final Feature<HugeFungusFeatureConfig> HUGE_SOUL_FUNGUS = register("huge_soul_fungus", new HugeFungusFeature(HugeFungusFeatureConfig.CODEC));


    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registry.FEATURE, EtherealNether.MOD_ID + ":" + name, feature);
    }
}
