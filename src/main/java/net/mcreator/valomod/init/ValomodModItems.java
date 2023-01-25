
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.valomod.item.RadianiteItem;
import net.mcreator.valomod.ValomodMod;

public class ValomodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ValomodMod.MODID);
	public static final RegistryObject<Item> SAGE = REGISTRY.register("sage_spawn_egg",
			() -> new ForgeSpawnEggItem(ValomodModEntities.SAGE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> JETT = REGISTRY.register("jett_spawn_egg",
			() -> new ForgeSpawnEggItem(ValomodModEntities.JETT, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> REYNA = REGISTRY.register("reyna_spawn_egg",
			() -> new ForgeSpawnEggItem(ValomodModEntities.REYNA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RADIANITE = REGISTRY.register("radianite", () -> new RadianiteItem());
	public static final RegistryObject<Item> RADIANITE_ORE = block(ValomodModBlocks.RADIANITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RADIANITE_BLOCK = block(ValomodModBlocks.RADIANITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
