package net.origamiking.mcmods.instead.world.feature;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.*;
import net.origamiking.mcmods.instead.blocks.minerals.MineralBlocks;

import java.util.List;

public class ModConfiguredFeatures {

//    public static final List<OreFeatureConfig.Target> INDIM_ENERGY_ORES = List.of(
//        //OreFeatureConfig.createTarget(ModOreConfiguredFeatures.INSTONE_ORE_REPLACEABLES, ModBlocks.INSTONE_ENERGY_ORE.getDefaultState()));
//        OreFeatureConfig.createTarget(new BlockMatchRuleTest(InstoneBlocks.INSTONE), MineralBlocks.INSTONE_ENERGY_ORE.getDefaultState()));
//
//    public static final List<OreFeatureConfig.Target> INDIM_SAPHIRE_ORES = List.of(
//        OreFeatureConfig.createTarget(ModOreConfiguredFeatures.INSTONE_ORE_REPLACEABLES, MineralBlocks.INSTONE_SAPHIRE_ORE.getDefaultState()));
//    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INSTONE_ENERGY_ORE =
//        ConfiguredFeatures.register("instone_energy_ore",Feature.ORE, new OreFeatureConfig(INDIM_ENERGY_ORES, 12));//5
//
//    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INSTONE_SAPHIRE_ORE =
//        ConfiguredFeatures.register("instone_saphire_ore",Feature.ORE, new OreFeatureConfig(INDIM_SAPHIRE_ORES, 5));
//
//
//        //trees
//    public static final RegistryKey<ConfiguredFeature<TreeFeatureConfig, ?>> INWOOD_TREE =
//        ConfiguredFeatures.register("inwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
//                BlockStateProvider.of(InwoodBlocks.INWOOD_STEM),
//                new StraightTrunkPlacer(5, 4, 3),//i base hight
//                BlockStateProvider.of(InwoodBlocks.INWOOD_LEAVES),
//                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
//                new TwoLayersFeatureSize(1, 0, 2)).build());
//
//    public static final RegistryEntry<PlacedFeature> INWOOD_CHECKED = PlacedFeatures.register("inwood_checked.json",
//        ModConfiguredFeatures.INWOOD_TREE, List.of(PlacedFeatures.wouldSurvive(InwoodBlocks.INWOOD_SAPLING)));
//
//    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> INWOOD_SPAWN =
//        ConfiguredFeatures.register("inwood_spawn", Feature.RANDOM_SELECTOR,
//                new RandomFeatureConfig(List.of(new RandomFeatureEntry(INWOOD_CHECKED, 0.5f)),
//                        INWOOD_CHECKED));
//
////petrified
//    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PETRIFIED_TREE =
//        ConfiguredFeatures.register("petrified_tree", Feature.TREE, new TreeFeatureConfig.Builder(
//                BlockStateProvider.of(PetrifiedBlocks.PETRIFIED_LOG),
//                new StraightTrunkPlacer(3, 3, 3),//i base hight
//                BlockStateProvider.of(Blocks.AIR),
//                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
//                new TwoLayersFeatureSize(1, 0, 2)).build());
//
//    public static final RegistryEntry<PlacedFeature> PETRIFIED_CHECKED = PlacedFeatures.register("petrified_checked",
//        ModConfiguredFeatures.PETRIFIED_TREE, List.of(PlacedFeatures.wouldSurvive(PetrifiedBlocks.PETRIFIED_SAPLING)));
//
//    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PETRIFIED_SPAWN =
//        ConfiguredFeatures.register("petrified_spawn", Feature.RANDOM_SELECTOR,
//                new RandomFeatureConfig(List.of(new RandomFeatureEntry(PETRIFIED_CHECKED, 0.5f)),
//                        PETRIFIED_CHECKED));
    public static void registerConfiguredFeatures() {}
}
 