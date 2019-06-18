package dhtdesign.basic.util.handlers;

import dhtdesign.basic.init.ModBlocks;
import dhtdesign.basic.init.ModItems;
import dhtdesign.basic.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

<<<<<<< HEAD
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		// TileEntityHandler.registerTileEntities();

	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {

		for (Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel) item).registerModels();
			}
		}

		for (Block block : ModBlocks.BLOCKS) {
			if (block instanceof IHasModel) {
				((IHasModel) block).registerModels();
			}
		}

	}

	public static void otherRegisters() {
		// GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
	}

	public static void preInitRegistries() {
		// RegistryHandler.otherRegisters();
		// GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);

	}

	public static void initRegistries() {
		// ModRecipes.init();

		// OreDictionary.registerOre("hammer", new ItemStack(ModItems.HAMMER, 1,
		// OreDictionary.WILDCARD_VALUE));

		// NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());

		// OreDictionaryCompat.registerOres();
	}

	public static void postInitRegistries() {

	}
=======
public class RegistryHandler 
{

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		//TileEntityHandler.registerTileEntities();
		
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		
		
		for (Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		
		for (Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
	}
	public static void otherRegisters()
	{
		//GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
	}
	
	
	public static void preInitRegistries()
	{
		//RegistryHandler.otherRegisters();
		//GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
	}
	
	public static void initRegistries()
	{
		//ModRecipes.init();
		
		//OreDictionary.registerOre("hammer",  new ItemStack(ModItems.HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		
	//	NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		
		//OreDictionaryCompat.registerOres();
	}
	
	public static void postInitRegistries()
	{
		
}
	
>>>>>>> master

}
