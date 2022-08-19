package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.animecross.network.AnimecrossModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FireExplosionRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).power > 109
				&& (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).level >= 11) {
			{
				double _setval = (entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossModVariables.PlayerVariables())).power - 110;
				entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 50, 1, 2, 1, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, y, z, 500, 2, 2, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, y, z, 500, 2, 2, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, y, z, 500, 1, 2, 1, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, x, y, z, 500, 1, 2, 1, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, x, y, z, 500, 2, 2, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, x, y, z, 500, 3, 2, 3, 1);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, 11);
						entityiterator.setSecondsOnFire(10);
					}
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 200);
		}
	}
}
