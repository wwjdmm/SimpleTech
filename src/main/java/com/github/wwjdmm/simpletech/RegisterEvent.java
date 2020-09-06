package com.github.wwjdmm.simpletech;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterEvent {
    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
        //Items
        event.getRegistry().register(AllItem.copperIngot);
        event.getRegistry().register(AllItem.tinIngot);
        event.getRegistry().register(AllItem.leadIngot);
        event.getRegistry().register(AllItem.aluminumIngot);
    }
}
