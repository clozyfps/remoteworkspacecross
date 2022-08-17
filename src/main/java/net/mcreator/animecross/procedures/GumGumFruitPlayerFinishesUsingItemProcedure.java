package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossModVariables;

public class GumGumFruitPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.gumgumfruituser = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
