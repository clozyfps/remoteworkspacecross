
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.EsperEffectStartedappliedProcedure;

public class EsperMobEffect extends MobEffect {
	public EsperMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -15621889);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecross.esper";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		EsperEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
