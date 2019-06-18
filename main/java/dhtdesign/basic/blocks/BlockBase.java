package dhtdesign.basic.blocks;

import dhtdesign.basic.Main;
import dhtdesign.basic.init.ModBlocks;
import dhtdesign.basic.init.ModItems;
import dhtdesign.basic.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{

	public BlockBase(String name, Material material)

	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.basicTab);
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 1);

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
}

}
