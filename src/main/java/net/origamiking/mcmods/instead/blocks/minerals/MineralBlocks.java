package net.origamiking.mcmods.instead.blocks.minerals;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.origamiking.mcmods.instead.blocks.ModBlocks;

public class MineralBlocks extends ModBlocks {
    public static final Block FOOLS_GOLD_BLOCK = registerBlock("fools_gold_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block SAPHIRE_BLOCK = registerBlock("saphire_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));
    public static final Block SAPHIRE_ORE = registerBlock("saphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block FOOLS_GOLD_ORE = registerBlock("fools_gold_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block ENERGY_BLOCK = registerBlock("energy_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));
    public static final Block COMPRESSED_ENERGY_BLOCK = registerBlock("compressed_energy_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));
    public static final Block INSTONE_COAL_ORE = registerBlock("instone_coal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_IRON_ORE = registerBlock("instone_iron_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_GOLD_ORE = registerBlock("instone_gold_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_REDSTONE_ORE = registerBlock("instone_redstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_LAPIS_ORE = registerBlock("instone_lapis_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_DIAMOND_ORE = registerBlock("instone_diamond_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_COPPER_ORE = registerBlock("instone_copper_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_SAPHIRE_ORE = registerBlock("instone_saphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_EMERALD_ORE = registerBlock("instone_emerald_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_ENERGY_ORE = registerBlock("instone_energy_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block STONE_ENERGY_ORE = registerBlock("stone_energy_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_ENERGY_ORE = registerBlock("deepslate_energy_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block INSTONE_FOOLS_GOLD_ORE = registerBlock("instone_fools_gold_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),UniformIntProvider.create(3, 7)));
    public static final Block RAW_FOOLS_GOLD_BLOCK = registerBlock("raw_fools_gold_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));
    public static final Block CRYSTAL_BLOCK = registerBlock("crystal_block", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4.0f).requiresTool()));

    public static void get() {}
}
