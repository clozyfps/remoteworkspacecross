package net.mcreator.animecross.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossModVariables;
import net.mcreator.animecross.entity.PyrobombEntity;

public class PyroBombItemRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).power > 69
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).level >= 6) {
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).power - 70;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				PyrobombEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 11, 1);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 50);
		}
	}
}
