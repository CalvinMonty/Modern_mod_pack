package com.calvinmonty.modernmodpack.registry;

import com.calvinmonty.modernmodpack.ModernModPack;
import com.calvinmonty.modernmodpack.item.TemplateBootsItem;
import com.calvinmonty.modernmodpack.item.TemplateChestplateItem;
import com.calvinmonty.modernmodpack.item.TemplateHelmetItem;
import com.calvinmonty.modernmodpack.item.TemplateLeggingsItem;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModernModPack.MOD_ID);

    public static final RegistryObject<Item> TEMPLATE_HELMET = ITEMS.register("template_helmet",
            () -> new TemplateHelmetItem(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_CHESTPLATE = ITEMS.register("template_chestplate",
            () -> new TemplateChestplateItem(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_LEGGINGS = ITEMS.register("template_leggings",
            () -> new TemplateLeggingsItem(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_BOOTS = ITEMS.register("template_boots",
            () -> new TemplateBootsItem(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
        bus.addListener(ModItems::addCreative);
    }

    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(TEMPLATE_HELMET);
            event.accept(TEMPLATE_CHESTPLATE);
            event.accept(TEMPLATE_LEGGINGS);
            event.accept(TEMPLATE_BOOTS);
        }
    }
}
