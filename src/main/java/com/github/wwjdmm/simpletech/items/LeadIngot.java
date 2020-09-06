package com.github.wwjdmm.simpletech.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class LeadIngot extends Item {
    public LeadIngot() {
        super(new Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("lead_ingot");
    }

}
