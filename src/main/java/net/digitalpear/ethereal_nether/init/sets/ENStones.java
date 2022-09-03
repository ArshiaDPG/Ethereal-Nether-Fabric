package net.digitalpear.ethereal_nether.init.sets;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public record ENStones(String name, MapColor topColor, AbstractBlock.Settings properties) {
    public static BlockItem createBlockItem(String blockID, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(EtherealNether.MOD_ID, blockID), new BlockItem(block, new Item.Settings().group(group)));
    }

    public static Block createBlockWithItem(String blockID, Block block, ItemGroup group){
        createBlockItem(blockID, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(EtherealNether.MOD_ID, blockID), block);
    }
    public static Block createBlockWithoutItem(String blockID, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(EtherealNether.MOD_ID, blockID), block);
    }
    public static Block createBricksBlock(ENStones stone){
        return createBlockWithItem(stone.name + "_bricks", new Block(stone.properties), ItemGroup.BUILDING_BLOCKS);
    }

    public static Block createCobbledBlock(ENStones stone){
        return createBlockWithItem(stone.name, new Block(stone.properties), ItemGroup.BUILDING_BLOCKS);
    }

    public static Block createBrickStairsAndSlab(ENStones stone, Block baseBlock){
        createBlockWithItem(stone.name + "_brick_slab", new SlabBlock(stone.properties), ItemGroup.BUILDING_BLOCKS);
        return createBlockWithItem(stone.name + "_brick_stairs", new StairsBlock(baseBlock.getDefaultState(), stone.properties), ItemGroup.BUILDING_BLOCKS);
    }

    public static Block createCobbledStairsAndSlab(ENStones stone, Block baseBlock){
        createBlockWithItem(stone.name + "_slab", new SlabBlock(stone.properties), ItemGroup.BUILDING_BLOCKS);
        return createBlockWithItem(stone.name + "_stairs", new StairsBlock(baseBlock.getDefaultState(), stone.properties), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createStoneWallBlock(ENStones stone){
        return createBlockWithItem(stone.name + "_wall", new WallBlock(stone.properties), ItemGroup.DECORATIONS);
    }
    public static Block createChiseledBlock(ENStones stone){
        return createBlockWithItem("chiseled_" + stone.name, new Block(stone.properties), ItemGroup.DECORATIONS);
    }
}
