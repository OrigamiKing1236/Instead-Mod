package net.origamiking.mcmods.instead.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.origamiking.mcmods.instead.blocks.instone.InstoneBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(InstoneBlocks.INSTONE);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(InstoneBlocks.INSTONE);
//        getOrCreateTagBuilder(BlockTags.WALLS)

//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
    }
}
