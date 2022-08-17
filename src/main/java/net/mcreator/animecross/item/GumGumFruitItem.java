
package net.mcreator.animecross.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.animecross.procedures.GumGumFruitPlayerFinishesUsingItemProcedure;

import java.util.List;

public class GumGumFruitItem extends Item {
	public GumGumFruitItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 20;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Eating This Fruit Gives You Stretchy Perks!"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GumGumFruitPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
