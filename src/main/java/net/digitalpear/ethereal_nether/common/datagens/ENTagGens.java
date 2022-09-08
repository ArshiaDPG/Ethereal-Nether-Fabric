package net.digitalpear.ethereal_nether.common.datagens;

import net.digitalpear.ethereal_nether.EtherealNether;
import net.digitalpear.ethereal_nether.init.ENBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ENTagGens extends FabricTagProvider<Item> {
    /**
     * Construct a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided. For example @see BlockTagProvider
     *
     * @param dataGenerator The data generator instance
     * @param registry      The backing registry for the Tag type.
     */
    public ENTagGens(FabricDataGenerator dataGenerator, Registry<Item> registry) {
        super(dataGenerator, registry);
    }

    public static TagKey<Item> createItemTag(String name){
        return TagKey.of(Registry.ITEM_KEY, new Identifier(EtherealNether.MOD_ID + ":" + name));
    }
    public static TagKey<Block> createBlockTag(String name){
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(EtherealNether.MOD_ID + ":" + name));
    }

    public static TagKey<Block> BLOCK_TAINTED_STEMS = createBlockTag("stainted_stems");
    public static TagKey<Item> ITEM_TAINTED_STEMS = createItemTag("stainted_stems");
    public static final TagKey<Block> BLOCK_TAINTED_WART_CAPS = createBlockTag("tainted_wart_caps");
    public static final TagKey<Block> BLOCK_SANGUINATED_WART_CAPS = createBlockTag("sanguinated_wart_caps");

    public static TagKey<Block> BLOCK_SOUL_SANDSTONES = createBlockTag("soul_sandstones");


    @Override
    protected void generateTags() {

        getOrCreateTagBuilder(ITEM_TAINTED_STEMS)
                .add(ENBlocks.TAINTED_STEM.asItem())
                .add(ENBlocks.STRIPPED_TAINTED_STEM.asItem())
                .add(ENBlocks.TAINTED_HYPHAE.asItem())
                .add(ENBlocks.STRIPPED_TAINTED_HYPHAE.asItem());



    }
}
