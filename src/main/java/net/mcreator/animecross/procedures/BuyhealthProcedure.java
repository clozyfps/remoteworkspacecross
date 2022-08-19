package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossModVariables;

public class BuyhealthProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 1) {
			{
				String _setval = "1";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 5) {
			{
				String _setval = "2";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 10) {
			{
				String _setval = "3";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 15) {
			{
				String _setval = "4";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 20) {
			{
				String _setval = "4";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 25) {
			{
				String _setval = "5";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 30) {
			{
				String _setval = "5";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 35) {
			{
				String _setval = "6";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 40) {
			{
				String _setval = "7";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 45) {
			{
				String _setval = "8";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 50) {
			{
				String _setval = "9";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 55) {
			{
				String _setval = "10";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points >= 1
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat == 60) {
			{
				String _setval = "11";
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).Stat_Points - 1;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stat_Points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
