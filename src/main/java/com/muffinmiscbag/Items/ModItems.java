package com.muffinmiscbag.Items;

import com.muffinmiscbag.Items.materials.SteelMaterial;
import com.muffinmiscbag.MuffinsMiscBag;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final ToolMaterial STEEL_MATERIAL = new SteelMaterial();

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(STEEL_MATERIAL,new Item.Settings()));

    public static final Item STEEL_SCRAP = registerItem("steel_scrap", new Item(new Item.Settings()));
    public static final Item REFINED_STEEL = registerItem("refined_steel", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item)    {
        return Registry.register(Registries.ITEM, Identifier.of(MuffinsMiscBag.MOD_ID, name), item);
    }

    public static void registerModItems()   {
        MuffinsMiscBag.MMB_Log.info("Registering Items for " + MuffinsMiscBag.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(STEEL_SCRAP);
           entries.add(REFINED_STEEL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(STEEL_PICKAXE);
        });
    }
}
