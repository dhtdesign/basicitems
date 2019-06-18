package dhtdesign.basic;

import dhtdesign.basic.proxy.CommonProxy;
import dhtdesign.basic.util.BasicTab;
import dhtdesign.basic.util.Reference;
import dhtdesign.basic.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final CreativeTabs basicTab = new BasicTab();

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries();
	}

}
