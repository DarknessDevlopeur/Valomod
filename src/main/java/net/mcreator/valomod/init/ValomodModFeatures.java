
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.valomod.world.features.ores.RadianiteOreFeature;
import net.mcreator.valomod.ValomodMod;

@Mod.EventBusSubscriber
public class ValomodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ValomodMod.MODID);
	public static final RegistryObject<Feature<?>> RADIANITE_ORE = REGISTRY.register("radianite_ore", RadianiteOreFeature::feature);
}
