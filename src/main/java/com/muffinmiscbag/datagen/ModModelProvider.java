package com.muffinmiscbag.datagen;

import com.muffinmiscbag.Blocks.ModBlocks;
import com.muffinmiscbag.Items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEP_BLACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_STEEL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STEEL_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_STICK, Models.GENERATED);
        // Steel Tools
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        // Steel Armor
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_BOOTS));
    }
}
