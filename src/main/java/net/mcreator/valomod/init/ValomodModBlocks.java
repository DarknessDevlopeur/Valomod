
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.valomod.block.RadianiteOreBlock;
import net.mcreator.valomod.block.RadianiteBlockBlock;
import net.mcreator.valomod.ValomodMod;

public class ValomodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ValomodMod.MODID);
	public static final RegistryObject<Block> RADIANITE_ORE = REGISTRY.register("radianite_ore", () -> new RadianiteOreBlock());
	public static final RegistryObject<Block> RADIANITE_BLOCK = REGISTRY.register("radianite_block", () -> new RadianiteBlockBlock());
}
