package com.muffinmiscbag.entities.client;

import com.muffinmiscbag.entities.animation.ModAnimations;
import com.muffinmiscbag.entities.custom.CRTRobotEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class CRTRobotModel<T extends CRTRobotEntity> extends SinglePartEntityModel<T> {
	private final ModelPart crtrobot;

	public CRTRobotModel(ModelPart root) {
		this.crtrobot = root.getChild("crtrobot");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData crtrobot = modelPartData.addChild("crtrobot", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = crtrobot.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, 6.0F, -8.0F, 16.0F, 2.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-8.0F, -8.0F, -8.0F, 16.0F, 2.0F, 16.0F, new Dilation(0.0F))
		.uv(52, 36).cuboid(-8.0F, -6.0F, -8.0F, 2.0F, 12.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 62).cuboid(6.0F, -6.0F, -8.0F, 2.0F, 12.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 14.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(-6.0F, -6.0F, -7.0F, 12.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -15.0F, 0.0F));

		ModelPartData Leg_R = crtrobot.addChild("Leg_R", ModelPartBuilder.create().uv(68, 71).cuboid(-2.0F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(56, 64).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -7.0F, 0.0F));

		ModelPartData Leg_L = crtrobot.addChild("Leg_L", ModelPartBuilder.create().uv(56, 64).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 71).cuboid(-2.0F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -7.0F, 0.0F));

		ModelPartData Arm_R = crtrobot.addChild("Arm_R", ModelPartBuilder.create(), ModelTransform.pivot(-7.0F, -13.0F, 0.0F));

		ModelPartData Arm_Right_Block_r1 = Arm_R.addChild("Arm_Right_Block_r1", ModelPartBuilder.create().uv(72, 26).mirrored().cuboid(-2.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-9.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData Arm_Right_r1 = Arm_R.addChild("Arm_Right_r1", ModelPartBuilder.create().uv(64, 13).mirrored().cuboid(-1.0F, -5.5F, -1.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-3.2322F, 3.2322F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData Arm_L = crtrobot.addChild("Arm_L", ModelPartBuilder.create(), ModelTransform.pivot(7.0F, -13.0F, 0.0F));

		ModelPartData Arm_Left_Block_r1 = Arm_L.addChild("Arm_Left_Block_r1", ModelPartBuilder.create().uv(72, 18).cuboid(-2.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 9.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData Arm_Left_r1 = Arm_L.addChild("Arm_Left_r1", ModelPartBuilder.create().uv(64, 13).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		crtrobot.render(matrices, vertices, light, overlay, color);
	}

	@Override
	public ModelPart getPart() {
		return crtrobot;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		this.animateMovement(ModAnimations.WALKING, limbAngle, limbDistance, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, animationProgress, 1f);
	}
}