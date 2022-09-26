package net.digitalpear.ethereal_nether.init;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ENItems {
    public static Item createBoatItem(BoatEntity.Type type) {
        return new BoatItem(false, type, new Item.Settings().maxCount(1).group(ItemGroup.TRANSPORTATION));
    }
    public static Item createChestBoatItem(BoatEntity.Type type) {
        return new BoatItem(true, type, new Item.Settings().maxCount(1).group(ItemGroup.TRANSPORTATION));
    }

    public static Item createSignItem(Block sign, Block wall_sign) {
        return new SignItem(new FabricItemSettings().maxCount(16).group(ItemGroup.DECORATIONS), sign, wall_sign);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EtherealNether.MOD_ID, name), item);
    }
    public static final Item TAINTED_SIGN = registerItem(ENBlocks.TAINTED.name() + "_sign", createSignItem(ENBlocks.TAINTED_SIGN, ENBlocks.TAINTED_WALL_SIGN));
    public static final Item CALLERY_SIGN = registerItem(  ENBlocks.SANGUINATED.name() + "_sign", createSignItem(ENBlocks.SANGUINATED_SIGN, ENBlocks.SANGUINATED_WALL_SIGN));


    public static void init(){

    }
}
