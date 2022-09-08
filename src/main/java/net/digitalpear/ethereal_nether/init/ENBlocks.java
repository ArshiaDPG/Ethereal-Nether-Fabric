package net.digitalpear.ethereal_nether.init;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.digitalpear.ethereal_nether.EtherealNether;
import net.digitalpear.ethereal_nether.common.blocks.SoilNyliumBlock;
import net.digitalpear.ethereal_nether.common.blocks.SoulFungusBlock;
import net.digitalpear.ethereal_nether.common.blocks.SoulGlassBlock;
import net.digitalpear.ethereal_nether.common.blocks.pots.CrimsonNetherBrickFlowerPotBlock;
import net.digitalpear.ethereal_nether.common.blocks.pots.NetherBrickFlowerPotBlock;
import net.digitalpear.ethereal_nether.common.blocks.pots.WarpedNetherBrickFlowerPotBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.BleedingVinesBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.BleedingVinesPlantBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.CorruptingVinesBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.CorruptingVinesPlantBlock;
import net.digitalpear.ethereal_nether.common.datagens.ENTagGens;
import net.digitalpear.ethereal_nether.init.sets.ENetherWoodset;
import net.digitalpear.ethereal_nether.init.sounds.ENBlockSoundGroups;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ENBlocks {



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

    private static PillarBlock createNetherStemBlock(MapColor topMapColor) {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD,
                (state) -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : MapColor.DARK_CRIMSON)
                .strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

    public static Block createSoilNylium(MapColor mapColor){
        return new SoilNyliumBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL).mapColor(mapColor));
    }

    private static PillarBlock createStrippedNetherStemBlock(MapColor topMapColor) {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, topMapColor).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }
    public static PressurePlateBlock createPressurePlateBlock(MapColor topMapColor){
        return new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(Blocks.WARPED_PRESSURE_PLATE).mapColor(topMapColor));
    }
    public static WoodenButtonBlock createButtonBlock(MapColor topMapColor){
        return new WoodenButtonBlock(AbstractBlock.Settings.copy(Blocks.WARPED_BUTTON).mapColor(topMapColor));
    }

    public static AbstractBlock.Settings createWoodBlock(Block baseBlock,MapColor mapColor){
        return AbstractBlock.Settings.copy(baseBlock).mapColor(mapColor);
    }
    public static AbstractBlock.Settings basaltMaterial(){
        return AbstractBlock.Settings.copy(Blocks.BASALT);
    }
    public static AbstractBlock.Settings blackstoneMaterial(){
        return AbstractBlock.Settings.copy(Blocks.BLACKSTONE);
    }

    public static final ENetherWoodset SANGUINATED = new ENetherWoodset("sanguinated", MapColor.SPRUCE_BROWN);
    public static final ENetherWoodset TAINTED = new ENetherWoodset("tainted", MapColor.LAPIS_BLUE);

    /*
        TAINTED
    */
    public static final Block TAINTED_STEM = ENetherWoodset.createStem(TAINTED, false);
    public static final Block STRIPPED_TAINTED_STEM = ENetherWoodset.createStem(TAINTED, true);
    public static final Block TAINTED_HYPHAE = ENetherWoodset.createHypahe(TAINTED, false);
    public static final Block STRIPPED_TAINTED_HYPHAE = ENetherWoodset.createHypahe(TAINTED, true);
    public static final Block TAINTED_NYLIUM = ENetherWoodset.createSoilNylium(TAINTED);
    public static final Block TAINTED_PLANKS = ENetherWoodset.createPlanks(TAINTED);
    public static final Block TAINTED_STAIRS = ENetherWoodset.createStairs(TAINTED, TAINTED_PLANKS);
    public static final Block TAINTED_SLAB = ENetherWoodset.createSlab(TAINTED);
    public static final Block TAINTED_BUTTON = ENetherWoodset.createButton(TAINTED);
    public static final Block TAINTED_PRESSURE_PLATE = ENetherWoodset.createPressurePlate(TAINTED);
    public static final Block TAINTED_DOOR = ENetherWoodset.createDoor(TAINTED);
    public static final Block TAINTED_TRAPDOOR = ENetherWoodset.createTrapdoor(TAINTED);
    public static final Block TAINTED_ROOTS = ENetherWoodset.createRoots(TAINTED);
    public static final Block POTTED_TAINTED_ROOTS = ENetherWoodset.createPottedRoots(TAINTED, TAINTED_ROOTS);
    public static final Block TAINTED_SPROUT = ENetherWoodset.createSprouts(TAINTED);
    public static final Block TAINTED_WART_CAP = ENetherWoodset.createWartCap(TAINTED, ENTagGens.BLOCK_TAINTED_WART_CAPS);
    public static final Block SPOTTED_TAINTED_WART_CAP = ENetherWoodset.createSpottedWartCap(TAINTED, ENTagGens.BLOCK_TAINTED_WART_CAPS);
    public static final Block TAINTED_FENCE = ENetherWoodset.createFence(TAINTED);
    public static final Block TAINTED_FENCE_GATE = ENetherWoodset.createFenceGate(TAINTED);

    /*
        SANGUINATED
    */
    public static final Block SANGUINATED_STEM = ENetherWoodset.createStem(SANGUINATED, false);
    public static final Block STRIPPED_SANGUINATED_STEM = ENetherWoodset.createStem(SANGUINATED, true);
    public static final Block SANGUINATED_HYPHAE = ENetherWoodset.createHypahe(SANGUINATED, false);
    public static final Block STRIPPED_SANGUINATED_HYPHAE = ENetherWoodset.createHypahe(SANGUINATED, true);
    public static final Block SANGUINATED_NYLIUM = ENetherWoodset.createSoilNylium(SANGUINATED);
    public static final Block SANGUINATED_PLANKS = ENetherWoodset.createPlanks(SANGUINATED);
    public static final Block SANGUINATED_STAIRS = ENetherWoodset.createStairs(SANGUINATED, SANGUINATED_PLANKS);
    public static final Block SANGUINATED_SLAB = ENetherWoodset.createSlab(SANGUINATED);
    public static final Block SANGUINATED_BUTTON = ENetherWoodset.createButton(SANGUINATED);
    public static final Block SANGUINATED_PRESSURE_PLATE = ENetherWoodset.createPressurePlate(SANGUINATED);
    public static final Block SANGUINATED_DOOR = ENetherWoodset.createDoor(SANGUINATED);
    public static final Block SANGUINATED_TRAPDOOR = ENetherWoodset.createTrapdoor(SANGUINATED);
    public static final Block SANGUINATED_ROOTS = ENetherWoodset.createRoots(SANGUINATED);
    public static final Block POTTED_SANGUINATED_ROOTS = ENetherWoodset.createPottedRoots(SANGUINATED, SANGUINATED_ROOTS);
    public static final Block SANGUINATED_SPROUT = ENetherWoodset.createSprouts(SANGUINATED);
    public static final Block SANGUINATED_WART_CAP = ENetherWoodset.createWartCap(SANGUINATED, ENTagGens.BLOCK_SANGUINATED_WART_CAPS);
    public static final Block SPOTTED_SANGUINATED_WART_CAP = ENetherWoodset.createSpottedWartCap(SANGUINATED, ENTagGens.BLOCK_SANGUINATED_WART_CAPS);
    public static final Block SANGUINATED_FENCE = ENetherWoodset.createFence(SANGUINATED);
    public static final Block SANGUINATED_FENCE_GATE = ENetherWoodset.createFenceGate(SANGUINATED);
    public static final Block SANGUINATED_SHROOMLIGHT = ENetherWoodset.createShroomlight(SANGUINATED);

    public static final Block TAINTED_FUNGUS = createBlockWithItem(TAINTED.name() + "_fungus",
            new SoulFungusBlock(AbstractBlock.Settings.copy(Blocks.WARPED_FUNGUS).sounds(ENBlockSoundGroups.SOUL_FUNGUS).mapColor(TAINTED.topColor()),
                    () -> ENConfiguredFeatures.TAINTED_FUNGUS_PLANTED), ItemGroup.DECORATIONS);
    public static final Block POTTED_TAINTED_FUNGUS = ENetherWoodset.createPottedFungus(TAINTED, TAINTED_FUNGUS);

    public static final Block SANGUINATED_FUNGUS = createBlockWithItem(SANGUINATED.name() + "_fungus",
            new SoulFungusBlock(AbstractBlock.Settings.copy(Blocks.WARPED_FUNGUS).sounds(ENBlockSoundGroups.SOUL_FUNGUS).mapColor(SANGUINATED.topColor()),
                    () -> ENConfiguredFeatures.SANGUINATED_FUNGUS_PLANTED), ItemGroup.DECORATIONS);
    public static final Block POTTED_SANGUINATED_FUNGUS = ENetherWoodset.createPottedFungus(SANGUINATED, SANGUINATED_FUNGUS);

    public static final Block BLEEDING_VINES = createBlockWithItem("bleeding_vines", new BleedingVinesBlock(AbstractBlock.Settings.of(Material.PLANT, TAINTED.topColor()).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)), ItemGroup.DECORATIONS);
    public static final Block BLEEDING_VINES_PLANT = createBlockWithoutItem("bleeding_vines_plant", new BleedingVinesPlantBlock(AbstractBlock.Settings.of(Material.PLANT, TAINTED.topColor()).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)));
    public static final Block CORRUPTING_VINES = createBlockWithItem("corrupting_vines", new CorruptingVinesBlock(AbstractBlock.Settings.of(Material.PLANT, SANGUINATED.topColor()).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)), ItemGroup.DECORATIONS);
    public static final Block CORRUPTING_VINES_PLANT = createBlockWithoutItem("corrupting_vines_plant", new CorruptingVinesPlantBlock(AbstractBlock.Settings.of(Material.PLANT, SANGUINATED.topColor()).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)));


    public static final Block COBBLED_BLACKSTONE = createBlockWithItem("cobbled_blackstone", new Block(blackstoneMaterial()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COBBLED_BLACKSTONE_STAIRS_AND_SLAB = createCobbledStairsAndSlab("cobbled_blackstone", blackstoneMaterial(), COBBLED_BLACKSTONE);
    public static final Block COBBLED_BLACKSTONE_WALL = createStoneWallBlock("cobbled_blackstone", blackstoneMaterial());
    public static final Block POLISHED_BLACKSTONE_PILLAR = createBlockWithItem("polished_blackstone_pillar", new PillarBlock(blackstoneMaterial()), ItemGroup.BUILDING_BLOCKS);

    public static final Block COBBLED_BASALT = createBlockWithItem("cobbled_basalt", new Block(basaltMaterial()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COBBLED_BASALT_STAIRS_AND_SLAB = createCobbledStairsAndSlab("cobbled_basalt", basaltMaterial(), COBBLED_BASALT);
    public static final Block COBBLED_BASALT_WALL = createStoneWallBlock("cobbled_basalt", basaltMaterial());

    public static final Block POLISHED_BASALT = createBlockWithItem("polished_basalt", new Block(basaltMaterial()), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_BASALT_STAIRS_AND_SLAB = createCobbledStairsAndSlab("polished_basalt", basaltMaterial(), POLISHED_BASALT);
    public static final Block POLISHED_BASALT_WALL = createStoneWallBlock("polished_basalt", basaltMaterial());

    public static final Block POLISHED_BASALT_BRICKS = createBlockWithItem("polished_basalt_bricks", new PillarBlock(basaltMaterial()), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_BASALT_BRICK_STAIRS_AND_SLAB = createCobbledStairsAndSlab("polished_basalt_brick", basaltMaterial(), POLISHED_BASALT_BRICKS);
    public static final Block POLISHED_BASALT_BRICK_WALL = createStoneWallBlock("polished_basalt_brick", basaltMaterial());



    public static final Block SOUL_SANDSTONE = createBlockWithItem("soul_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOUL_SANDSTONE_STAIRS = createBlockWithItem("soul_sandstone_stairs",
            new StairsBlock(SOUL_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOUL_SANDSTONE_SLAB = createBlockWithItem("soul_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOUL_SANDSTONE_WALL = createBlockWithItem("soul_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_SOUL_SANDSTONE = createBlockWithItem("cut_soul_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_SOUL_SANDSTONE_SLAB = createBlockWithItem("cut_soul_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_SOUL_SANDSTONE = createBlockWithItem("chiseled_soul_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SMOOTH_SOUL_SANDSTONE = createBlockWithItem("smooth_soul_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = createBlockWithItem("smooth_soul_sandstone_stairs",
            new StairsBlock(SOUL_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = createBlockWithItem("smooth_soul_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_SOUL_SANDSTONE_LAMP = createBlockWithItem("chiseled_soul_sandstone_lamp",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE).luminance((state) -> 10)), ItemGroup.DECORATIONS);

    public static final Block SOUL_GLASS = createBlockWithItem("soul_glass", new SoulGlassBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS)), ItemGroup.DECORATIONS);

    /*
        Nether Bricks
     */
    public static AbstractBlock.Settings netherBricks(){
        return AbstractBlock.Settings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS);
    }
    public static final Block NETHER_BRICK_PLATE = createBlockWithItem("nether_brick_plate", new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHER_BRICK_PILLAR = createBlockWithItem("nether_brick_pillar", new PillarBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_NETHER_BRICK_PLATE = createBlockWithItem("cut_nether_brick_plate", new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CRIMSON_NETHER_BRICK_PLATE = createBlockWithItem("crimson_nether_brick_plate", new Block(netherBricks().mapColor(MapColor.DARK_RED)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CRIMSON_NETHER_BRICK_PILLAR = createBlockWithItem("crimson_nether_brick_pillar", new PillarBlock(netherBricks().mapColor(MapColor.DARK_RED)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_CRIMSON_NETHER_BRICK_PLATE = createBlockWithItem("cut_crimson_nether_brick_plate", new Block(netherBricks().mapColor(MapColor.DARK_RED)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_CRIMSON_NETHER_BRICKS = createBlockWithItem("chiseled_crimson_nether_bricks", new Block(netherBricks().mapColor(MapColor.DARK_RED)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CRACKED_CRIMSON_NETHER_BRICKS = createBlockWithItem("cracked_crimson_nether_bricks", new Block(netherBricks().mapColor(MapColor.DARK_RED)), ItemGroup.BUILDING_BLOCKS);

    public static final Block WARPED_NETHER_BRICK_PLATE = createBlockWithItem("warped_nether_brick_plate", new Block(netherBricks().mapColor(MapColor.DARK_AQUA)), ItemGroup.BUILDING_BLOCKS);
    public static final Block WARPED_NETHER_BRICK_PILLAR = createBlockWithItem("warped_nether_brick_pillar", new PillarBlock(netherBricks().mapColor(MapColor.DARK_AQUA)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_WARPED_NETHER_BRICK_PLATE = createBlockWithItem("cut_warped_nether_brick_plate", new Block(netherBricks().mapColor(MapColor.DARK_AQUA)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_WARPED_NETHER_BRICKS = createBlockWithItem("chiseled_warped_nether_bricks", new Block(netherBricks().mapColor(MapColor.DARK_AQUA)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CRACKED_WARPED_NETHER_BRICKS = createBlockWithItem("cracked_warped_nether_bricks", new Block(netherBricks().mapColor(MapColor.DARK_AQUA)), ItemGroup.BUILDING_BLOCKS);

    public static final Block NETHER_BRICK_FLOWER_POT = createBlockWithItem("nether_brick_flower_pot", new NetherBrickFlowerPotBlock(Blocks.AIR, AbstractBlock.Settings.copy(Blocks.FLOWER_POT).mapColor(Blocks.NETHER_BRICKS.getDefaultMapColor())), ItemGroup.DECORATIONS);
    public static final Block CRIMSON_NETHER_BRICK_FLOWER_POT = createBlockWithItem("crimson_nether_brick_flower_pot", new CrimsonNetherBrickFlowerPotBlock(Blocks.AIR, AbstractBlock.Settings.copy(Blocks.FLOWER_POT).mapColor(Blocks.RED_NETHER_BRICKS.getDefaultMapColor())), ItemGroup.DECORATIONS);
    public static final Block WARPED_NETHER_BRICK_FLOWER_POT = createBlockWithItem("warped_nether_brick_flower_pot", new WarpedNetherBrickFlowerPotBlock(Blocks.AIR, AbstractBlock.Settings.copy(Blocks.FLOWER_POT).mapColor(Blocks.WARPED_WART_BLOCK.getDefaultMapColor())), ItemGroup.DECORATIONS);



    public static final Block POLISHED_OBSIDIAN = createBlockWithItem("polished_obsidian", new Block(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_OBSIDIAN_BRICKS = createBlockWithItem("polished_obsidian_bricks", new Block(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_OBSIDIAN_BRICK_STAIRS_AND_SLAB = createCobbledStairsAndSlab("polished_obsidian_brick", AbstractBlock.Settings.copy(Blocks.OBSIDIAN), POLISHED_OBSIDIAN_BRICKS);
    public static final Block POLISHED_OBSIDIAN_BRICK_WALL = createStoneWallBlock("polished_obsidian_brick", AbstractBlock.Settings.copy(Blocks.OBSIDIAN));

    public static final Block POLISHED_GLOWSTONE = createBlockWithItem("polished_glowstone", new Block(AbstractBlock.Settings.copy(Blocks.GLOWSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_GLOWSTONE_BRICKS = createBlockWithItem("polished_glowstone_bricks", new Block(AbstractBlock.Settings.copy(Blocks.GLOWSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_GLOWSTONE_BRICK_STAIRS_AND_SLAB = createCobbledStairsAndSlab("polished_glowstone_brick", AbstractBlock.Settings.copy(Blocks.GLOWSTONE), POLISHED_GLOWSTONE_BRICKS);
    public static final Block POLISHED_GLOWSTONE_BRICK_WALL = createStoneWallBlock("polished_glowstone_brick", AbstractBlock.Settings.copy(Blocks.GLOWSTONE));



    public static Block createCobbledStairsAndSlab(String name, AbstractBlock.Settings properties, Block baseBlock){
        createBlockWithItem(name + "_slab", new SlabBlock(properties), ItemGroup.BUILDING_BLOCKS);
        return createBlockWithItem(name + "_stairs", new StairsBlock(baseBlock.getDefaultState(), properties), ItemGroup.BUILDING_BLOCKS);
    }
    public static Block createStoneWallBlock(String name, AbstractBlock.Settings properties){
        return createBlockWithItem(name + "_wall", new WallBlock(properties), ItemGroup.DECORATIONS);
    }


    public static void init(){
        StrippableBlockRegistry.register(TAINTED_STEM, STRIPPED_TAINTED_STEM);
        StrippableBlockRegistry.register(SANGUINATED_STEM, STRIPPED_SANGUINATED_STEM);

        StrippableBlockRegistry.register(TAINTED_HYPHAE, STRIPPED_TAINTED_HYPHAE);
        StrippableBlockRegistry.register(SANGUINATED_HYPHAE, STRIPPED_SANGUINATED_HYPHAE);


        Registry.BLOCK.forEach(block -> {
            if ((block instanceof FlowerPotBlock) && ((FlowerPotBlock) block).getContent() != Blocks.AIR){
                createBlockWithoutItem("nether_brick_" + block.getTranslationKey().split("\\.")[2],
                        new NetherBrickFlowerPotBlock(((FlowerPotBlock) block).getContent(), AbstractBlock.Settings.copy(NETHER_BRICK_FLOWER_POT)));
                createBlockWithoutItem("crimson_nether_brick_" + block.getTranslationKey().split("\\.")[2],
                        new CrimsonNetherBrickFlowerPotBlock(((FlowerPotBlock) block).getContent(), AbstractBlock.Settings.copy(CRIMSON_NETHER_BRICK_FLOWER_POT)));
                createBlockWithoutItem("warped_nether_brick_" + block.getTranslationKey().split("\\.")[2],
                        new WarpedNetherBrickFlowerPotBlock(((FlowerPotBlock) block).getContent(), AbstractBlock.Settings.copy(WARPED_NETHER_BRICK_FLOWER_POT)));
            }
        });
    }

}
