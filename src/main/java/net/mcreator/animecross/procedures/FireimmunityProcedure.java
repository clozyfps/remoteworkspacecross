package net.mcreator.animecross.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.network.AnimecrossModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FireimmunityProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire() == true) {
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).fireimmunitymastery + 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fireimmunitymastery = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity.isOnFire() == true && (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).fireimmunitymastery >= 500) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 0, 250, (false), (false)));
		}
	}
}
