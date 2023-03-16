package net.origamiking.mcmods.instead.blocks.other;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.origamiking.mcmods.instead.blocks.ModBlocks;

public class OtherBlocks extends ModBlocks {
    public static final Block DECAYED_MOSS_BLOCK = registerBlock("decayed_moss_block", new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(4.0f).requiresTool()));
    public static final Block DEAD_GRASS = registerBlock("dead_grass", new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(4.0f).requiresTool()));





    public static void get() {}
}
