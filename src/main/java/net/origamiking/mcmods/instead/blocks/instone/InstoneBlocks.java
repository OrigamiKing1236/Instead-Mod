package net.origamiking.mcmods.instead.blocks.instone;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.origamiking.mcmods.instead.blocks.ModBlocks;

public class InstoneBlocks extends ModBlocks {
    public static final Block INSTONE = registerBlock("instone", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));
    public static final Block INSTONE_BRICKS = registerBlock("instone_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));
    public static final Block INSTONE_STAIR = registerBlock("instone_stair", new StairsBlock(INSTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));
    public static final Block INSTONE_SLAB = registerBlock("instone_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));
    public static final Block INSTONE_BRICK_WALL = registerBlock("instone_brick_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));
    public static final Block INSTONE_BRICK_STAIR = registerBlock("instone_brick_stair", new StairsBlock(INSTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));
    public static final Block INSTONE_BRICK_SLAB = registerBlock("instone_brick_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));



    public static void get() {}
}
