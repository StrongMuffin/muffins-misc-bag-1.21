package com.muffinmiscbag.Items.materials;

import com.muffinmiscbag.Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class SteelMaterial implements ToolMaterial {

    public static final SteelMaterial INSTANCE = new SteelMaterial();

    @Override
    public int getDurability()  {
        return 800;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 5.5f;
    }
    @Override
    public float getAttackDamage()  {
        return 5.0f;
    }
    @Override
    public TagKey<Block> getInverseTag()    {
        return BlockTags.INCORRECT_FOR_IRON_TOOL;
    }
    @Override
    public int getEnchantability()   {
        return 12;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.REFINED_STEEL);
    }
}