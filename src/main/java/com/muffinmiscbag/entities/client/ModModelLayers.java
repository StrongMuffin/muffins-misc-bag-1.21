package com.muffinmiscbag.entities.client;

import com.muffinmiscbag.MuffinsMiscBag;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer CRTROBOT =
            new EntityModelLayer(Identifier.of(MuffinsMiscBag.MOD_ID, "crtrobot"), "main");
}
