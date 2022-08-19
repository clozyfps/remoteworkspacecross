
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.EvilSpiritEffectStartedappliedProcedure;

public class EvilSpiritMobEffect extends MobEffect {
	public EvilSpiritMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16724737);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecross.evil_spirit";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		EvilSpiritEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
