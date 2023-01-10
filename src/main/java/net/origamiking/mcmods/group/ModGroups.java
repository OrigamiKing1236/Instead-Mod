package net.origamiking.mcmods.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.Insteadmain;
import net.origamiking.mcmods.blocks.instone.MineralBlocks;
import net.origamiking.mcmods.item.ModItems;

public class ModGroups {
    private static final ItemGroup INSTEAD_GROUP = FabricItemGroup.builder(new Identifier(Insteadmain.MOD_ID, "instead_group"))
            .displayName(Text.literal("Instead Blocks"))
            .icon(() -> new ItemStack(MineralBlocks.FOOLS_GOLD_BLOCK))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(MineralBlocks.FOOLS_GOLD_BLOCK);
                entries.add(MineralBlocks.FOOLS_GOLD_ORE);
                entries.add(MineralBlocks.SAPHIRE_BLOCK);
                entries.add(MineralBlocks.SAPHIRE_ORE);
            })
            .build();
    private static final ItemGroup INSTEAD_GROUP2 = FabricItemGroup.builder(new Identifier(Insteadmain.MOD_ID, "instead_group2"))
            .displayName(Text.literal("Instead Items"))
            .icon(() -> new ItemStack(ModItems.FOOLS_GOLD_INGOT))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
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
