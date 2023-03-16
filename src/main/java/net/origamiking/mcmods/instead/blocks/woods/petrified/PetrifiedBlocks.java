package net.origamiking.mcmods.instead.blocks.woods.petrified;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.origamiking.mcmods.instead.blocks.ModBlocks;
import net.origamiking.mcmods.instead.world.feature.tree.PetrifiedSaplingGenerator;

public class PetrifiedBlocks extends ModBlocks {
    public static final Block PETRIFIED_LOG = registerBlock("petrified_log", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block PETRIFIED_WOOD = registerBlock("petrified_wood", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_PETRIFIED_LOG = registerBlock("stripped_petrified_log", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_PETRIFIED_WOOD = registerBlock("stripped_petrified_wood", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block PETRIFIED_SAPLING = registerBlock("petrified_sapling", new SaplingBlock(new PetrifiedSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)));



    public static void get() {}
}
