package com.muffinmiscbag.entities.client;

import com.muffinmiscbag.MuffinsMiscBag;
import com.muffinmiscbag.entities.custom.CRTRobotEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CRTRobotRenderer extends MobEntityRenderer<CRTRobotEntity, CRTRobotModel<CRTRobotEntity>> {
    private static final Identifier TEXTURE = Identifier.of(MuffinsMiscBag.MOD_ID, "textures/entity/crtrobot/crt_texture.png");

    public CRTRobotRenderer(EntityRendererFactory.Context context) {
        super(context, new CRTRobotModel<>(context.getPart(ModModelLayers.CRTROBOT)), 1.0f);
    }

    @Override
    public Identifier getTexture(CRTRobotEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CRTRobotEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
