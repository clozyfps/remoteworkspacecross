
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.animecross.client.model.Modelwingsofffreee;
import net.mcreator.animecross.client.model.Modelslime;
import net.mcreator.animecross.client.model.Modelodm;
import net.mcreator.animecross.client.model.Modelluffyfist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AnimecrossModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelluffyfist.LAYER_LOCATION, Modelluffyfist::createBodyLayer);
		event.registerLayerDefinition(Modelodm.LAYER_LOCATION, Modelodm::createBodyLayer);
		event.registerLayerDefinition(Modelslime.LAYER_LOCATION, Modelslime::createBodyLayer);
		event.registerLayerDefinition(Modelwingsofffreee.LAYER_LOCATION, Modelwingsofffreee::createBodyLayer);
	}
}
