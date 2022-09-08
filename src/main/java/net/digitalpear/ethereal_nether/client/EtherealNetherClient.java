package net.digitalpear.ethereal_nether.client;

import net.digitalpear.ethereal_nether.init.ENBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class EtherealNetherClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.CORRUPTING_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.CORRUPTING_VINES_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.BLEEDING_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.BLEEDING_VINES_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.TAINTED_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.SANGUINATED_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.TAINTED_FUNGUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.SANGUINATED_FUNGUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.TAINTED_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.SANGUINATED_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.TAINTED_SPROUT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.SANGUINATED_SPROUT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.TAINTED_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.SANGUINATED_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.POTTED_TAINTED_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.POTTED_SANGUINATED_ROOTS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ENBlocks.SOUL_GLASS, RenderLayer.getTranslucent());
    }
}
