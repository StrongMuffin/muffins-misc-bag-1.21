package com.muffinmiscbag.datagen;

import com.muffinmiscbag.Blocks.ModBlocks;
import com.muffinmiscbag.Items.ModItems;
import com.muffinmiscbag.MuffinsMiscBag;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_STICK)
                .pattern("S")
                .pattern("M")
                .pattern("S")
                .input('S', Items.STICK)
                .input('M', ModItems.STEEL_SCRAP)
                .criterion(hasItem(ModItems.STEEL_SCRAP), conditionsFromItem(ModItems.STEEL_SCRAP))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                 .pattern("MMM")
                 .pattern(" S ")
                 .pattern(" S ")
                 .input('M', ModItems.REFINED_STEEL)
                 .input('S', ModItems.REINFORCED_STICK)
                 .criterion(hasItem(ModItems.REFINED_STEEL), conditionsFromItem(ModItems.REFINED_STEEL))
                 .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_STEEL, 9)
                 .input(ModItems.REFINED_STEEL)
                 .criterion(hasItem(ModBlocks.BLOCK_OF_STEEL), conditionsFromItem(ModBlocks.BLOCK_OF_STEEL))
                 .offerTo(recipeExporter, Identifier.of(MuffinsMiscBag.MOD_ID, "refined_steel_to_block_of_steel"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.REFINED_STEEL, 1)
                .input(ModBlocks.BLOCK_OF_STEEL)
                .criterion(hasItem(ModBlocks.BLOCK_OF_STEEL), conditionsFromItem(ModBlocks.BLOCK_OF_STEEL))
                .offerTo(recipeExporter, Identifier.of(MuffinsMiscBag.MOD_ID, "block_of_steel_to_refined_steel"));
    }
}