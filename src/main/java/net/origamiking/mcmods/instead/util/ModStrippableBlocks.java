package net.origamiking.mcmods.instead.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.origamiking.mcmods.instead.blocks.woods.inwood.InwoodBlocks;
import net.origamiking.mcmods.instead.blocks.woods.petrified.PetrifiedBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(InwoodBlocks.INWOOD_STEM, InwoodBlocks.STRIPPED_INWOOD_STEM);
        StrippableBlockRegistry.register(InwoodBlocks.INWOOD_WOOD, InwoodBlocks.STRIPPED_INWOOD_WOOD);

        StrippableBlockRegistry.register(PetrifiedBlocks.PETRIFIED_LOG, PetrifiedBlocks.STRIPPED_PETRIFIED_LOG);
        StrippableBlockRegistry.register(PetrifiedBlocks.PETRIFIED_WOOD,PetrifiedBlocks.STRIPPED_PETRIFIED_WOOD);
    }
}
