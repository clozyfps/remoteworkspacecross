
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.animecross.client.gui.ShenronGifScreen;
import net.mcreator.animecross.client.gui.MainInfoScreen;
import net.mcreator.animecross.client.gui.ClassguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnimecrossModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AnimecrossModMenus.MAIN_INFO, MainInfoScreen::new);
			MenuScreens.register(AnimecrossModMenus.SHENRON_GIF, ShenronGifScreen::new);
			MenuScreens.register(AnimecrossModMenus.CLASSGUI, ClassguiScreen::new);
		});
	}
}
