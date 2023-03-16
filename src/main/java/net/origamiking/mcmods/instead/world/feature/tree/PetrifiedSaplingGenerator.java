package net.origamiking.mcmods.instead.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.origamiking.mcmods.instead.world.feature.ModConfiguredFeatures;
import net.origamiking.mcmods.instead.world.gen.feature.ModTreeConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class PetrifiedSaplingGenerator extends SaplingGenerator{
    public PetrifiedSaplingGenerator() {
    }

    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModTreeConfiguredFeatures.PETRIFIDED;
    }
}
