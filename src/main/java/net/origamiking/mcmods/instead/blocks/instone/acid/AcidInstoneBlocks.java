package net.origamiking.mcmods.instead.blocks.instone.acid;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.origamiking.mcmods.instead.blocks.ModBlocks;

public class AcidInstoneBlocks extends ModBlocks {
    public static final Block ACID_INSTONE_BRICKS = registerBlock("acid_instone_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));
    public static final Block ACID_INSTONE = registerBlock("acid_instone", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));


    public static void get() {}
}
