package net.digitalpear.ethereal_nether.init.tags;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ENBlockTags {
    public static TagKey<Block> createBlockTag(String name){
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(EtherealNether.MOD_ID + ":" + name));
    }

    public static TagKey<Block> createItemBlockTag(String name){
        TagKey.of(Registry.ITEM_KEY, new Identifier(EtherealNether.MOD_ID + ":" + name));
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(EtherealNether.MOD_ID + ":" + name));
    }

    public static final TagKey<Block> BLOCK_TAINTED_WART_CAPS = createBlockTag("tainted_wart_caps");
    public static final TagKey<Block> BLOCK_SANGUINATED_WART_CAPS = createBlockTag("sanguinated_wart_caps");
    public static TagKey<Block> BLOCK_TAINTED_STEMS = createItemBlockTag("stainted_stems");
    public static TagKey<Block> BLOCK_SOUL_SANDSTONES = createItemBlockTag("soul_sandstones");
}
