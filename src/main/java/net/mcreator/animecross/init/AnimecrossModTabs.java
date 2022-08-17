
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AnimecrossModTabs {
	public static CreativeModeTab TAB_AOT;
	public static CreativeModeTab TAB_DRAGON_BALL;

	public static void load() {
		TAB_AOT = new CreativeModeTab("tabaot") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossModItems.ODM_GEAR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DRAGON_BALL = new CreativeModeTab("tabdragon_ball") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossModItems.ONE_STAR_DRAGON_BALL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
