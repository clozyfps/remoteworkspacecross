package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.network.AnimecrossModVariables;

public class SoulPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).evilspirit == true) {
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel < 12) {
				{
					double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel + 1;
					entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.evilspiritpowerlevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = 1;
					entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.evilspiritpowerlevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, (int) 0.5, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 2) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, 1, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 3) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, (int) 1.5, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 4) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, 2, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 5) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, (int) 2.5, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 6) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, 3, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 7) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, (int) 3.5, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 8) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, 4, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 9) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, (int) 4.5, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 10) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, 5, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 99999, 5, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 4, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 99999, 1, (false), (false)));
			}
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).evilspiritpowerlevel == 11) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999, 5, (false), (false)));
			}
		}
	}
}
