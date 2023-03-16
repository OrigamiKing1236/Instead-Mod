package net.origamiking.mcmods.instead.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.origamiking.mcmods.instead.world.gen.feature.ModTreeConfiguredFeatures;

public class InwoodSaplingGenerator extends SaplingGenerator {
    public InwoodSaplingGenerator() {
    }

    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModTreeConfiguredFeatures.INWOOD;
    }
    
}
