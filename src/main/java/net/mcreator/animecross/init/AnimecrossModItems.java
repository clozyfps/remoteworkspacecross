
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.animecross.item.OnelevelItem;
import net.mcreator.animecross.item.OdmstringItem;
import net.mcreator.animecross.item.ODMGearItem;
import net.mcreator.animecross.item.ODMEquipItem;
import net.mcreator.animecross.item.AircanisterItem;
import net.mcreator.animecross.AnimecrossMod;

public class AnimecrossModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimecrossMod.MODID);
	public static final RegistryObject<Item> ONELEVEL = REGISTRY.register("onelevel", () -> new OnelevelItem());
	public static final RegistryObject<Item> ODM_GEAR = REGISTRY.register("odm_gear", () -> new ODMGearItem());
	public static final RegistryObject<Item> AIRCANISTER = REGISTRY.register("aircanister", () -> new AircanisterItem());
	public static final RegistryObject<Item> ODM_EQUIP = REGISTRY.register("odm_equip", () -> new ODMEquipItem());
	public static final RegistryObject<Item> ODMSTRING = REGISTRY.register("odmstring", () -> new OdmstringItem());
}
