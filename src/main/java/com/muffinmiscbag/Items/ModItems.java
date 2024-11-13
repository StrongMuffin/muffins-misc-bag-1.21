package com.muffinmiscbag.Items;

import com.muffinmiscbag.Items.materials.ModArmorMaterials;
import com.muffinmiscbag.Items.materials.ModToolMaterials;
import com.muffinmiscbag.MuffinsMiscBag;
import com.muffinmiscbag.entities.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItem;
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

    public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item MINING_HELMET = registerItem("mining_helmet", new ArmorItem(ModArmorMaterials.MINING_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(7))));

    public static final Item CRT_ROBOT_SPAWN_EGG = registerItem("crt_robot_spawn_egg", new SpawnEggItem(ModEntities.CRT_ROBOT_ENTITY_ENTITY_TYPE, 0xfffed9, 0x1cc93d, new Item.Settings()));

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

            entries.add(MINING_HELMET);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(STEEL_SWORD);
            entries.add(STEEL_HELMET);
            entries.add(STEEL_CHESTPLATE);
            entries.add(STEEL_LEGGINGS);
            entries.add(STEEL_BOOTS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(CRT_ROBOT_SPAWN_EGG);
        });
    }
}
