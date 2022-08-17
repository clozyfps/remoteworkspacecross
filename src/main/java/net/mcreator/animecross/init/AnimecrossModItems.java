
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.animecross.item.EItem;
import net.mcreator.animecross.AnimecrossMod;

public class AnimecrossModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimecrossMod.MODID);
	public static final RegistryObject<Item> E = REGISTRY.register("e", () -> new EItem());
}
