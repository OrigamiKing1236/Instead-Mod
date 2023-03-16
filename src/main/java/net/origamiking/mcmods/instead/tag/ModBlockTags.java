package net.origamiking.mcmods.instead.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class ModBlockTags {
    public static final TagKey<Block> INSTONE_ORE_REPLACEABLES = ModBlockTags.of("instone_ore_replaceables");

    public static void restiserBlockTags() {}

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}
