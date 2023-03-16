package net.origamiking.mcmods.instead.world.feature;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
//public static final RegistryEntry<PlacedFeature> INWOOD_PLACED = PlacedFeatures.register("inwood_placed", ModConfiguredFeatures.INWOOD_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
//public static final RegistryEntry<PlacedFeature> PETRIFIED_PLACED = PlacedFeatures.register("petrified_placed", ModConfiguredFeatures.PETRIFIED_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heighModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heighModifier, BiomePlacementModifier.of());}
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);}
    //private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
    //    return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);}
}
