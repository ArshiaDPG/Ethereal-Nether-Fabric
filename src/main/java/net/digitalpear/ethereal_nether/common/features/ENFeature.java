package net.digitalpear.ethereal_nether.common.features;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;

public class ENFeature {
    public static final Feature<HugeSoulFungusFeatureConfig> HUGE_SOUL_FUNGUS = register("huge_soul_fungus", new HugeSoulFungusFeature(HugeSoulFungusFeatureConfig.CODEC));
    public static final Feature<TwistingVinesFeatureConfig> CORRUPTING_VINES = register("corrupting_vines", new CorruptingVinesFeature(TwistingVinesFeatureConfig.CODEC));

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registry.FEATURE, EtherealNether.MOD_ID + ":" + name, feature);
    }
}
