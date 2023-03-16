package net.origamiking.mcmods.instead.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.blocks.instone.InstoneBlocks;
import net.origamiking.mcmods.instead.blocks.instone.acid.AcidInstoneBlocks;
import net.origamiking.mcmods.instead.blocks.minerals.MineralBlocks;
import net.origamiking.mcmods.instead.blocks.other.OtherBlocks;
import net.origamiking.mcmods.instead.blocks.woods.inwood.InwoodBlocks;
import net.origamiking.mcmods.instead.blocks.woods.petrified.PetrifiedBlocks;

public class ModBlocks {
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Insteadmain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Insteadmain.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        MineralBlocks.get();
        InstoneBlocks.get();
        InwoodBlocks.get();
        OtherBlocks.get();
        AcidInstoneBlocks.get();
        PetrifiedBlocks.get();
    }
}
