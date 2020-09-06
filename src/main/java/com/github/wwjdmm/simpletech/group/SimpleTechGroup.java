package com.github.wwjdmm.simpletech.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SimpleTechGroup extends ItemGroup {
    public SimpleTechGroup(){
        super("simpletech_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.leadIngot.get());
    }
}
