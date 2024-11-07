package com.muffinmiscbag.Blocks;

import com.muffinmiscbag.MuffinsMiscBag;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DEEP_BLACK_BLOCK = registerBlock("deep_black_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1f)
                    .sounds(BlockSoundGroup.SOUL_SAND)));

    public static final Block BLOCK_OF_STEEL = registerBlock("block_of_steel",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5f, 6.0f)
                    .sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block)    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MuffinsMiscBag.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MuffinsMiscBag.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks()  {
        MuffinsMiscBag.MMB_Log.info("Registering Blocks for " + MuffinsMiscBag.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.DEEP_BLACK_BLOCK);
            entries.add(ModBlocks.BLOCK_OF_STEEL);
        });
    }
}
