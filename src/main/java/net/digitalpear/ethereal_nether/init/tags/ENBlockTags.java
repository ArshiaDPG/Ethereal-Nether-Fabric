package net.digitalpear.ethereal_nether.init.tags;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ENBlockTags {
    public static final TagKey<Block> TAINTED_WART_CAPS = of("tainted_wart_caps");
    public static final TagKey<Block> SANGUINATED_WART_CAPS = of("sanguinated_wart_caps");


    private static TagKey<Block> of(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(EtherealNether.MOD_ID, id));
    }
}
