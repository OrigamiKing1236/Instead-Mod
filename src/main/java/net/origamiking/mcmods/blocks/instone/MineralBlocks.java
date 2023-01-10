package net.origamiking.mcmods.blocks.instone;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.origamiking.mcmods.blocks.ModBlocks;

public class MineralBlocks extends ModBlocks {
    public static final Block FOOLS_GOLD_BLOCK = registerBlock("fools_gold_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block SAPHIRE_BLOCK = registerBlock("saphire_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));
    public static final Block SAPHIRE_ORE = registerBlock("saphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block FOOLS_GOLD_ORE = registerBlock("fools_gold_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));

    public static void get() {}
}
