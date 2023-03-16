package net.origamiking.mcmods.instead.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;
import net.origamiking.mcmods.instead.entity.custom.SaphitherEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SaphitherRenderer extends GeoEntityRenderer<SaphitherEntity> {
    public SaphitherRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SaphitherModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public Identifier getTextureLocation(SaphitherEntity animatable) {
        return new Identifier(Insteadmain.MOD_ID, "textures/entity/saphither_texture.png");
    }
    //    @Override
//    public RenderLayer getRenderType(SaphitherEntity animatable, float partialTicks, MatrixStack stack,
//            VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
//            Identifier textureLocation) {
//        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn,
//                textureLocation);
//    }

    @Override
    public RenderLayer getRenderType(SaphitherEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
