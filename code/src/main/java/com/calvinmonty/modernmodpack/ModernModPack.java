package com.calvinmonty.modernmodpack;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModernModPack.MOD_ID)
public class ModernModPack {
    public static final String MOD_ID = "modern_mod_pack";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ModernModPack(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Modern Mod Pack loaded");
    }
}
