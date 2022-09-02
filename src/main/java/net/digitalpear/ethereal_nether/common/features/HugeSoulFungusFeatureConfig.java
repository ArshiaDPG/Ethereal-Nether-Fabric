package net.digitalpear.ethereal_nether.common.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.FeatureConfig;

public class HugeSoulFungusFeatureConfig implements FeatureConfig {
    public static final Codec<HugeSoulFungusFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(BlockState.CODEC.fieldOf("valid_base_block").forGetter((config) -> {
            return config.validBaseBlock;
        }), BlockState.CODEC.fieldOf("stem_state").forGetter((config) -> {
            return config.stemState;
        }), BlockState.CODEC.fieldOf("spotted_stem_state").forGetter((config) -> {
            return config.stemState;
        }), BlockState.CODEC.fieldOf("hat_state").forGetter((config) -> {
            return config.hatState;
        }), BlockState.CODEC.fieldOf("decor_state").forGetter((config) -> {
            return config.decorationState;
        }), Codec.BOOL.fieldOf("planted").orElse(false).forGetter((config) -> {
            return config.planted;
        })).apply(instance, HugeSoulFungusFeatureConfig::new);
    });
    public final BlockState validBaseBlock;
    public final BlockState stemState;
    public final BlockState spottedStemState;
    public final BlockState hatState;
    public final BlockState decorationState;
    public final boolean planted;

    public HugeSoulFungusFeatureConfig(BlockState validBaseBlock, BlockState stemState, BlockState spottedStemState, BlockState hatState, BlockState decorationState, boolean planted) {
        this.validBaseBlock = validBaseBlock;
        this.stemState = stemState;
        this.spottedStemState = spottedStemState;
        this.hatState = hatState;
        this.decorationState = decorationState;
        this.planted = planted;
    }
}