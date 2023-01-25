
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.valomod.client.renderer.SageRenderer;
import net.mcreator.valomod.client.renderer.ReynaRenderer;
import net.mcreator.valomod.client.renderer.JettRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ValomodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ValomodModEntities.SAGE.get(), SageRenderer::new);
		event.registerEntityRenderer(ValomodModEntities.JETT.get(), JettRenderer::new);
		event.registerEntityRenderer(ValomodModEntities.REYNA.get(), ReynaRenderer::new);
	}
}
