package com.calvinmonty.modernmodpack;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(ModernModPack.MOD_ID)
public class ModernModPack {
    public static final String MOD_ID = "modern_mod_pack";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ModernModPack(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Modern Mod Pack loaded");
    }
}
