package net.origamiking.mcmods;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.origamiking.mcmods.entity.ModEntities;
import net.origamiking.mcmods.entity.client.SaphitherRenderer;

public class InsteadClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.SAPHITHER, SaphitherRenderer::new);;

    }
}
