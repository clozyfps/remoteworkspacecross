
package net.mcreator.animecross.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.animecross.world.inventory.MainInfoMenu;
import net.mcreator.animecross.network.MainInfoButtonMessage;
import net.mcreator.animecross.network.AnimecrossModVariables;
import net.mcreator.animecross.AnimecrossMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MainInfoScreen extends AbstractContainerScreen<MainInfoMenu> {
	private final static HashMap<String, Object> guistate = MainInfoMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MainInfoScreen(MainInfoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecross:textures/tablet.png"));
		this.blit(ms, this.leftPos + -71, this.topPos + -55, 0, 0, 640, 640, 640, 640);

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecross:textures/62646a56e09d74b8a876aebf03a71304.png"));
		this.blit(ms, this.leftPos + -31, this.topPos + -29, 0, 0, 266, 65, 266, 65);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Level:", -26, 28, -16777216);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).level) + "", 7, 28, -1);
		this.font.draw(poseStack, "XP:", -25, 40, -16777216);
		this.font.draw(poseStack, "/50", 22, 40, -1);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).exp) + "", -6, 40, -1);
		this.font.draw(poseStack, "User:", -26, 144, -16777216);
		this.font.draw(poseStack, "" + ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).user_name) + "", 1, 144, -1);
		this.font.draw(poseStack, "Health", 167, 25, -16777216);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossModVariables.PlayerVariables())).Healthstat) + "", 202, 25, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 240, this.topPos + 21, 30, 20, new TextComponent("+"), e -> {
			if (true) {
				AnimecrossMod.PACKET_HANDLER.sendToServer(new MainInfoButtonMessage(0, x, y, z));
				MainInfoButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 160, this.topPos + 150, 61, 20, new TextComponent("Mastery"), e -> {
		}));
	}
}
