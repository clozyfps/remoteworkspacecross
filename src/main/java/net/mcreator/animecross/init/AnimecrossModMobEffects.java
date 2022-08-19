
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.potion.EvilSpiritMobEffect;
import net.mcreator.animecross.AnimecrossMod;

public class AnimecrossModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AnimecrossMod.MODID);
	public static final RegistryObject<MobEffect> EVIL_SPIRIT = REGISTRY.register("evil_spirit", () -> new EvilSpiritMobEffect());
}
