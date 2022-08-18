
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.animecross.client.renderer.ScoutRegimentMemberRenderer;
import net.mcreator.animecross.client.renderer.MarineRenderer;
import net.mcreator.animecross.client.renderer.GatlingrangeditemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnimecrossModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AnimecrossModEntities.ODMSTRING.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AnimecrossModEntities.GUM_GUM_PISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AnimecrossModEntities.MARINE.get(), MarineRenderer::new);
		event.registerEntityRenderer(AnimecrossModEntities.GATLINGRANGEDITEM.get(), GatlingrangeditemRenderer::new);
		event.registerEntityRenderer(AnimecrossModEntities.SCOUT_REGIMENT_MEMBER.get(), ScoutRegimentMemberRenderer::new);
	}
}
