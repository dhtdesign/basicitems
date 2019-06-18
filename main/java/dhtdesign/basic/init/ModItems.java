package dhtdesign.basic.init;

import java.util.ArrayList;
import java.util.List;

import dhtdesign.basic.items.ItemBase;
import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials (Armor stats {boots, legs, chest, helm})
	//public static final ToolMaterial MATERIAL_ENDER = EnumHelper.addToolMaterial("material_ender", 3, 3000, 9.0F, 4.0F, 22);
	//public static final ArmorMaterial ARMOR_MATERIAL_ENDER = EnumHelper.addArmorMaterial("armor_material_ender", Reference.MOD_ID + ":ender", 14, new int[] {5, 8, 10, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);


	// Items
	public static final Item INGOT_OBSIDIAN = new ItemBase("obsidian_ingot");
	
	

	//Tools
	//public static final ItemSword ENDER_SWORD = new ToolSword("ender_sword", MATERIAL_ENDER);
	//public static final ItemSpade ENDER_SHOVEL = new ToolSpade("ender_shovel", MATERIAL_ENDER);
	//public static final ItemPickaxe ENDER_PICKAXE = new ToolPickaxe("ender_pickaxe", MATERIAL_ENDER);
	//public static final ItemAxe ENDER_AXE = new ToolAxe("ender_axe", MATERIAL_ENDER);
	//public static final ItemHoe ENDER_HOE = new ToolHoe("ender_hoe", MATERIAL_ENDER);
	
	//public static final Item HAMMER = new ToolHammer("hammer");
	
	
	//Armor
	//public static final Item ENDER_HELMET = new ArmorBase("ender_helmet", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.HEAD );
	//public static final Item ENDER_CHESTPLATE = new ArmorBase("ender_chestplate", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.CHEST);
	//public static final Item ENDER_LEGGINGS = new ArmorBase("ender_leggings", ARMOR_MATERIAL_ENDER, 2, EntityEquipmentSlot.LEGS);
	//public static final Item ENDER_BOOTS = new ArmorBase("ender_boots", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.FEET);
	
	
	
	
}
