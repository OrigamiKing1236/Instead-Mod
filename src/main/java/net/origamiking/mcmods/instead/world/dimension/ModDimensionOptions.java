package net.origamiking.mcmods.instead.world.dimension;

import com.google.common.collect.ImmutableSet;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGenerator;

import java.util.Set;

public final class ModDimensionOptions {
    //public static final Codec<ModDimensionOptions> CODEC = RecordCodecBuilder.create(instance -> instance.group(((MapCodec)DimensionType.REGISTRY_CODEC.fieldOf("type")).forGetter(DimensionOptions::getDimensionTypeEntry), ((MapCodec)ChunkGenerator.CODEC.fieldOf("generator")).forGetter(DimensionOptions::getChunkGenerator)).apply((Applicative<DimensionOptions, ?>)instance, instance.stable(DimensionOptions::new)));
    public static final RegistryKey<DimensionOptions> INSTEAD = RegistryKey.of(RegistryKeys.DIMENSION, new Identifier("indim"));
    private static final Set<RegistryKey<DimensionOptions>> BASE_DIMENSIONS = ImmutableSet.of(INSTEAD);
    private final RegistryEntry<DimensionType> dimensionTypeEntry;
    private final ChunkGenerator chunkGenerator;

    public ModDimensionOptions(RegistryEntry<DimensionType> dimensionTypeEntry, ChunkGenerator chunkGenerator) {
        this.dimensionTypeEntry = dimensionTypeEntry;
        this.chunkGenerator = chunkGenerator;
    }

    public RegistryEntry<DimensionType> getDimensionTypeEntry() {
        return this.dimensionTypeEntry;
    }

    public ChunkGenerator getChunkGenerator() {
        return this.chunkGenerator;
    }
    public static void register() {};
    /*public static boolean hasDefaultSettings(Registry<ModDimensionOptions> registry) {
        if (registry.size() != BASE_DIMENSIONS.size()) {
            return false;
        }
        Optional<ModDimensionOptions> optional = registry.getOrEmpty(INSTEAD);
        if (optional.isEmpty()) {
            return false;
        }
        if (!optional.get().getDimensionTypeEntry().matchesKey(DimensionTypes.OVERWORLD) && !optional.get().getDimensionTypeEntry().matchesKey(DimensionTypes.OVERWORLD_CAVES)) {
            return false;
        }
    }*/
}

