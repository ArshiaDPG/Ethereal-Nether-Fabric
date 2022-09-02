package net.digitalpear.ethereal_nether.init.sounds;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ENBlockSoundGroups {

    public static final BlockSoundGroup SOUL_WART = new BlockSoundGroup(1.0F, 1.0F,
            ENSoundEvents.SOUL_WART_BREAK,
            ENSoundEvents.SOUL_WART_STEP, SoundEvents.ITEM_NETHER_WART_PLANT,
            SoundEvents.BLOCK_STONE_HIT, SoundEvents.BLOCK_STONE_FALL);


    public static final BlockSoundGroup SOUL_STEM = new BlockSoundGroup(1.0F, 1.0F,
            ENSoundEvents.SOUL_STEM_BREAK,
            ENSoundEvents.SOUL_STEM_STEP, SoundEvents.BLOCK_STEM_PLACE,
            SoundEvents.BLOCK_STEM_HIT, SoundEvents.BLOCK_STEM_FALL);

    public static final BlockSoundGroup SOUL_SPROUTS = new BlockSoundGroup(1.0F, 1.0F,
            ENSoundEvents.SOUL_SPROUTS_BREAK,
            ENSoundEvents.SOUL_SPROUTS_STEP, SoundEvents.BLOCK_NETHER_SPROUTS_PLACE,
            SoundEvents.BLOCK_NETHER_SPROUTS_HIT, SoundEvents.BLOCK_NETHER_SPROUTS_FALL);

    public static final BlockSoundGroup SOUL_SHROOMLIGHT = new BlockSoundGroup(1.0F, 1.0F,
            ENSoundEvents.SOUL_SHROOMLIGHT_BREAK,
            ENSoundEvents.SOUL_SHROOMLIGHT_STEP, SoundEvents.BLOCK_SHROOMLIGHT_PLACE,
            SoundEvents.BLOCK_SHROOMLIGHT_HIT, SoundEvents.BLOCK_SHROOMLIGHT_FALL);

    public static final BlockSoundGroup SOUL_FUNGUS = new BlockSoundGroup(1.0F, 1.0F,
            ENSoundEvents.SOUL_FUNGUS_BREAK,
            SoundEvents.BLOCK_FUNGUS_STEP, SoundEvents.BLOCK_FUNGUS_PLACE,
            SoundEvents.BLOCK_FUNGUS_HIT, SoundEvents.BLOCK_FUNGUS_FALL);

    public static final BlockSoundGroup SOIL_NYLIUM = new BlockSoundGroup(1.0F, 1.0F,
            ENSoundEvents.SOIL_NYLIUM_BREAK,
            ENSoundEvents.SOIL_NYLIUM_STEP,
            SoundEvents.BLOCK_SOUL_SOIL_PLACE, SoundEvents.BLOCK_SOUL_SOIL_HIT, SoundEvents.BLOCK_SOUL_SOIL_FALL);

    public static final BlockSoundGroup SOUL_ROOTS = new BlockSoundGroup(1.0F, 1.0F,
            ENSoundEvents.SOUL_ROOTS_BREAK,
            ENSoundEvents.SOUL_ROOTS_STEP, SoundEvents.BLOCK_ROOTS_PLACE,
            SoundEvents.BLOCK_ROOTS_HIT, SoundEvents.BLOCK_ROOTS_FALL);


}
