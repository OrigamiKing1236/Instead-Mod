package net.origamiking.mcmods.instead.world.dimension;

//import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.blocks.minerals.MineralBlocks;
import net.origamiking.mcmods.instead.items.ModItems;

public class ModDimensions {
//    public static final RegistryKey<World> INDIM_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD, new Identifier(Insteadmain.MOD_ID, "indim"));
//    public static final RegistryKey<DimensionType> INDIM_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, INDIM_DIMENSION_KEY.getValue());
//    public static final RegistryKey<WorldPreset> INSTEAD_WORLD_PRESET = RegistryKey.of(Registry.WORLD_PRESET_KEY, new Identifier("instead", "instead_world_preset"));
public static final RegistryKey<DimensionType> INSTEAD = of("indim");
private static RegistryKey<DimensionType> of(String id) {
    return RegistryKey.of(RegistryKeys.DIMENSION_TYPE, new Identifier(Insteadmain.MOD_ID, id));
}
    public static void register() {
        Insteadmain.LOGGER.info("Starting ModDimensions for Instead");

        CustomPortalBuilder.beginPortal()
                .frameBlock(MineralBlocks.SAPHIRE_BLOCK)
                .lightWithItem(ModItems.LIVING_ENERGY_STAR)
                .destDimID(new Identifier("instead:indim"))
                .tintColor(35, 251, 200)
                .registerPortal();
    }
}