package net.origamiking.mcmods.instead.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;

public class ModPaintings {
    public static final PaintingVariant INSTEAD = registerPainting("instead", new PaintingVariant(32, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Insteadmain.MOD_ID, name), paintingVariant);
    }




    public static void registerPaintings() {}
}
