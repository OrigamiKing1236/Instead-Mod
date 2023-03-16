package net.origamiking.mcmods.instead;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.blocks.woods.inwood.InwoodBlocks;
import net.origamiking.mcmods.instead.blocks.woods.petrified.PetrifiedBlocks;
import net.origamiking.mcmods.instead.entity.ModEntities;
import net.origamiking.mcmods.instead.entity.client.SaphitherRenderer;
import net.origamiking.mcmods.instead.fluid.ModFluids;

public class InsteadClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(InwoodBlocks.INWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InwoodBlocks.INWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PetrifiedBlocks.PETRIFIED_SAPLING, RenderLayer.getCutout());
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ACID, ModFluids.FLOWING_ACID,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1C4FF0E
                ));

//        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_ACID, ModFluids.FLOWING_ACID);
        EntityRendererRegistry.register(ModEntities.SAPHITHER, SaphitherRenderer::new);;
    }
}
