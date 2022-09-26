package net.digitalpear.ethereal_nether.init.tags;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ENItemTags {
    public static TagKey<Item> createItemTag(String name){
        return TagKey.of(Registry.ITEM_KEY, new Identifier(EtherealNether.MOD_ID + ":" + name));
    }


    public static TagKey<Item> ITEM_TAINTED_STEMS = createItemTag("stainted_stems");



}
