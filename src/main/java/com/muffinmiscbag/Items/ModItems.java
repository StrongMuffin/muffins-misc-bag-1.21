package com.muffinmiscbag.Items;

import com.muffinmiscbag.Items.materials.ModToolMaterials;
import com.muffinmiscbag.MuffinsMiscBag;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STEEL_SCRAP = registerItem("steel_scrap", new Item(new Item.Settings()));
    public static final Item REFINED_STEEL = registerItem("refined_steel", new Item(new Item.Settings()));
    public static final Item REINFORCED_STICK = registerItem("reinforced_stick", new Item(new Item.Settings()));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new PickaxeItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 0, -2.8f))));

    public static final Item STEEL_AXE = registerItem("steel_axe", new AxeItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 4, -3.1f))));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL, 0, -2.8f))));

    public static final Item STEEL_HOE = registerItem("steel_hoe", new HoeItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STEEL, -4, -1.0f))));

    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 2, -2.4f))));

    private static Item registerItem(String name, Item item)    {
        return Registry.register(Registries.ITEM, Identifier.of(MuffinsMiscBag.MOD_ID, name), item);
    }

    public static void registerModItems()   {
        MuffinsMiscBag.MMB_Log.info("Registering Items for " + MuffinsMiscBag.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(STEEL_SCRAP);
           entries.add(REFINED_STEEL);
           entries.add(REINFORCED_STICK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(STEEL_PICKAXE);
            entries.add(STEEL_AXE);
            entries.add(STEEL_SHOVEL);
            entries.add(STEEL_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(STEEL_SWORD);
        });
    }
}
