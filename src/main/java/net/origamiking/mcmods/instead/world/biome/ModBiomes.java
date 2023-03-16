package net.origamiking.mcmods.instead.world.biome;/*package net.origamiking.mcmods.instead.world.biome;

import com.mojang.serialization.Codec;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.biome.*;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.world.feature.ModConfiguredFeatures;

import static net.minecraft.util.registry.Registry.freezeRegistries;
import static net.minecraft.util.registry.Registry.register;

public class ModBiomes {

    //public static final RegistryKey<World> INDIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY, new Identifier(Insteadmain.MOD_ID, "indim"));
    //public static final RegistryKey<DimensionType> INDIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, INDIM_DIMENSION_KEY.getValue());

    //public static final Biome CRYSTAL_FOREST = new Biome.Builder().build();
    //public static final RegistryKey<Biome> CRYSTAL_FOREST_KEY = register("crystal_forest");

    //public static final RegistryKey<Biome> CRYSTAL_FOREST_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(Insteadmain.MOD_ID, "crystal_forest"));
    //public static final RegistryKey<Codec<? extends BiomeSource>> CRYSTAL_FOREST_TYPE_KEY = RegistryKey.of(Registry.BIOME_SOURCE_KEY, CRYSTAL_FOREST_BIOME_KEY.getValue());

    public static final RegistryKey<Biome> CRYSTAL_FOREST_KEY = registerKey("crystal_forest");
    public static final  Biome CRYSTAL_FOREST = createCrystalForest();

    private static Biome createCrystalForest() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(ModSurfaceConfigs.LAVA_SURFACE_BUILDER);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        generationSettings.feature(GenerationStep.Feature.LAKES, ConfiguredFeatures.LAKE_LAVA);

        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.INSTONE_ENERGY_ORE);

        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);

        return (new Biome.Builder()).precipitation(Biome.Precipitation.RAIN).category(Biome.Category.NONE)
                .depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3f76e4).waterFogColor(0x050533)
                        .fogColor(0xc0d8ff).skyColor(0x77adff)
                        .build()).spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }





    public static void registerBiomes() {
        Insteadmain.LOGGER.info("Starting Biomes");
    }
    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }
    public static RegistryKey<Biome> registerKey(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(Insteadmain.MOD_ID, name));
    }
}*/
