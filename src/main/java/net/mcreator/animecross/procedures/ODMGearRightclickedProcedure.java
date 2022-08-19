package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.network.AnimecrossModVariables;

public class ODMGearRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
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
				speed = 5;
				Yaw = entity.getYRot();
				entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 350) * (Math.PI / 180))), (entity.getDeltaMovement().y()),
						(speed * Math.sin((Yaw + 350) * (Math.PI / 180)))));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
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
