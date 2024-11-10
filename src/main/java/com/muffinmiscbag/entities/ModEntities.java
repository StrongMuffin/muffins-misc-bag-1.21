package com.muffinmiscbag.entities;

import com.muffinmiscbag.MuffinsMiscBag;
import com.muffinmiscbag.entities.custom.CRTRobotEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<CRTRobotEntity> CRT_ROBOT_ENTITY_ENTITY_TYPE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MuffinsMiscBag.MOD_ID, "crtrobot"),
            EntityType.Builder.create(CRTRobotEntity::new, SpawnGroup.CREATURE).dimensions(1f, 1.45f).build());

    public static DefaultAttributeContainer.Builder createAttributes()  {
        return CRTRobotEntity.createCRTRobotAttributes();
    }
}
