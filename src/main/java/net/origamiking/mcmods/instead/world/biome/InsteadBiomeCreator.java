//package net.origamiking.mcmods.instead.world.biome;
//
//import net.minecraft.client.sound.MusicType;
//import net.minecraft.entity.SpawnGroup;
//import net.minecraft.particle.ParticleTypes;
//import net.minecraft.sound.BiomeAdditionsSound;
//import net.minecraft.sound.BiomeMoodSound;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.world.biome.*;
//import net.minecraft.world.gen.GenerationStep;
//import net.minecraft.world.gen.carver.ConfiguredCarvers;
//import net.minecraft.world.gen.feature.*;
//import net.origamiking.mcmods.instead.entity.ModEntities;
//
//public class InsteadBiomeCreator {
//    public InsteadBiomeCreator() {
//    }
//    public static int getSkyColor(float temperature) {
//        float f = temperature / 3.0F;
//        f = MathHelper.clamp(f, -1.0F, 1.0F);
//        return MathHelper.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
//    }
//    public static Biome createInsteadWastes() {
//        SpawnSettings spawnSettings = (new SpawnSettings.Builder()).spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.SAPHITHER, 50, 4, 4)).build();
//        GenerationSettings.Builder builder = (new GenerationSettings.Builder()).carver(GenerationStep.Carver.AIR, ConfiguredCarvers.NETHER_CAVE).feature(GenerationStep.Feature.VEGETAL_DECORATION, MiscPlacedFeatures.SPRING_LAVA);
//        DefaultBiomeFeatures.addDefaultMushrooms(builder);
//        builder.feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.SPRING_OPEN).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.PATCH_FIRE).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.PATCH_SOUL_FIRE).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.GLOWSTONE_EXTRA).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.GLOWSTONE).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, VegetationPlacedFeatures.RED_MUSHROOM_NETHER).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.SPRING_CLOSED);
//        DefaultBiomeFeatures.addNetherMineables(builder);
//        return (new Biome.Builder()).precipitation(Biome.Precipitation.NONE).temperature(2.0F).downfall(0.0F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(3344392).skyColor(InsteadBiomeCreator.getSkyColor(2.0F)).loopSound(SoundEvents.AMBIENT_NETHER_WASTES_LOOP).moodSound(new BiomeMoodSound(SoundEvents.AMBIENT_NETHER_WASTES_MOOD, 6000, 8, 2.0)).additionsSound(new BiomeAdditionsSound(SoundEvents.AMBIENT_NETHER_WASTES_ADDITIONS, 0.0111)).music(MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_NETHER_WASTES)).build()).spawnSettings(spawnSettings).generationSettings(builder.build()).build();
//    }
//
//    public static Biome createWarpedForest() {
//        SpawnSettings spawnSettings = (new SpawnSettings.Builder()).spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.SAPHITHER, 1, 4, 4)).build();
//        GenerationSettings.Builder builder = (new GenerationSettings.Builder()).carver(GenerationStep.Carver.AIR, ConfiguredCarvers.NETHER_CAVE).feature(GenerationStep.Feature.VEGETAL_DECORATION, MiscPlacedFeatures.SPRING_LAVA);
//        DefaultBiomeFeatures.addDefaultMushrooms(builder);
//        builder.feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.SPRING_OPEN).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.PATCH_FIRE).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.PATCH_SOUL_FIRE).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.GLOWSTONE_EXTRA).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.GLOWSTONE).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, OrePlacedFeatures.ORE_MAGMA).feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.SPRING_CLOSED).feature(GenerationStep.Feature.VEGETAL_DECORATION, TreePlacedFeatures.WARPED_FUNGI).feature(GenerationStep.Feature.VEGETAL_DECORATION, NetherPlacedFeatures.WARPED_FOREST_VEGETATION).feature(GenerationStep.Feature.VEGETAL_DECORATION, NetherPlacedFeatures.NETHER_SPROUTS);
//        DefaultBiomeFeatures.addNetherMineables(builder);
//        return (new Biome.Builder()).precipitation(Biome.Precipitation.NONE).temperature(2.0F).downfall(0.0F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(1705242).skyColor(InsteadBiomeCreator.getSkyColor(2.0F)).particleConfig(new BiomeParticleConfig(ParticleTypes.WARPED_SPORE, 0.01428F)).loopSound(SoundEvents.AMBIENT_WARPED_FOREST_LOOP).moodSound(new BiomeMoodSound(SoundEvents.AMBIENT_WARPED_FOREST_MOOD, 6000, 8, 2.0)).additionsSound(new BiomeAdditionsSound(SoundEvents.AMBIENT_WARPED_FOREST_ADDITIONS, 0.0111)).music(MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_WARPED_FOREST)).build()).spawnSettings(spawnSettings).generationSettings(builder.build()).build();
//    }
//}
