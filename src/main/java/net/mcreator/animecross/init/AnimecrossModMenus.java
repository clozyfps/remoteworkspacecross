
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.animecross.world.inventory.ShenronGifMenu;
import net.mcreator.animecross.world.inventory.MainInfoMenu;
import net.mcreator.animecross.world.inventory.ClassguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimecrossModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<MainInfoMenu> MAIN_INFO = register("main_info", (id, inv, extraData) -> new MainInfoMenu(id, inv, extraData));
	public static final MenuType<ShenronGifMenu> SHENRON_GIF = register("shenron_gif",
			(id, inv, extraData) -> new ShenronGifMenu(id, inv, extraData));
	public static final MenuType<ClassguiMenu> CLASSGUI = register("classgui", (id, inv, extraData) -> new ClassguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
