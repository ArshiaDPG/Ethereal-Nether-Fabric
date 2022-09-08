package net.digitalpear.ethereal_nether.init.sets;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.digitalpear.ethereal_nether.common.blocks.SoilNyliumBlock;
import net.digitalpear.ethereal_nether.common.blocks.WartCapBlock;
import net.digitalpear.ethereal_nether.init.sounds.ENBlockSoundGroups;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

public record ENetherWoodset(String name, MapColor topColor) {

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





    public static Block createSoilNylium(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name() + "_nylium", new SoilNyliumBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL).sounds(ENBlockSoundGroups.SOIL_NYLIUM).mapColor(woodset.topColor)), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createPlanks(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name() + "_planks", new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS).mapColor(woodset.topColor)), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createStairs(ENetherWoodset woodset, Block baseBlock){
        return createBlockWithItem(woodset.name() + "_stairs", new StairsBlock(baseBlock.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS).mapColor(woodset.topColor)), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createSlab(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name() + "_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_SLAB).mapColor(woodset.topColor)), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createHypahe(ENetherWoodset woodset, boolean stripped){
        return createBlockWithItem(stripped ? "stripped_" + woodset.name() + "_hyphae" : woodset.name() + "_hyphae", new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, stripped ? woodset.topColor() : MapColor.DARK_CRIMSON)
                .strength(2.0F).sounds(ENBlockSoundGroups.SOUL_STEM)), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createStem(ENetherWoodset woodset, boolean stripped){
        return createBlockWithItem(stripped ? "stripped_" + woodset.name() + "_stem" : woodset.name() + "_stem", new PillarBlock(AbstractBlock.Settings.of(Material.WOOD,
                        (state) -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? woodset.topColor : stripped ? woodset.topColor : MapColor.DARK_CRIMSON)
                .strength(2.0F).sounds(ENBlockSoundGroups.SOUL_STEM)), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createButton(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name + "_button", new WoodenButtonBlock(AbstractBlock.Settings.copy(Blocks.WARPED_BUTTON)), ItemGroup.REDSTONE);
    }
    public static Block createPressurePlate(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name + "_pressure_plate", new WoodenButtonBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PRESSURE_PLATE).mapColor(woodset.topColor())), ItemGroup.REDSTONE);
    }
    public static Block createRoots(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name() + "_roots", new RootsBlock(AbstractBlock.Settings.copy(Blocks.WARPED_ROOTS).mapColor(woodset.topColor()).sounds(ENBlockSoundGroups.SOUL_ROOTS)), ItemGroup.DECORATIONS);
    }
    public static Block createPottedRoots(ENetherWoodset woodset, Block baseBlock){
        return createBlockWithoutItem("potted_"+ woodset.name()+ "_roots", new FlowerPotBlock(baseBlock, AbstractBlock.Settings.copy(Blocks.POTTED_WARPED_ROOTS).mapColor(woodset.topColor())));
    }
    public static Block createSprouts(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name()+ "_sprouts", new SproutsBlock(AbstractBlock.Settings.copy(Blocks.NETHER_SPROUTS).mapColor(woodset.topColor()).sounds(ENBlockSoundGroups.SOUL_SPROUTS)), ItemGroup.DECORATIONS);
    }
    public static Block createDoor(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name()+ "_door", new DoorBlock(AbstractBlock.Settings.copy(Blocks.WARPED_DOOR).mapColor(woodset.topColor())), ItemGroup.REDSTONE);
    }
    public static Block createTrapdoor(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name()+ "_trapdoor", new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.WARPED_TRAPDOOR).mapColor(woodset.topColor())), ItemGroup.REDSTONE);
    }
    public static Block createWartCap(ENetherWoodset woodset, TagKey<Block> insiderBlocks){
        return createBlockWithItem(woodset.name() + "_wart_cap", new WartCapBlock(insiderBlocks, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK).sounds(ENBlockSoundGroups.SOUL_WART).mapColor(woodset.topColor())), ItemGroup.DECORATIONS);
    }
    public static Block createSpottedWartCap(ENetherWoodset woodset, TagKey<Block> insiderBlocks){
        return createBlockWithItem("spotted_" + woodset.name() + "_wart_cap", new WartCapBlock(insiderBlocks, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK).sounds(ENBlockSoundGroups.SOUL_WART).mapColor(woodset.topColor()).luminance((state) -> 10)), ItemGroup.DECORATIONS);
    }
    public static Block createFence(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name()+ "_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.WARPED_FENCE).mapColor(woodset.topColor())), ItemGroup.DECORATIONS);
    }
    public static Block createFenceGate(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name()+ "_fence_gate", new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.WARPED_FENCE_GATE).mapColor(woodset.topColor())), ItemGroup.REDSTONE);
    }
    public static Block createShroomlight(ENetherWoodset woodset){
        return createBlockWithItem(woodset.name()+ "_shroomlight", new Block(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT).sounds(ENBlockSoundGroups.SOUL_SHROOMLIGHT).luminance((state) -> 10).mapColor(woodset.topColor())), ItemGroup.DECORATIONS);
    }
}
