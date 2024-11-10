package com.muffinmiscbag;

import com.muffinmiscbag.entities.ModEntities;
import com.muffinmiscbag.entities.client.CRTRobotModel;
import com.muffinmiscbag.entities.client.CRTRobotRenderer;
import com.muffinmiscbag.entities.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MMBClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.CRT_ROBOT_ENTITY_ENTITY_TYPE, CRTRobotRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CRTROBOT, CRTRobotModel::getTexturedModelData);
    }
}
