package net.mcreator.animecross.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.animecross.AnimecrossMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimecrossModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		AnimecrossMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.max_power = original.max_power;
			clone.level = original.level;
			clone.power = original.power;
			clone.player_joins_first_time = original.player_joins_first_time;
			clone.exp = original.exp;
			clone.user_name = original.user_name;
			clone.has_odm_gear = original.has_odm_gear;
			clone.odm_air = original.odm_air;
			clone.has7dragonballs = original.has7dragonballs;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("animecross", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double max_power = 0;
		public double level = 0;
		public double power = 0;
		public double player_joins_first_time = 0;
		public double exp = 0;
		public String user_name = "\"\"";
		public double has_odm_gear = 0;
		public double odm_air = 0;
		public boolean has7dragonballs = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				AnimecrossMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("max_power", max_power);
			nbt.putDouble("level", level);
			nbt.putDouble("power", power);
			nbt.putDouble("player_joins_first_time", player_joins_first_time);
			nbt.putDouble("exp", exp);
			nbt.putString("user_name", user_name);
			nbt.putDouble("has_odm_gear", has_odm_gear);
			nbt.putDouble("odm_air", odm_air);
			nbt.putBoolean("has7dragonballs", has7dragonballs);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			max_power = nbt.getDouble("max_power");
			level = nbt.getDouble("level");
			power = nbt.getDouble("power");
			player_joins_first_time = nbt.getDouble("player_joins_first_time");
			exp = nbt.getDouble("exp");
			user_name = nbt.getString("user_name");
			has_odm_gear = nbt.getDouble("has_odm_gear");
			odm_air = nbt.getDouble("odm_air");
			has7dragonballs = nbt.getBoolean("has7dragonballs");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.max_power = message.data.max_power;
					variables.level = message.data.level;
					variables.power = message.data.power;
					variables.player_joins_first_time = message.data.player_joins_first_time;
					variables.exp = message.data.exp;
					variables.user_name = message.data.user_name;
					variables.has_odm_gear = message.data.has_odm_gear;
					variables.odm_air = message.data.odm_air;
					variables.has7dragonballs = message.data.has7dragonballs;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
