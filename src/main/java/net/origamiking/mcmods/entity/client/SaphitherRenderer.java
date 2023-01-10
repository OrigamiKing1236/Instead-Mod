package net.origamiking.mcmods.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.Insteadmain;
import net.origamiking.mcmods.entity.custom.SaphitherEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SaphitherRenderer extends GeoEntityRenderer<SaphitherEntity> {
    public SaphitherRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SaphitherModel());
        this.shadowRadius = 0.3f;
    }

    public Identifier getTextureResource(SaphitherEntity instance) {
        return new Identifier(Insteadmain.MOD_ID, "textures/entity/saphither_texture.png");
    }
//    public RenderLayer getRenderType(SaphitherEntity animatable, float partialTicks, MatrixStack stack,
//            VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
//            Identifier textureLocation) {
//        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn,
//                textureLocation);
//    }
}
