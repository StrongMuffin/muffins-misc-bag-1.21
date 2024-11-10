package com.muffinmiscbag;

import com.muffinmiscbag.Blocks.ModBlocks;
import com.muffinmiscbag.Items.ModItems;
import com.muffinmiscbag.entities.ModEntities;
import com.muffinmiscbag.entities.custom.CRTRobotEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuffinsMiscBag implements ModInitializer {
	public static final String MOD_ID = "muffins-misc-bag";
	public static final Logger MMB_Log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.CRT_ROBOT_ENTITY_ENTITY_TYPE, CRTRobotEntity.createCRTRobotAttributes());

		MMB_Log.info("MMB loaded!");
	}
}