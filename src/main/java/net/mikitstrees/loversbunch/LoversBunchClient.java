package net.mikitstrees.loversbunch;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mikitstrees.loversbunch.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class LoversBunchClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUTTERCUP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BUTTERCUP, RenderLayer.getCutout());
    }
}
