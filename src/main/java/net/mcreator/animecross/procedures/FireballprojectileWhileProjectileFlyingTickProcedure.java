package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class FireballprojectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 200, 0.1, 2, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 200, 0.1, 2, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LAVA, x, y, z, 200, 0.1, 2, 0.1, 1);
	}
}
