package com.muffinmiscbag;

import com.muffinmiscbag.Blocks.ModBlocks;
import com.muffinmiscbag.Items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuffinsMiscBag implements ModInitializer {
	public static final String MOD_ID = "muffins-misc-bag";
	public static final Logger MMB_Log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		MMB_Log.info("MMB loaded!");
	}
}