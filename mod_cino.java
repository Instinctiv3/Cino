package net.minecraft.src;

import java.util.Random;

public class mod_cino extends BaseMod
{
	public static Item CinoSword;
	
	public static Item CinoSpade;
	
	public static Item CinoPickaxe;
	
	public static Item CinoAxe;
	
	public static Item CinoHoe;
	
	public static Item CinoIngot;
	
	public static final Block CinoBlock;
	
	public static Item CinoHelmet;
	public static Item CinoChest;
	public static Item CinoLeggings;
	public static Item CinoBoots;
	
	static
	{
		CinoSword = (new ItemCinoSword(1001, EnumCinoToolMaterial.Cino)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoSword.png")).setItemName("CinoSword");
		CinoSpade = (new ItemCinoSpade(1002, EnumCinoToolMaterial.Cino)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoSpade.png")).setItemName("CinoSpade");
		CinoPickaxe = (new ItemCinoPickaxe(1003, EnumCinoToolMaterial.Cino)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoPick.png")).setItemName("CinoPickaxe");
		CinoAxe = (new ItemCinoAxe(1004, EnumCinoToolMaterial.Cino)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoAxe.png")).setItemName("CinoAxe");
		CinoHoe = (new ItemCinoHoe(1005, EnumCinoToolMaterial.Cino)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoHoe.png")).setItemName("CinoHoe");
		CinoBlock = (new BlockCino(130, ModLoader.addOverride("/terrain.png", "/mods/CinoOre.png"))).setHardness(3F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setBlockName("Cino Ore");
		CinoIngot = (new Item(1000)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/ingotcino.png")).setItemName("CinoIngot");
		CinoHelmet = (new ItemArmor(1006, EnumArmorMaterial.DIAMOND, 3, 0)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoHelmet.png")).setItemName("Helmet");
		CinoChest = (new ItemArmor(1007, EnumArmorMaterial.DIAMOND, 3, 1)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoChest.png")).setItemName("Chest");
		CinoLeggings = (new ItemArmor(1008, EnumArmorMaterial.DIAMOND, 3, 2)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoLegs.png")).setItemName("Leggings");
		CinoBoots = (new ItemArmor(1009, EnumArmorMaterial.DIAMOND, 3, 3)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mods/CinoBoots.png")).setItemName("Boots");
	}

	
	public void load()
	{
		
		
	}
	
	public mod_cino()
	{
		ModLoader.addName(CinoIngot, "Cino Ingot");
		ModLoader.addName(CinoSword, "Cino Sword");
		ModLoader.addName(CinoSpade, "Cino Spade");
		ModLoader.addName(CinoPickaxe, "Cino Pickaxe");
		ModLoader.addName(CinoAxe, "Cino Axe");
		ModLoader.addName(CinoHoe, "Cino Hoe");
		ModLoader.addName(CinoHelmet, "Cino Helmet");
		ModLoader.addName(CinoChest, "Cino Chest");
		ModLoader.addName(CinoLeggings, "Cino Legs");
		ModLoader.addName(CinoBoots, "Cino Boots");
		
		//Recipes
		//Armour
		ModLoader.addRecipe(new ItemStack(CinoHelmet, 1), new Object[]
				{
			"xxx", "x x", Character.valueOf('x'), CinoIngot
				});
		
		ModLoader.addRecipe(new ItemStack(CinoChest, 1), new Object[]
				{
			"x x", "xxx", "xxx", Character.valueOf('x'), CinoIngot
				});
		
		ModLoader.addRecipe(new ItemStack(CinoLeggings, 1), new Object[]
				{
			"xxx", "x x", "x x", Character.valueOf('x'), CinoIngot
				});
		
		ModLoader.addRecipe(new ItemStack(CinoBoots, 1), new Object[]
				{
			"x x", "x x", Character.valueOf('x'), CinoIngot
				});
		
		//Tools
		ModLoader.addRecipe(new ItemStack(CinoSword, 1), new Object[]
				{
					" S ", " S ", " L ", Character.valueOf('S'), CinoIngot, Character.valueOf('L'), Item.stick
				});
		
		ModLoader.addRecipe(new ItemStack(CinoSpade, 1), new Object[]
				{
					" S ", " L ", " L ", Character.valueOf('S'), CinoIngot, Character.valueOf('L'), Item.stick
				});
		
		ModLoader.addRecipe(new ItemStack(CinoPickaxe, 1), new Object[]
				{
					"SSS", " L ", " L ", Character.valueOf('S'), CinoIngot, Character.valueOf('L'), Item.stick
				});
		
		ModLoader.addRecipe(new ItemStack(CinoAxe, 1), new Object[]
				{
					"SS ", "SL ", " L ", Character.valueOf('S'), CinoIngot, Character.valueOf('L'), Item.stick
				});
		
		ModLoader.addRecipe(new ItemStack(CinoHoe, 1), new Object[]
				{
					"SS ", " L ", " L ", Character.valueOf('S'), CinoIngot, Character.valueOf('L'), Item.stick
				});
		
		ModLoader.addRecipe(new ItemStack(CinoAxe, 1), new Object[]
				{
					" SS", " LS", " L ", Character.valueOf('S'), CinoIngot, Character.valueOf('L'), Item.stick
				});
		
		ModLoader.addRecipe(new ItemStack(CinoHoe, 1), new Object[]
				{
					" SS", " L ", " L ", Character.valueOf('S'), CinoIngot, Character.valueOf('L'), Item.stick
				});
		
		ModLoader.registerBlock(CinoBlock);
		
		ModLoader.addName(CinoBlock, "Cino Ore");
		
		ModLoader.addSmelting(Block.planks.blockID, new ItemStack(CinoBlock, 1));

		ModLoader.addSmelting(CinoBlock.blockID, new ItemStack(CinoIngot, 1));

		
	}
	
	public void generateSurface(World world, Random rand, int chunkx, int chunkz)
	{
		//Cino Block Generation
		
		for(int l = 0; l < 45; l++)
		{
			
		int i1 = chunkx + rand.nextInt(16);
		int j1 = rand.nextInt(64);
		int k1 = chunkz + rand.nextInt(16);
		(new WorldGenMinable(CinoBlock.blockID, 20)).generate(world, rand, i1, j1, k1);
		
		
		}
		
		//end Cino Block Generation
		
		
		
		
	}
	
	public String getVersion()
	{
		return "Beta 0.1";
	}
}
