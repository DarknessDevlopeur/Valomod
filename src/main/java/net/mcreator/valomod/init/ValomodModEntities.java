
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.valomod.entity.SageEntity;
import net.mcreator.valomod.entity.ReynaEntity;
import net.mcreator.valomod.entity.JettEntity;
import net.mcreator.valomod.ValomodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValomodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ValomodMod.MODID);
	public static final RegistryObject<EntityType<SageEntity>> SAGE = register("sage",
			EntityType.Builder.<SageEntity>of(SageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SageEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JettEntity>> JETT = register("jett",
			EntityType.Builder.<JettEntity>of(JettEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(JettEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReynaEntity>> REYNA = register("reyna",
			EntityType.Builder.<ReynaEntity>of(ReynaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ReynaEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SageEntity.init();
			JettEntity.init();
			ReynaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SAGE.get(), SageEntity.createAttributes().build());
		event.put(JETT.get(), JettEntity.createAttributes().build());
		event.put(REYNA.get(), ReynaEntity.createAttributes().build());
	}
}
