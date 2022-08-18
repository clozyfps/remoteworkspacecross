
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

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

import net.mcreator.animecross.entity.ScoutRegimentMemberEntity;
import net.mcreator.animecross.entity.OdmstringEntity;
import net.mcreator.animecross.entity.MarineEntity;
import net.mcreator.animecross.entity.GumGumPistolEntity;
import net.mcreator.animecross.entity.GatlingrangeditemEntity;
import net.mcreator.animecross.AnimecrossMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimecrossModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AnimecrossMod.MODID);
	public static final RegistryObject<EntityType<OdmstringEntity>> ODMSTRING = register("projectile_odmstring",
			EntityType.Builder.<OdmstringEntity>of(OdmstringEntity::new, MobCategory.MISC).setCustomClientFactory(OdmstringEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GumGumPistolEntity>> GUM_GUM_PISTOL = register("projectile_gum_gum_pistol",
			EntityType.Builder.<GumGumPistolEntity>of(GumGumPistolEntity::new, MobCategory.MISC).setCustomClientFactory(GumGumPistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MarineEntity>> MARINE = register("marine",
			EntityType.Builder.<MarineEntity>of(MarineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MarineEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GatlingrangeditemEntity>> GATLINGRANGEDITEM = register("projectile_gatlingrangeditem",
			EntityType.Builder.<GatlingrangeditemEntity>of(GatlingrangeditemEntity::new, MobCategory.MISC)
					.setCustomClientFactory(GatlingrangeditemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ScoutRegimentMemberEntity>> SCOUT_REGIMENT_MEMBER = register("scout_regiment_member",
			EntityType.Builder.<ScoutRegimentMemberEntity>of(ScoutRegimentMemberEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ScoutRegimentMemberEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MarineEntity.init();
			ScoutRegimentMemberEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MARINE.get(), MarineEntity.createAttributes().build());
		event.put(SCOUT_REGIMENT_MEMBER.get(), ScoutRegimentMemberEntity.createAttributes().build());
	}
}
