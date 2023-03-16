package net.origamiking.mcmods.instead.entity.client;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.entity.custom.SaphitherEntity;
import software.bernie.geckolib.model.GeoModel;
public class SaphitherModel extends GeoModel<SaphitherEntity> {

    @Override
    public Identifier getAnimationResource(SaphitherEntity animatable) {
        return new Identifier(Insteadmain.MOD_ID, "animations/saphither.animation.json");
    }

    @Override
    public Identifier getModelResource(SaphitherEntity object) {
        return new Identifier(Insteadmain.MOD_ID, "geo/saphither.geo.json");
    }

    @Override
    public Identifier getTextureResource(SaphitherEntity object) {
        return new Identifier(Insteadmain.MOD_ID, "textures/entity/saphither_texture.png");
    }
    
}
