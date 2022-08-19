package net.mcreator.animecross.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.animecross.init.AnimecrossModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PunchasevilspiritProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(),
					event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossModMobEffects.EVIL_SPIRIT.get()) : false) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 1;
			zRadius = 1;
			for (int index0 = 0; index0 < (int) (36); index0++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x_pos, y_pos, z_pos, 50, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(5);
			}
		}
	}
}
