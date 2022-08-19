
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.animecross.item.UchihaClanItem;
import net.mcreator.animecross.item.TwoStarDragonBallItem;
import net.mcreator.animecross.item.ThreeStarDragonBallItem;
import net.mcreator.animecross.item.SoulItem;
import net.mcreator.animecross.item.SlimeItem;
import net.mcreator.animecross.item.SixthStarDragonBallItem;
import net.mcreator.animecross.item.SeventhDragonBallItem;
import net.mcreator.animecross.item.ScoutRegimentCloakItem;
import net.mcreator.animecross.item.PyrobombItem;
import net.mcreator.animecross.item.PyroBombItemItem;
import net.mcreator.animecross.item.OnelevelItem;
import net.mcreator.animecross.item.OneStarDragonBallItem;
import net.mcreator.animecross.item.OdmstringItem;
import net.mcreator.animecross.item.ODMGearItem;
import net.mcreator.animecross.item.ODMGearArmorItem;
import net.mcreator.animecross.item.ODMEquipItem;
import net.mcreator.animecross.item.ODMBladeItem;
import net.mcreator.animecross.item.GumGumRocketItem;
import net.mcreator.animecross.item.GumGumPistolItemItem;
import net.mcreator.animecross.item.GumGumPistolItem;
import net.mcreator.animecross.item.GumGumGatlingItem;
import net.mcreator.animecross.item.GumGumFruitItem;
import net.mcreator.animecross.item.GearSecondItem;
import net.mcreator.animecross.item.GatlingrangeditemItem;
import net.mcreator.animecross.item.FourStarDragonBallItem;
import net.mcreator.animecross.item.FiveStarDragonBallItem;
import net.mcreator.animecross.item.FireballprojectileItem;
import net.mcreator.animecross.item.FireExplosionItem;
import net.mcreator.animecross.item.FireBallJutsuItem;
import net.mcreator.animecross.item.AircanisterItem;
import net.mcreator.animecross.item.AirWhipItem;
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
	public static final RegistryObject<Item> GUM_GUM_PISTOL = REGISTRY.register("gum_gum_pistol", () -> new GumGumPistolItem());
	public static final RegistryObject<Item> GUM_GUM_PISTOL_ITEM = REGISTRY.register("gum_gum_pistol_item", () -> new GumGumPistolItemItem());
	public static final RegistryObject<Item> MARINE = REGISTRY.register("marine_spawn_egg",
			() -> new ForgeSpawnEggItem(AnimecrossModEntities.MARINE, -1, -15984852, new Item.Properties().tab(AnimecrossModTabs.TAB_ONE_PIECE)));
	public static final RegistryObject<Item> GUM_GUM_ROCKET = REGISTRY.register("gum_gum_rocket", () -> new GumGumRocketItem());
	public static final RegistryObject<Item> GATLINGRANGEDITEM = REGISTRY.register("gatlingrangeditem", () -> new GatlingrangeditemItem());
	public static final RegistryObject<Item> GUM_GUM_GATLING = REGISTRY.register("gum_gum_gatling", () -> new GumGumGatlingItem());
	public static final RegistryObject<Item> LIGHTED_PLATE = block(AnimecrossModBlocks.LIGHTED_PLATE, null);
	public static final RegistryObject<Item> PIN_PLATE = block(AnimecrossModBlocks.PIN_PLATE, null);
	public static final RegistryObject<Item> FLOOR_PLATE = block(AnimecrossModBlocks.FLOOR_PLATE, null);
	public static final RegistryObject<Item> TV_BOTTOM = block(AnimecrossModBlocks.TV_BOTTOM, null);
	public static final RegistryObject<Item> TV_BOTTOM_LEFT = block(AnimecrossModBlocks.TV_BOTTOM_LEFT, null);
	public static final RegistryObject<Item> TV_BOTTOM_RIGHT = block(AnimecrossModBlocks.TV_BOTTOM_RIGHT, null);
	public static final RegistryObject<Item> TV_TOP = block(AnimecrossModBlocks.TV_TOP, null);
	public static final RegistryObject<Item> TV_TOP_LEFT = block(AnimecrossModBlocks.TV_TOP_LEFT, null);
	public static final RegistryObject<Item> TV_TOPRIGHT = block(AnimecrossModBlocks.TV_TOPRIGHT, null);
	public static final RegistryObject<Item> TV_SINGLE = block(AnimecrossModBlocks.TV_SINGLE, null);
	public static final RegistryObject<Item> TVRIGHT = block(AnimecrossModBlocks.TVRIGHT, null);
	public static final RegistryObject<Item> TVLEFT = block(AnimecrossModBlocks.TVLEFT, null);
	public static final RegistryObject<Item> ODM_BLADE = REGISTRY.register("odm_blade", () -> new ODMBladeItem());
	public static final RegistryObject<Item> SCOUT_REGIMENT_MEMBER = REGISTRY.register("scout_regiment_member_spawn_egg",
			() -> new ForgeSpawnEggItem(AnimecrossModEntities.SCOUT_REGIMENT_MEMBER, -3569353, -16167154,
					new Item.Properties().tab(AnimecrossModTabs.TAB_AOT)));
	public static final RegistryObject<Item> SCOUT_REGIMENT_CLOAK_CHESTPLATE = REGISTRY.register("scout_regiment_cloak_chestplate",
			() -> new ScoutRegimentCloakItem.Chestplate());
	public static final RegistryObject<Item> SOUL = REGISTRY.register("soul", () -> new SoulItem());
	public static final RegistryObject<Item> UCHIHA_CLAN = REGISTRY.register("uchiha_clan", () -> new UchihaClanItem());
	public static final RegistryObject<Item> FIREBALLPROJECTILE = REGISTRY.register("fireballprojectile", () -> new FireballprojectileItem());
	public static final RegistryObject<Item> FIRE_BALL_JUTSU = REGISTRY.register("fire_ball_jutsu", () -> new FireBallJutsuItem());
	public static final RegistryObject<Item> GEAR_SECOND = REGISTRY.register("gear_second", () -> new GearSecondItem());
	public static final RegistryObject<Item> SHIGEO = REGISTRY.register("shigeo_spawn_egg",
			() -> new ForgeSpawnEggItem(AnimecrossModEntities.SHIGEO, -16777216, -1, new Item.Properties().tab(AnimecrossModTabs.TAB_MOB_PSYCHO)));
	public static final RegistryObject<Item> PYROBOMB = REGISTRY.register("pyrobomb", () -> new PyrobombItem());
	public static final RegistryObject<Item> PYRO_BOMB_ITEM = REGISTRY.register("pyro_bomb_item", () -> new PyroBombItemItem());
	public static final RegistryObject<Item> FIRE_EXPLOSION = REGISTRY.register("fire_explosion", () -> new FireExplosionItem());
	public static final RegistryObject<Item> AIR_WHIP = REGISTRY.register("air_whip", () -> new AirWhipItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
