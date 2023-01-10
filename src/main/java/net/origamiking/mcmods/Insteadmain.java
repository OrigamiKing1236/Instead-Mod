package net.origamiking.mcmods;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.origamiking.mcmods.blocks.ModBlocks;
import net.origamiking.mcmods.entity.ModEntities;
import net.origamiking.mcmods.entity.custom.SaphitherEntity;
import net.origamiking.mcmods.group.ModGroups;
import net.origamiking.mcmods.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Insteadmain implements ModInitializer {
	public static final String MOD_ID = "instead";
	public static final Logger LOGGER = LoggerFactory.getLogger("instead");

	@Override
	public void onInitialize() {
		LOGGER.info("Staring Instead");
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModGroups.registerGroups();
		FabricDefaultAttributeRegistry.register(ModEntities.SAPHITHER, SaphitherEntity.setAttributes());

	}
}