package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.init.AnimecrossModMobEffects;

public class DisplaySelfEvilSpiritOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossModMobEffects.EVIL_SPIRIT.get()) : false)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.INVISIBILITY) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INVISIBILITY);
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossModMobEffects.EVIL_SPIRIT.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 99999, 1, (false), (false)));
		}
	}
}
