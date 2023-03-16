package net.origamiking.mcmods.instead.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.origamiking.mcmods.instead.blocks.woods.inwood.InwoodBlocks;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry= FlammableBlockRegistry.getDefaultInstance();

        registry.add(InwoodBlocks.INWOOD_STEM, 5 ,5);
        registry.add(InwoodBlocks.INWOOD_WOOD, 5 ,5);
        registry.add(InwoodBlocks.STRIPPED_INWOOD_WOOD, 5 ,5);
        registry.add(InwoodBlocks.STRIPPED_INWOOD_STEM, 5 ,5);

        registry.add(InwoodBlocks.INWOOD_PLANKS, 5 ,20);
        registry.add(InwoodBlocks.INWOOD_LEAVES, 30 ,60);
    }
}
