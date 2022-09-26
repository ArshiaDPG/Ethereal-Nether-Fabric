package net.digitalpear.ethereal_nether.init.sounds;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


@SuppressWarnings("unused")
public class ENSoundEvents {
    public static final SoundEvent SOUL_FUNGUS_BREAK = createSound("block.ethereal_nether.soul_fungus_break");

    public static final SoundEvent SOIL_NYLIUM_BREAK = createSound("block.ethereal_nether.soil_nylium_break");
    public static final SoundEvent SOIL_NYLIUM_STEP = createSound("block.ethereal_nether.soil_nylium_step");

    public static final SoundEvent SOUL_ROOTS_BREAK = createSound("block.ethereal_nether.soul_roots_break");
    public static final SoundEvent SOUL_ROOTS_STEP = createSound("block.ethereal_nether.soul_roots_step");

    public static final SoundEvent SOUL_SHROOMLIGHT_BREAK = createSound("block.ethereal_nether.soul_shroomlight_break");
    public static final SoundEvent SOUL_SHROOMLIGHT_STEP = createSound("block.ethereal_nether.soul_shroomlight_step");

    public static final SoundEvent SOUL_SPROUTS_BREAK = createSound("block.ethereal_nether.soul_sprouts_break");
    public static final SoundEvent SOUL_SPROUTS_STEP = createSound("block.ethereal_nether.soul_sprouts_step");

    public static final SoundEvent SOUL_STEM_BREAK = createSound("block.ethereal_nether.soul_stem_break");
    public static final SoundEvent SOUL_STEM_STEP = createSound("block.ethereal_nether.soul_stem_step");
    public static final SoundEvent SOUL_WART_BREAK = createSound("block.ethereal_nether.soul_wart_break");
    public static final SoundEvent SOUL_WART_STEP = createSound("block.ethereal_nether.soul_wart_step");

    public static final SoundEvent SOUL_GLASS_STEP = createSound("block.ethereal_nether.soul_glass_step");
    public static final SoundEvent SOUL_GLASS_PLACE = createSound("block.ethereal_nether.soul_glass_place");
    public static final SoundEvent SOUL_GLASS_BREAK = createSound("block.ethereal_nether.soul_glass_break");

    public static final SoundEvent SOUL_SANDSTONE_STEP = createSound("block.ethereal_nether.soul_sandstone_step");
    public static final SoundEvent SOUL_SANDSTONE_BREAK = createSound("block.ethereal_nether.soul_sandstone_break");


    public static final SoundEvent SOUL_FIRE_AMBIENT = createSound("block.ethereal_nether.soul_fire_ambient");



    public static SoundEvent createSound(String name){
        return Registry.register(Registry.SOUND_EVENT, new Identifier(EtherealNether.MOD_ID, name), new SoundEvent(new Identifier(EtherealNether.MOD_ID, name)));
    }
    public static void init(){

    }
}
