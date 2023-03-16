/* 
Copyright 2022 Malachi Hernandez

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package net.origamiking.mcmods.instead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.entity.ModEntities;
import net.origamiking.mcmods.instead.items.custom.ModAxeItem;
import net.origamiking.mcmods.instead.items.custom.ModHoeItem;
import net.origamiking.mcmods.instead.items.custom.ModPickaxeItem;

public class ModItems {
    
    //public static final Item BOB = registerItem("bob", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item FOOLS_GOLD_INGOT = new Item(new Item.Settings());
	public static final Item SAPHIRE_GEM = new Item(new Item.Settings());
	public static final Item RAW_FOOLS_GOLD = new Item(new Item.Settings());
	public static final Item ENERGY_INGOT = new Item(new Item.Settings());
	public static final Item LIVING_ENERGY_STAR = new Item(new Item.Settings());
	public static final Item SAPHIRE_ROD = new Item(new Item.Settings());
	public static final Item MALACHITE_NUGGET = new Item(new Item.Settings());
	public static final Item FOOLS_GOLD_NUGGET = new Item(new Item.Settings());
    public static final Item CRYSTAL_POWDER = new Item(new Item.Settings());
    //public static SaphirePickaxeItem SAPHIRE_PICKAXE = new SaphirePickaxeItem(SaphireToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static final Item SAPHITHER_SPAWN_EGG = new SpawnEggItem(ModEntities.SAPHITHER, 12895428, 11382189, new Item.Settings());
    public static final Item SAPHIRE_PICKAXE = registerItem("saphire_pickaxe", new ModPickaxeItem(ModToolMaterial.SAPHIRE, 3, 2f,new FabricItemSettings()));
    public static final Item SAPHIRE_SWORD = registerItem("saphire_sword", new SwordItem(ModToolMaterial.SAPHIRE, 3, 1f, new FabricItemSettings()));
    public static final Item SAPHIRE_SHOVEL = registerItem("saphire_shovel", new ShovelItem(ModToolMaterial.SAPHIRE, 2, 1f,new FabricItemSettings()));
    public static final Item SAPHIRE_AXE = registerItem("saphire_axe", new ModAxeItem(ModToolMaterial.SAPHIRE, 4, 0.5f,new FabricItemSettings()));
    public static final Item SAPHIRE_HOE = registerItem("saphire_hoe", new ModHoeItem(ModToolMaterial.SAPHIRE, 2, 2f,new FabricItemSettings()));

    public static final Item SAPHIRE_HELMET = registerItem("saphire_helmet", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.HEAD,new FabricItemSettings()));
    public static final Item SAPHIRE_CHESTPLATE = registerItem("saphire_chestplate", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.CHEST,new FabricItemSettings()));
    public static final Item SAPHIRE_LEGGINGS = registerItem("saphire_leggings", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.LEGS,new FabricItemSettings()));
    public static final Item SAPHIRE_BOOTS = registerItem("saphire_boots", new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlot.FEET,new FabricItemSettings()));
    public static final Item INWOOD_APPLE = registerItem("inwood_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Insteadmain.MOD_ID, name), item);
    }
    
public static void registerModItems() {
        Insteadmain.LOGGER.info("Starting Items for instead");
        Registry.register(Registries.ITEM, new Identifier("instead", "fools_gold_ingot"), ModItems.FOOLS_GOLD_INGOT);
		Registry.register(Registries.ITEM, new Identifier("instead", "saphire_gem"), ModItems.SAPHIRE_GEM);
		Registry.register(Registries.ITEM, new Identifier("instead", "raw_fools_gold"), ModItems.RAW_FOOLS_GOLD);
		Registry.register(Registries.ITEM, new Identifier("instead", "energy_ingot"), ModItems.ENERGY_INGOT);
		Registry.register(Registries.ITEM, new Identifier("instead", "living_energy_star"), ModItems.LIVING_ENERGY_STAR);
		Registry.register(Registries.ITEM, new Identifier("instead", "saphire_rod"), ModItems.SAPHIRE_ROD);
		Registry.register(Registries.ITEM, new Identifier("instead", "malachite_nugget"), ModItems.MALACHITE_NUGGET);
		Registry.register(Registries.ITEM, new Identifier("instead", "fools_gold_nugget"), ModItems.FOOLS_GOLD_NUGGET);
		//Registry.register(Registry.ITEM, new Identifier("instead", "saphire_pickaxe"), ModItems.SAPHIRE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier("instead", "crystal_powder"), ModItems.CRYSTAL_POWDER);
		Registry.register(Registries.ITEM, new Identifier("instead", "saphither_spawn_egg"), ModItems.SAPHITHER_SPAWN_EGG);
    }
}