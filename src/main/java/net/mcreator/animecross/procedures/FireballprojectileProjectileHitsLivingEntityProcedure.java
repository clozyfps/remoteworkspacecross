package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

public class FireballprojectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(3);
	}
}
