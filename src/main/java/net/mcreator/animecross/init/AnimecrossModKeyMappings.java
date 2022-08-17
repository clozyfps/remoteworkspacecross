
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.animecross.network.OpenInfoMessage;
import net.mcreator.animecross.AnimecrossMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AnimecrossModKeyMappings {
	public static final KeyMapping OPEN_INFO = new KeyMapping("key.animecross.open_info", GLFW.GLFW_KEY_I, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(OPEN_INFO);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == OPEN_INFO.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AnimecrossMod.PACKET_HANDLER.sendToServer(new OpenInfoMessage(0, 0));
						OpenInfoMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
