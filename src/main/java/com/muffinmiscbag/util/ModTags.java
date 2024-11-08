package com.muffinmiscbag.util;

import com.muffinmiscbag.MuffinsMiscBag;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks  {
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");

        private static TagKey<Block> createTag(String name)  {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MuffinsMiscBag.MOD_ID, name));
        }
    }

    public static class Items   {
        public static final TagKey<Item> TEST_TAG = createTag("test_tag");

        public static final TagKey<Item> IS_STEEL_TOOL = createTag("is_steel_tool");

        private static TagKey<Item> createTag(String name)  {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MuffinsMiscBag.MOD_ID, name));
        }
    }
}