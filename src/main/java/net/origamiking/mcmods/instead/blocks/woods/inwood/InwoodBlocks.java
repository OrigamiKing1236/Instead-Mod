package net.origamiking.mcmods.instead.blocks.woods.inwood;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.SoundEvents;
import net.origamiking.mcmods.instead.blocks.ModBlocks;
import net.origamiking.mcmods.instead.world.feature.tree.InwoodSaplingGenerator;

public class InwoodBlocks extends ModBlocks {
    public static final Block INWOOD_STEM = registerBlock("inwood_stem", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block INWOOD_WOOD = registerBlock("inwood_wood", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_INWOOD_STEM = registerBlock("stripped_inwood_stem", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_INWOOD_WOOD = registerBlock("stripped_inwood_wood", new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block INWOOD_PLANKS = registerBlock("inwood_planks", new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()));
    public static final Block INWOOD_LEAVES = registerBlock("inwood_leaves", new LeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block INWOOD_PLANK_STAIR = registerBlock("inwood_plank_stair", new StairsBlock(INWOOD_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()));
    public static final Block INWOOD_PLANK_SLAB = registerBlock("inwood_plank_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()));
    public static final Block INWOOD_BUTTON = registerBlock("inwood_button", new ButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().noCollision(), 20, true, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON));
    public static final Block INWOOD_FENCE = registerBlock("inwood_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()));
    public static final Block INWOOD_FENCE_GATE = registerBlock("inwood_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool(), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN));
    public static final Block INWOOD_PLATE = registerBlock("inwood_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool(), SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON));
    public static final Block INWOOD_SAPLING = registerBlock("inwood_sapling", new SaplingBlock(new InwoodSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)));



    public static void get() {}
}
