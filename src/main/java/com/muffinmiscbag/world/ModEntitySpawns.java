package com.muffinmiscbag.world;

import com.muffinmiscbag.entities.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {
    public static void addEntitySpawns()    {
        BiomeModifications.addSpawn(
                context -> isCaveBiome(context.getBiomeKey()),
                SpawnGroup.MONSTER,
                ModEntities.CRT_ROBOT_ENTITY_ENTITY_TYPE,
                2,
                1,
                1
        );
    }

    private static boolean isCaveBiome(RegistryKey<Biome> biomeKey) {
        return biomeKey.equals(BiomeKeys.LUSH_CAVES);
    }
}