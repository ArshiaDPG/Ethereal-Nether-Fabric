package net.digitalpear.ethereal_nether.init;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.digitalpear.ethereal_nether.common.blocks.SoilNyliumBlock;
import net.digitalpear.ethereal_nether.common.blocks.SoulFungusBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.BleedingVinesBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.BleedingVinesPlantBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.CorruptingVinesBlock;
import net.digitalpear.ethereal_nether.common.blocks.vines.CorruptingVinesPlantBlock;
import net.digitalpear.ethereal_nether.init.sounds.ENBlockSoundGroups;
import net.digitalpear.ethereal_nether.init.tags.ENBlockTags;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

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

    public static final ENWoodset SANGUINATED = new ENWoodset("sanguinated", MapColor.SPRUCE_BROWN);
    public static final ENWoodset TAINTED = new ENWoodset("tainted", MapColor.LAPIS_BLUE);

    /*
        TAINTED
    */
    public static final Block TAINTED_STEM = ENWoodset.createStem(TAINTED, false);
    public static final Block STRIPPED_TAINTED_STEM = ENWoodset.createStem(TAINTED, true);
    public static final Block TAINTED_HYPHAE = ENWoodset.createHypahe(TAINTED, false);
    public static final Block STRIPPED_TAINTED_HYPHAE = ENWoodset.createHypahe(TAINTED, true);
    public static final Block TAINTED_NYLIUM = ENWoodset.createSoilNylium(TAINTED);
    public static final Block TAINTED_PLANKS = ENWoodset.createPlanks(TAINTED);
    public static final Block TAINTED_STAIRS = ENWoodset.createStairs(TAINTED, TAINTED_PLANKS);
    public static final Block TAINTED_SLAB = ENWoodset.createSlab(TAINTED);
    public static final Block TAINTED_BUTTON = ENWoodset.createButton(TAINTED);
    public static final Block TAINTED_PRESSURE_PLATE = ENWoodset.createPressurePlate(TAINTED);
    public static final Block TAINTED_DOOR = ENWoodset.createDoor(TAINTED);
    public static final Block TAINTED_TRAPDOOR = ENWoodset.createTrapdoor(TAINTED);
    public static final Block TAINTED_ROOTS = ENWoodset.createRoots(TAINTED);
    public static final Block POTTED_TAINTED_ROOTS = ENWoodset.createPottedRoots(TAINTED, TAINTED_ROOTS);
    public static final Block TAINTED_SPROUT = ENWoodset.createSprouts(TAINTED);
    public static final Block TAINTED_WART_CAP = ENWoodset.createWartCap(TAINTED, ENBlockTags.TAINTED_WART_CAPS);
    public static final Block SPOTTED_TAINTED_WART_CAP = ENWoodset.createSpottedWartCap(TAINTED, ENBlockTags.TAINTED_WART_CAPS);
    public static final Block TAINTED_FENCE = ENWoodset.createFence(TAINTED);
    public static final Block TAINTED_FENCE_GATE = ENWoodset.createFenceGate(TAINTED);

    /*
        SANGUINATED
    */
    public static final Block SANGUINATED_STEM = ENWoodset.createStem(SANGUINATED, false);
    public static final Block STRIPPED_SANGUINATED_STEM = ENWoodset.createStem(SANGUINATED, true);
    public static final Block SANGUINATED_HYPHAE = ENWoodset.createHypahe(SANGUINATED, false);
    public static final Block STRIPPED_SANGUINATED_HYPHAE = ENWoodset.createHypahe(SANGUINATED, true);
    public static final Block SANGUINATED_NYLIUM = ENWoodset.createSoilNylium(SANGUINATED);
    public static final Block SANGUINATED_PLANKS = ENWoodset.createPlanks(SANGUINATED);
    public static final Block SANGUINATED_STAIRS = ENWoodset.createStairs(SANGUINATED, SANGUINATED_PLANKS);
    public static final Block SANGUINATED_SLAB = ENWoodset.createSlab(SANGUINATED);
    public static final Block SANGUINATED_BUTTON = ENWoodset.createButton(SANGUINATED);
    public static final Block SANGUINATED_PRESSURE_PLATE = ENWoodset.createPressurePlate(SANGUINATED);
    public static final Block SANGUINATED_DOOR = ENWoodset.createDoor(SANGUINATED);
    public static final Block SANGUINATED_TRAPDOOR = ENWoodset.createTrapdoor(SANGUINATED);
    public static final Block SANGUINATED_ROOTS = ENWoodset.createRoots(SANGUINATED);
    public static final Block POTTED_SANGUINATED_ROOTS = ENWoodset.createPottedRoots(SANGUINATED, SANGUINATED_ROOTS);
    public static final Block SANGUINATED_SPROUT = ENWoodset.createSprouts(SANGUINATED);
    public static final Block SANGUINATED_WART_CAP = ENWoodset.createWartCap(SANGUINATED, ENBlockTags.SANGUINATED_WART_CAPS);
    public static final Block SPOTTED_SANGUINATED_WART_CAP = ENWoodset.createSpottedWartCap(SANGUINATED, ENBlockTags.SANGUINATED_WART_CAPS);
    public static final Block SANGUINATED_FENCE = ENWoodset.createFence(SANGUINATED);
    public static final Block SANGUINATED_FENCE_GATE = ENWoodset.createFenceGate(SANGUINATED);
    public static final Block SANGUINATED_SHROOMLIGHT = ENWoodset.createShroomlight(SANGUINATED);


    public static final Block TAINTED_FUNGUS = createBlockWithItem(TAINTED.name()+ "_fungus",
            new SoulFungusBlock(AbstractBlock.Settings.copy(Blocks.WARPED_FUNGUS).sounds(ENBlockSoundGroups.SOUL_FUNGUS).mapColor(TAINTED.topColor()),
                    () -> ENConfiguredFeatures.TAINTED_FUNGUS_PLANTED), ItemGroup.DECORATIONS);

    public static final Block SANGUINATED_FUNGUS = createBlockWithItem(SANGUINATED.name()+ "_fungus",
            new SoulFungusBlock(AbstractBlock.Settings.copy(Blocks.WARPED_FUNGUS).sounds(ENBlockSoundGroups.SOUL_FUNGUS).mapColor(SANGUINATED.topColor()),
                    () -> ENConfiguredFeatures.SANGUINATED_FUNGUS_PLANTED), ItemGroup.DECORATIONS);

    public static final Block BLEEDING_VINES = createBlockWithItem("bleeding_vines", new BleedingVinesBlock(AbstractBlock.Settings.of(Material.PLANT, TAINTED.topColor()).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)), ItemGroup.DECORATIONS);
    public static final Block BLEEDING_VINES_PLANT = createBlockWithoutItem("bleeding_vines_plant", new BleedingVinesPlantBlock(AbstractBlock.Settings.of(Material.PLANT, TAINTED.topColor()).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)));
    public static final Block CORRUPTING_VINES = createBlockWithItem("corrupting_vines", new CorruptingVinesBlock(AbstractBlock.Settings.of(Material.PLANT, SANGUINATED.topColor()).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)), ItemGroup.DECORATIONS);
    public static final Block CORRUPTING_VINES_PLANT = createBlockWithoutItem("corrupting_vines_plant", new CorruptingVinesPlantBlock(AbstractBlock.Settings.of(Material.PLANT, SANGUINATED.topColor()).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)));



    public static void init(){
        StrippableBlockRegistry.register(TAINTED_STEM, STRIPPED_TAINTED_STEM);
        StrippableBlockRegistry.register(SANGUINATED_STEM, STRIPPED_SANGUINATED_STEM);

        StrippableBlockRegistry.register(TAINTED_HYPHAE, STRIPPED_TAINTED_HYPHAE);
        StrippableBlockRegistry.register(SANGUINATED_HYPHAE, STRIPPED_SANGUINATED_HYPHAE);
    }
}
