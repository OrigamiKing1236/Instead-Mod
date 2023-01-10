package net.origamiking.mcmods.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.Insteadmain;
import net.origamiking.mcmods.entity.ModEntities;

public class ModItems {
    public static final Item FOOLS_GOLD_INGOT = registerItem("fools_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item SAPHIRE_GEM = registerItem("saphire_gem", new Item(new Item.Settings()));
    public static final Item RAW_FOOLS_GOLD = registerItem("raw_fools_gold", new Item(new Item.Settings()));
    public static final Item ENERGY_INGOT = registerItem("energy_ingot", new Item(new Item.Settings()));
    public static final Item LIVING_ENERGY_STAR = registerItem("living_energy_star", new Item(new Item.Settings()));
    public static final Item SAPHIRE_ROD = registerItem("saphire_rod", new Item(new Item.Settings()));
    public static final Item MALACHITE_NUGGET = registerItem("malachite_nugget", new Item(new Item.Settings()));
    public static final Item FOOLS_GOLD_NUGGET = registerItem("fools_gold_nugget", new Item(new Item.Settings()));
    public static final Item CRYSTAL_POWDER = registerItem("crystal_powder", new Item(new Item.Settings()));
    public static final Item SAPHITHER_SPAWN_EGG = new SpawnEggItem(ModEntities.SAPHITHER, 12895428, 11382189, new Item.Settings());
    public static final Item SAPHIRE_PICKAXE = registerItem("saphire_pickaxe", new PickaxeItem(ModToolMaterial.SAPHIRE, 3, 2f,new FabricItemSettings()));
    public static final Item SAPHIRE_SWORD = registerItem("saphire_sword", new SwordItem(ModToolMaterial.SAPHIRE, 3, 1f, new FabricItemSettings()));
    public static final Item SAPHIRE_SHOVEL = registerItem("saphire_shovel", new ShovelItem(ModToolMaterial.SAPHIRE, 2, 1f,new FabricItemSettings()));
    public static final Item SAPHIRE_AXE = registerItem("saphire_axe", new AxeItem(ModToolMaterial.SAPHIRE, 4, 0.5f,new FabricItemSettings()));
    public static final Item SAPHIRE_HOE = registerItem("saphire_hoe", new HoeItem(ModToolMaterial.SAPHIRE, 2, 2f,new FabricItemSettings()));

    public static final Item SAPHIRE_HELMET = registerItem("saphire_helmet", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.HEAD,new FabricItemSettings()));
    public static final Item SAPHIRE_CHESTPLATE = registerItem("saphire_chestplate", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.CHEST,new FabricItemSettings()));
    public static final Item SAPHIRE_LEGGINGS = registerItem("saphire_leggings", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.LEGS,new FabricItemSettings()));
    public static final Item SAPHIRE_BOOTS = registerItem("saphire_boots", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.FEET,new FabricItemSettings()));
    public static final Item INWOOD_APPLE = registerItem("inwood_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build())));



    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Insteadmain.MOD_ID, name), item);
    }
    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("instead", "saphither_spawn_egg"), ModItems.SAPHITHER_SPAWN_EGG);

    }
}
