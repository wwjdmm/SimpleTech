package com.github.wwjdmm.simpletech.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class TinIngot extends Item {
    public TinIngot() {
        super(new Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("tin_ingot");
    }

}
