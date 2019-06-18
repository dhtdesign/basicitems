package dhtdesign.basic.util;

<<<<<<< HEAD
import dhtdesign.basic.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.ItemStack;

public class BasicTab extends CreativeTabs {

	public BasicTab() {
		super("tabBasic");
	}

	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.INGOT_OBSIDIAN);
	}
=======
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BasicTab extends CreativeTabs 
{

	public BasicTab() { super("tabBasic"); }
	public ItemStack getTabIconItem() {	return new ItemStack(Items.IRON_INGOT);	}
>>>>>>> master

}