package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.network.AnimecrossModVariables;
import net.mcreator.animecross.entity.OdmstringEntity;

public class ODMGearRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).has_odm_gear == 1) {
			if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossModVariables.PlayerVariables())).odm_air > 0) {
				{
					double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AnimecrossModVariables.PlayerVariables())).odm_air - 1;
					entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.has_odm_gear = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
					OdmstringEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 1, 1);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You need air"), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("You need ODM gear"), (false));
		}
	}
}
