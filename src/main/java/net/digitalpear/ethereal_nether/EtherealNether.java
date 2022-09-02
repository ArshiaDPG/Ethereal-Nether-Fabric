package net.digitalpear.ethereal_nether;

import net.digitalpear.ethereal_nether.init.ENBlocks;
import net.digitalpear.ethereal_nether.init.ENConfiguredFeatures;
import net.fabricmc.api.ModInitializer;

public class EtherealNether implements ModInitializer {

    public static final String MOD_ID = "ethereal_nether";

    public static String id(String name){
        return MOD_ID + ":" + name;
    }
    @Override
    public void onInitialize() {
        ENBlocks.init();
        ENConfiguredFeatures.init();

    }
}
