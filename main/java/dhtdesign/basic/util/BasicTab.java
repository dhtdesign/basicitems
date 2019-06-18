package dhtdesign.basic.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BasicTab extends CreativeTabs 
{

	public BasicTab() { super("tabBasic"); }
	public ItemStack getTabIconItem() {	return new ItemStack(Items.IRON_INGOT);	}

}