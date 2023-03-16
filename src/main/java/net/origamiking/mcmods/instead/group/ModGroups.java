package net.origamiking.mcmods.instead.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.blocks.instone.InstoneBlocks;
import net.origamiking.mcmods.instead.blocks.instone.acid.AcidInstoneBlocks;
import net.origamiking.mcmods.instead.blocks.minerals.MineralBlocks;
import net.origamiking.mcmods.instead.blocks.other.OtherBlocks;
import net.origamiking.mcmods.instead.blocks.woods.inwood.InwoodBlocks;
import net.origamiking.mcmods.instead.blocks.woods.petrified.PetrifiedBlocks;
import net.origamiking.mcmods.instead.fluid.ModFluids;
import net.origamiking.mcmods.instead.item.ModItems;

public class ModGroups {
    private static final ItemGroup INSTEAD_GROUP = FabricItemGroup.builder(new Identifier(Insteadmain.MOD_ID, "instead_group"))
            .displayName(Text.literal("Instead Blocks"))
            .icon(() -> new ItemStack(MineralBlocks.FOOLS_GOLD_BLOCK))
            .entries((context, entries) -> {
                entries.add(MineralBlocks.FOOLS_GOLD_BLOCK);
                entries.add(MineralBlocks.FOOLS_GOLD_ORE);
                entries.add(MineralBlocks.SAPHIRE_BLOCK);
                entries.add(MineralBlocks.SAPHIRE_ORE);
                entries.add(InstoneBlocks.INSTONE);
                entries.add(MineralBlocks.ENERGY_BLOCK);
                entries.add(MineralBlocks.COMPRESSED_ENERGY_BLOCK);
                entries.add(MineralBlocks.INSTONE_COAL_ORE);
                entries.add(MineralBlocks.INSTONE_IRON_ORE);
                entries.add(MineralBlocks.INSTONE_GOLD_ORE);
                entries.add(MineralBlocks.INSTONE_REDSTONE_ORE);
                entries.add(MineralBlocks.INSTONE_LAPIS_ORE);
                entries.add(MineralBlocks.INSTONE_DIAMOND_ORE);
                entries.add(MineralBlocks.INSTONE_COPPER_ORE);
                entries.add(MineralBlocks.INSTONE_SAPHIRE_ORE);
                entries.add(MineralBlocks.INSTONE_FOOLS_GOLD_ORE);
                entries.add(MineralBlocks.INSTONE_EMERALD_ORE);
                entries.add(MineralBlocks.INSTONE_ENERGY_ORE);
                entries.add(MineralBlocks.STONE_ENERGY_ORE);
                entries.add(MineralBlocks.DEEPSLATE_ENERGY_ORE);
                entries.add(MineralBlocks.RAW_FOOLS_GOLD_BLOCK);
                entries.add(InwoodBlocks.INWOOD_STEM);
                entries.add(InwoodBlocks.INWOOD_WOOD);
                entries.add(MineralBlocks.CRYSTAL_BLOCK);
                entries.add(OtherBlocks.DECAYED_MOSS_BLOCK);
                entries.add(InwoodBlocks.STRIPPED_INWOOD_STEM);
                entries.add(InwoodBlocks.STRIPPED_INWOOD_WOOD);
                entries.add(InwoodBlocks.INWOOD_PLANKS);
                entries.add(InwoodBlocks.INWOOD_LEAVES);
                entries.add(InstoneBlocks.INSTONE_BRICKS);
                entries.add(InstoneBlocks.INSTONE_SLAB);
                entries.add(InstoneBlocks.INSTONE_STAIR);
                entries.add(AcidInstoneBlocks.ACID_INSTONE);
                entries.add(AcidInstoneBlocks.ACID_INSTONE_BRICKS);
                entries.add(InwoodBlocks.INWOOD_PLANK_SLAB);
                entries.add(InwoodBlocks.INWOOD_PLANK_STAIR);
                entries.add(InwoodBlocks.INWOOD_BUTTON);
                entries.add(InwoodBlocks.INWOOD_PLATE);
                entries.add(InwoodBlocks.INWOOD_FENCE);
                entries.add(InwoodBlocks.INWOOD_FENCE_GATE);
                entries.add(InstoneBlocks.INSTONE_BRICK_WALL);
                entries.add(InstoneBlocks.INSTONE_BRICK_SLAB);
                entries.add(InstoneBlocks.INSTONE_BRICK_STAIR);
                entries.add(InwoodBlocks.INWOOD_SAPLING);
                entries.add(PetrifiedBlocks.PETRIFIED_SAPLING);
                entries.add(PetrifiedBlocks.PETRIFIED_LOG);
                entries.add(PetrifiedBlocks.PETRIFIED_WOOD);
                entries.add(PetrifiedBlocks.STRIPPED_PETRIFIED_LOG);
                entries.add(PetrifiedBlocks.STRIPPED_PETRIFIED_WOOD);
                entries.add(OtherBlocks.DEAD_GRASS);
                //entries.add(ModBlocks.ACID_INSTONE_STAIR);
                //entries.add(ModBlocks.ACID_INSTONE_SLAB);
                //entries.add(ModBlocks.ACID_INSTONE_BRICK_STAIR);
                //entries.add(ModBlocks.ACID_INSTONE_BRICK_SLAB);
            })
            .build();
    private static final ItemGroup INSTEAD_GROUP2 = FabricItemGroup.builder(new Identifier(Insteadmain.MOD_ID, "instead_group2"))
            .displayName(Text.literal("Instead Items"))
            .icon(() -> new ItemStack(ModItems.FOOLS_GOLD_INGOT))
            .entries((context, entries) -> {
                entries.add(ModItems.FOOLS_GOLD_INGOT);
                entries.add(ModItems.RAW_FOOLS_GOLD);
                entries.add(ModItems.FOOLS_GOLD_NUGGET);
                entries.add(ModItems.SAPHIRE_GEM);
                entries.add(ModItems.SAPHIRE_ROD);
                entries.add(ModItems.ENERGY_INGOT);
                entries.add(ModItems.LIVING_ENERGY_STAR);
                entries.add(ModItems.CRYSTAL_POWDER);
//                entries.add(ModFluids.ACID_BUCKET);
                entries.add(ModItems.SAPHITHER_SPAWN_EGG);
                entries.add(ModItems.SAPHIRE_SWORD);
                entries.add(ModItems.SAPHIRE_PICKAXE);
                entries.add(ModItems.SAPHIRE_SHOVEL);
                entries.add(ModItems.SAPHIRE_AXE);
                entries.add(ModItems.SAPHIRE_HOE);
                entries.add(ModItems.SAPHIRE_HELMET);
                entries.add(ModItems.SAPHIRE_CHESTPLATE);
                entries.add(ModItems.SAPHIRE_LEGGINGS);
                entries.add(ModItems.SAPHIRE_BOOTS);
                entries.add(ModItems.INWOOD_APPLE);
            }).build();
    public static void registerGroups() {}
}
