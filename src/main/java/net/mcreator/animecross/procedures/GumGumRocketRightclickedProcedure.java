package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossModVariables;

public class GumGumRocketRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).stamina > 74) {
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).stamina - 75;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stamina = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			speed = 5;
			Yaw = entity.getYRot();
			entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 120) * (Math.PI / 180))), (entity.getDeltaMovement().y()),
					(speed * Math.sin((Yaw + 120) * (Math.PI / 180)))));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		}
	}
}
