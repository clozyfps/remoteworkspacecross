package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.init.AnimecrossModMobEffects;

public class LowRankEvilSpiritOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 99999, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(AnimecrossModMobEffects.EVIL_SPIRIT.get(), 99999, 1, (false), (true)));
	}
}
