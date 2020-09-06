package com.github.wwjdmm.simpletech.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AluminumIngot extends Item {
    public AluminumIngot() {
        super(new Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("aluminum_ingot");
    }

}
