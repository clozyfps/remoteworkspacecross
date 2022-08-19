package net.mcreator.animecross.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossModVariables;
import net.mcreator.animecross.init.AnimecrossModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GumgummasteryProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).gumgumfruituser == true) {
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).gumgummastery + 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gumgummastery = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).gumgummastery >= 50
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).gearseconduser == false) {
			{
				boolean _setval = true;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gearseconduser = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AnimecrossModItems.GEAR_SECOND.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
