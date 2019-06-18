package dhtdesign.basic.items;

import dhtdesign.basic.Main;
import dhtdesign.basic.init.ModItems;
import dhtdesign.basic.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.basicTab);
		
		ModItems.ITEMS.add(this);
}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this , 0, "inventory");
		
	}

}
