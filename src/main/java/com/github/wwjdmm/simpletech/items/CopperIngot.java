package com.github.wwjdmm.simpletech.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CopperIngot extends Item {
    public CopperIngot(){
        super(new Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("copper_ingot");
    }
}
