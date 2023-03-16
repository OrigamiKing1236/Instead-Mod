package net.origamiking.mcmods.instead;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.origamiking.mcmods.instead.blocks.ModBlocks;
import net.origamiking.mcmods.instead.entity.ModEntities;
import net.origamiking.mcmods.instead.entity.custom.SaphitherEntity;
import net.origamiking.mcmods.instead.group.ModGroups;
import net.origamiking.mcmods.instead.item.ModItems;
import net.origamiking.mcmods.instead.painting.ModPaintings;
import net.origamiking.mcmods.instead.tag.ModBlockTags;
import net.origamiking.mcmods.instead.util.ModFlammableBlocks;
import net.origamiking.mcmods.instead.util.ModStrippableBlocks;
import net.origamiking.mcmods.instead.world.feature.ModConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Insteadmain implements ModInitializer {
	public static final String MOD_ID = "instead";
	public static final Logger LOGGER = LoggerFactory.getLogger("instead");

	public static final RegistryKey<PlacedFeature> ENERGY_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Insteadmain.MOD_ID,"energy_ore"));
	public static final RegistryKey<PlacedFeature> FOOLS_GOLD_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Insteadmain.MOD_ID,"fools_gold_ore"));
	public static final RegistryKey<PlacedFeature> SAPHIRE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Insteadmain.MOD_ID,"saphire_ore"));


	@Override
	public void onInitialize() {
		LOGGER.info("Staring Instead");
		ModConfiguredFeatures.registerConfiguredFeatures();//this must be first
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModGroups.registerGroups();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
		FabricDefaultAttributeRegistry.register(ModEntities.SAPHITHER, SaphitherEntity.setAttributes());
		ModBlockTags.restiserBlockTags();
		ModPaintings.registerPaintings();

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ENERGY_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, FOOLS_GOLD_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SAPHIRE_ORE_PLACED_KEY);


	}
}