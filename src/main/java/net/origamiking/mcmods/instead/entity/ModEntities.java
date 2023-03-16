package net.origamiking.mcmods.instead.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.entity.custom.SaphitherEntity;

public class ModEntities {
    public static final EntityType<SaphitherEntity> SAPHITHER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Insteadmain.MOD_ID, "saphither"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SaphitherEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build());
}
