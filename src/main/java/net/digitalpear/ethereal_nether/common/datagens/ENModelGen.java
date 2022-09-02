package net.digitalpear.ethereal_nether.common.datagens;

import net.digitalpear.ethereal_nether.init.ENBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import java.util.List;
import java.util.Map;

public class ENModelGen extends FabricModelProvider {
    public static List<Block> FULL_BLOCKS = List.of(ENBlocks.TAINTED_PLANKS, ENBlocks.SANGUINATED_PLANKS);
    public static List<Block> STEM_BLOCKS = List.of(ENBlocks.TAINTED_STEM, ENBlocks.STRIPPED_TAINTED_STEM, ENBlocks.SANGUINATED_STEM, ENBlocks.STRIPPED_SANGUINATED_STEM, ENBlocks.TAINTED_HYPHAE, ENBlocks.STRIPPED_TAINTED_HYPHAE, ENBlocks.SANGUINATED_HYPHAE, ENBlocks.STRIPPED_SANGUINATED_HYPHAE);
    public static Map<Block, Block> PLANT_BLOCKS = Map.of(ENBlocks.SANGUINATED_ROOTS, ENBlocks.TAINTED_ROOTS);
    public static List<Block> DOOR_BLOCKS = List.of(ENBlocks.SANGUINATED_DOOR, ENBlocks.TAINTED_DOOR);
    public static List<Block> TRAPDOOR_BLOCKS = List.of(ENBlocks.SANGUINATED_TRAPDOOR, ENBlocks.TAINTED_TRAPDOOR);
    public static List<Block> MUSHROOM_BLOCKS = List.of(ENBlocks.SANGUINATED_WART_CAP, ENBlocks.TAINTED_WART_CAP, ENBlocks.SPOTTED_SANGUINATED_WART_CAP, ENBlocks.SPOTTED_TAINTED_WART_CAP);
    public ENModelGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        FULL_BLOCKS.forEach(blockStateModelGenerator::registerSimpleCubeAll);
        STEM_BLOCKS.forEach(blockStateModelGenerator::registerLog);
        PLANT_BLOCKS.forEach(blockStateModelGenerator::registerRoots);
        DOOR_BLOCKS.forEach(blockStateModelGenerator::registerDoor);
        TRAPDOOR_BLOCKS.forEach(blockStateModelGenerator::registerTrapdoor);
        MUSHROOM_BLOCKS.forEach(blockStateModelGenerator::registerMushroomBlock);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
