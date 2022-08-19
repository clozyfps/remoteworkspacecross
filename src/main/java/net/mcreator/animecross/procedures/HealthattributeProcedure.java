package net.mcreator.animecross.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HealthattributeProcedure {
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
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("1")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 24");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("2")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 28");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("3")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 32");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("4")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 36");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("5")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 40");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("6")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 24");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("7")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 28");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("8")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 32");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("9")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 36");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("10")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 40");
			}
		}
		if (((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Health).equals("11")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 44");
			}
		}
	}
}
