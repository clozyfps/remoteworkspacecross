
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

import net.mcreator.animecross.world.inventory.ClassguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ClassguiScreen extends AbstractContainerScreen<ClassguiMenu> {
	private final static HashMap<String, Object> guistate = ClassguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ClassguiScreen(ClassguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecross:textures/classgui.png");

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
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecross:textures/tablet.png"));
		this.blit(ms, this.leftPos + -160, this.topPos + -50, 0, 0, 640, 640, 640, 640);

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
		this.font.draw(poseStack, "Welcome To Anime Cross!", -61, -26, -16777216);
		this.font.draw(poseStack, "Pick your class and race.", -66, -13, -16777216);
		this.font.draw(poseStack, "Class", -99, 17, -16777216);
		this.font.draw(poseStack, "Race", 65, 18, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + -120, this.topPos + 31, 72, 20, new TextComponent("Swordsman"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + -113, this.topPos + 55, 56, 20, new TextComponent("Pirate"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + -118, this.topPos + 78, 67, 20, new TextComponent("Assassin"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 51, this.topPos + 31, 51, 20, new TextComponent("Slime"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 32, this.topPos + 54, 93, 20, new TextComponent("Cursed Spirit"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 35, this.topPos + 78, 82, 20, new TextComponent("Evil Spirit"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 48, this.topPos + 103, 56, 20, new TextComponent("Saiyan"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + -116, this.topPos + 102, 61, 20, new TextComponent("Shinobi"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 50, this.topPos + 127, 51, 20, new TextComponent("Esper"), e -> {
		}));
	}
}
