
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.animecross.item.TwoStarDragonBallItem;
import net.mcreator.animecross.item.ThreeStarDragonBallItem;
import net.mcreator.animecross.item.SlimeItem;
import net.mcreator.animecross.item.SixthStarDragonBallItem;
import net.mcreator.animecross.item.SeventhDragonBallItem;
import net.mcreator.animecross.item.OnelevelItem;
import net.mcreator.animecross.item.OneStarDragonBallItem;
import net.mcreator.animecross.item.OdmstringItem;
import net.mcreator.animecross.item.ODMGearItem;
import net.mcreator.animecross.item.ODMGearArmorItem;
import net.mcreator.animecross.item.ODMEquipItem;
import net.mcreator.animecross.item.GumGumFruitItem;
import net.mcreator.animecross.item.FourStarDragonBallItem;
import net.mcreator.animecross.item.FiveStarDragonBallItem;
import net.mcreator.animecross.item.AircanisterItem;
import net.mcreator.animecross.AnimecrossMod;

public class AnimecrossModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimecrossMod.MODID);
	public static final RegistryObject<Item> ONELEVEL = REGISTRY.register("onelevel", () -> new OnelevelItem());
	public static final RegistryObject<Item> ODM_GEAR = REGISTRY.register("odm_gear", () -> new ODMGearItem());
	public static final RegistryObject<Item> AIRCANISTER = REGISTRY.register("aircanister", () -> new AircanisterItem());
	public static final RegistryObject<Item> ODM_EQUIP = REGISTRY.register("odm_equip", () -> new ODMEquipItem());
	public static final RegistryObject<Item> ODMSTRING = REGISTRY.register("odmstring", () -> new OdmstringItem());
	public static final RegistryObject<Item> ONE_STAR_DRAGON_BALL = REGISTRY.register("one_star_dragon_ball", () -> new OneStarDragonBallItem());
	public static final RegistryObject<Item> TWO_STAR_DRAGON_BALL = REGISTRY.register("two_star_dragon_ball", () -> new TwoStarDragonBallItem());
	public static final RegistryObject<Item> THREE_STAR_DRAGON_BALL = REGISTRY.register("three_star_dragon_ball",
			() -> new ThreeStarDragonBallItem());
	public static final RegistryObject<Item> FOUR_STAR_DRAGON_BALL = REGISTRY.register("four_star_dragon_ball", () -> new FourStarDragonBallItem());
	public static final RegistryObject<Item> FIVE_STAR_DRAGON_BALL = REGISTRY.register("five_star_dragon_ball", () -> new FiveStarDragonBallItem());
	public static final RegistryObject<Item> SIXTH_STAR_DRAGON_BALL = REGISTRY.register("sixth_star_dragon_ball",
			() -> new SixthStarDragonBallItem());
	public static final RegistryObject<Item> SEVENTH_DRAGON_BALL = REGISTRY.register("seventh_dragon_ball", () -> new SeventhDragonBallItem());
	public static final RegistryObject<Item> SLIME_BOOTS = REGISTRY.register("slime_boots", () -> new SlimeItem.Boots());
	public static final RegistryObject<Item> ODM_GEAR_ARMOR_LEGGINGS = REGISTRY.register("odm_gear_armor_leggings",
			() -> new ODMGearArmorItem.Leggings());
	public static final RegistryObject<Item> GUM_GUM_FRUIT = REGISTRY.register("gum_gum_fruit", () -> new GumGumFruitItem());
}
