package com.muffinmiscbag.datagen;

import com.muffinmiscbag.Items.ModItems;
import com.muffinmiscbag.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.IS_STEEL_TOOL)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.STEEL_AXE)
                .add(ModItems.STEEL_SHOVEL)
                .add(ModItems.STEEL_HOE)
                .add(ModItems.STEEL_SWORD);
    }
}
