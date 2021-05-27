package de.theskyscout.challlenge.manager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;

public class RandommizierManager {

    int lower = 0;
    int upper = 1;

    public static ArrayList<Material> MATS = new ArrayList<Material>();
  
    // Get a random material!
    public static Material randomMaterial() {
        Random random = new Random();
        int choose = random.nextInt(MATS.size());
        Material material = MATS.get(choose);
        return material;
    }

    // Only to get a random number
    public static  int getRandom(int lower, int upper) {
         Random rand = new Random();
         int number = rand.nextInt((upper - lower) + 1) + lower;
         return number;
    }
    
    // List off a lot of items!
    // You have do add this in your main
    public static void setMats() {
        //Letter A
        MATS.add(Material.APPLE);
        MATS.add(Material.ACACIA_PLANKS);
        MATS.add(Material.ACACIA_WOOD);
        MATS.add(Material.ANDESITE);
        MATS.add(Material.ACACIA_BUTTON);
        MATS.add(Material.ACACIA_BOAT);
        MATS.add(Material.ACACIA_DOOR);
        MATS.add(Material.ACACIA_LOG);
        MATS.add(Material.ACACIA_STAIRS);
        MATS.add(Material.ANVIL);
        MATS.add(Material.ARROW);
        MATS.add(Material.ARMOR_STAND);
        MATS.add(Material.ACACIA_SAPLING);
        MATS.add(Material.ACACIA_FENCE);
        MATS.add(Material.ACACIA_FENCE_GATE);
        MATS.add(Material.ACACIA_PRESSURE_PLATE);
        MATS.add(Material.ACACIA_SIGN);
        MATS.add(Material.ACACIA_LEAVES);
        MATS.add(Material.ACACIA_TRAPDOOR);
        //Letter B
        MATS.add(Material.BIRCH_PRESSURE_PLATE);
        MATS.add(Material.BIRCH_WOOD);
        MATS.add(Material.BIRCH_FENCE);
        MATS.add(Material.BIRCH_BOAT);
        MATS.add(Material.BIRCH_FENCE_GATE);
        MATS.add(Material.BIRCH_BUTTON);
        MATS.add(Material.BIRCH_DOOR);
        MATS.add(Material.BIRCH_LEAVES);
        MATS.add(Material.BIRCH_LOG);
        MATS.add(Material.BIRCH_PLANKS);
        MATS.add(Material.BIRCH_SAPLING);
        MATS.add(Material.BIRCH_SLAB);
        MATS.add(Material.BIRCH_SIGN);
        MATS.add(Material.BIRCH_STAIRS);
        MATS.add(Material.BIRCH_WOOD);
        MATS.add(Material.BONE_BLOCK);
        MATS.add(Material.BONE);
        MATS.add(Material.BONE_MEAL);
        MATS.add(Material.BLAST_FURNACE);
        MATS.add(Material.BLUE_ICE);
        MATS.add(Material.BROWN_CONCRETE);
        MATS.add(Material.BLUE_DYE);
        MATS.add(Material.BARREL);
        MATS.add(Material.BEACON);
        MATS.add(Material.BAKED_POTATO);
        MATS.add(Material.BROWN_STAINED_GLASS_PANE);
        MATS.add(Material.BEEF);
        MATS.add(Material.BELL);
        MATS.add(Material.BLACK_BED);
        MATS.add(Material.BRICK_STAIRS);
        MATS.add(Material.BRICK);
        MATS.add(Material.BRICK_SLAB);
        MATS.add(Material.BROWN_DYE);
        MATS.add(Material.BROWN_BANNER);
        MATS.add(Material.BROWN_BED);
        MATS.add(Material.BROWN_WOOL);
        MATS.add(Material.BROWN_MUSHROOM);
        MATS.add(Material.BROWN_TERRACOTTA);
        //Letter C
        MATS.add(Material.CAKE);
        MATS.add(Material.CRAFTING_TABLE);
        MATS.add(Material.CAMPFIRE);
        MATS.add(Material.COBBLESTONE);
        MATS.add(Material.COOKIE);
        MATS.add(Material.COAL);
        MATS.add(Material.COAL_ORE);
        MATS.add(Material.CACTUS);
        MATS.add(Material.CARROT);
        MATS.add(Material.COD);
        MATS.add(Material.COD_BUCKET);
        MATS.add(Material.CHEST);
        MATS.add(Material.CYAN_BED);
        MATS.add(Material.COOKED_BEEF);
        MATS.add(Material.COOKED_CHICKEN);
        MATS.add(Material.COOKED_COD);
        MATS.add(Material.COOKED_SALMON);
        MATS.add(Material.COOKED_RABBIT);
        MATS.add(Material.CARTOGRAPHY_TABLE);
        MATS.add(Material.CHISELED_SANDSTONE);
        MATS.add(Material.CYAN_CONCRETE);
        MATS.add(Material.CYAN_STAINED_GLASS_PANE);
        MATS.add(Material.CYAN_STAINED_GLASS);
        MATS.add(Material.CYAN_WOOL);
        MATS.add(Material.CYAN_DYE);
        MATS.add(Material.CYAN_TERRACOTTA);
        //Letter D
        MATS.add(Material.DIAMOND);
        MATS.add(Material.DIAMOND_AXE);
        MATS.add(Material.DIAMOND_CHESTPLATE);
        MATS.add(Material.DIAMOND_HOE);
        MATS.add(Material.DIAMOND_ORE);
        MATS.add(Material.DIAMOND_BLOCK);
        MATS.add(Material.DIAMOND_BOOTS);
        MATS.add(Material.DIAMOND_HELMET);
        MATS.add(Material.DIAMOND_HORSE_ARMOR);
        MATS.add(Material.DIAMOND_LEGGINGS);
        MATS.add(Material.DIAMOND_SHOVEL);
        MATS.add(Material.DIAMOND_SWORD);
        MATS.add(Material.DIORITE);
        MATS.add(Material.DARK_PRISMARINE);
        MATS.add(Material.DARK_OAK_BOAT);
        MATS.add(Material.DARK_OAK_LOG);
        MATS.add(Material.DARK_OAK_SIGN);
        MATS.add(Material.DIRT);
        MATS.add(Material.DISPENSER);
        MATS.add(Material.DROPPER);
        MATS.add(Material.DARK_OAK_WOOD);
        MATS.add(Material.DARK_PRISMARINE_STAIRS);
        MATS.add(Material.DARK_OAK_SAPLING);
        MATS.add(Material.DAYLIGHT_DETECTOR);
        //Letter E
        MATS.add(Material.EMERALD);
        MATS.add(Material.EMERALD_ORE);
        MATS.add(Material.ENCHANTING_TABLE);
        MATS.add(Material.END_STONE);
        MATS.add(Material.ENDER_EYE);
        MATS.add(Material.EGG);
        MATS.add(Material.ELYTRA);
        MATS.add(Material.EMERALD_BLOCK);
        MATS.add(Material.ENDER_CHEST);
        MATS.add(Material.ENDER_PEARL);
        MATS.add(Material.END_STONE_BRICK_STAIRS);
        //Letter F
        MATS.add(Material.FURNACE);
        MATS.add(Material.FEATHER);
        MATS.add(Material.FERN);
        MATS.add(Material.FISHING_ROD);
        MATS.add(Material.FLINT);
        MATS.add(Material.FLINT_AND_STEEL);
        MATS.add(Material.FLOWER_POT);
        //Letter G
        MATS.add(Material.GLOWSTONE);
        MATS.add(Material.GRANITE);
        MATS.add(Material.GRANITE);
        MATS.add(Material.GLASS_BOTTLE);
        MATS.add(Material.GLASS);
        MATS.add(Material.GLASS_PANE);
        MATS.add(Material.GOLD_ORE);
        MATS.add(Material.GOLDEN_APPLE);
        MATS.add(Material.GOLDEN_AXE);
        MATS.add(Material.GOLD_INGOT);
        MATS.add(Material.GOLDEN_PICKAXE);
        MATS.add(Material.GOLDEN_HOE);
        MATS.add(Material.GOLDEN_SWORD);
        MATS.add(Material.GOLD_BLOCK);
        MATS.add(Material.GOLD_NUGGET);
        MATS.add(Material.GOLDEN_CARROT);
        MATS.add(Material.GREEN_DYE);
        MATS.add(Material.GREEN_BED);
        MATS.add(Material.GREEN_TERRACOTTA);
        MATS.add(Material.GREEN_STAINED_GLASS);
        MATS.add(Material.GRAY_DYE);
        MATS.add(Material.GRAY_CONCRETE);
        MATS.add(Material.GRAY_BED);
        MATS.add(Material.GRAY_BANNER);
        MATS.add(Material.GRAY_STAINED_GLASS);
        MATS.add(Material.GRASS_BLOCK);
        MATS.add(Material.GRASS);
        MATS.add(Material.GHAST_TEAR);
        MATS.add(Material.GRAVEL);
        //Letter H
        MATS.add(Material.HAY_BLOCK);
        MATS.add(Material.HOPPER);
        //Letter I
        MATS.add(Material.IRON_BARS);
        MATS.add(Material.IRON_AXE);
        MATS.add(Material.IRON_CHESTPLATE);
        MATS.add(Material.IRON_PICKAXE);
        MATS.add(Material.IRON_DOOR);
        MATS.add(Material.IRON_HELMET);
        MATS.add(Material.IRON_NUGGET);
        MATS.add(Material.IRON_INGOT);
        MATS.add(Material.IRON_BLOCK);
        MATS.add(Material.IRON_ORE);
        MATS.add(Material.IRON_SWORD);
        MATS.add(Material.IRON_TRAPDOOR);
        MATS.add(Material.ICE);
        MATS.add(Material.ITEM_FRAME);
        //Letter J
        MATS.add(Material.JUNGLE_WOOD);
        MATS.add(Material.JUKEBOX);
        MATS.add(Material.JUNGLE_BUTTON);
        MATS.add(Material.JUNGLE_BOAT);
        MATS.add(Material.JUNGLE_LOG);
        MATS.add(Material.JUNGLE_TRAPDOOR);
        MATS.add(Material.JUNGLE_PRESSURE_PLATE);
        //Letter K
        MATS.add(Material.KELP);
        //Letter L
        MATS.add(Material.LAPIS_ORE);
        MATS.add(Material.LEATHER);
        MATS.add(Material.LIME_DYE);
        MATS.add(Material.LIME_CONCRETE);
        MATS.add(Material.LIGHT_BLUE_DYE);
        MATS.add(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        MATS.add(Material.LIGHT_BLUE_CONCRETE_POWDER);
        MATS.add(Material.LEATHER_CHESTPLATE);
        MATS.add(Material.LEATHER_LEGGINGS);
        //Letter M
        MATS.add(Material.MAGENTA_CONCRETE);
        MATS.add(Material.MELON);
        MATS.add(Material.MELON_SEEDS);
        MATS.add(Material.MAGENTA_WOOL);
        MATS.add(Material.MAP);
        MATS.add(Material.MILK_BUCKET);
        MATS.add(Material.MINECART);
        //Letter N
        MATS.add(Material.NETHER_BRICK);
        MATS.add(Material.NETHER_STAR);
        MATS.add(Material.NETHERRACK);
        MATS.add(Material.NOTE_BLOCK);
        MATS.add(Material.NETHER_QUARTZ_ORE);
        //Letter O
        MATS.add(Material.OAK_WOOD);
        MATS.add(Material.ORANGE_DYE);
        MATS.add(Material.OAK_BOAT);
        MATS.add(Material.OAK_PLANKS);
        MATS.add(Material.OAK_DOOR);
        MATS.add(Material.OBSIDIAN);
        MATS.add(Material.OBSERVER);
        MATS.add(Material.ORANGE_BED);
        MATS.add(Material.ORANGE_BED);
        //Letter P
        MATS.add(Material.PRISMARINE);
        MATS.add(Material.PACKED_ICE);
        MATS.add(Material.PHANTOM_MEMBRANE);
        MATS.add(Material.PINK_DYE);
        MATS.add(Material.PUMPKIN);
        MATS.add(Material.PAPER);
        MATS.add(Material.PAINTING);
        MATS.add(Material.PINK_BED);
        MATS.add(Material.PINK_BANNER);
        MATS.add(Material.PISTON);
        MATS.add(Material.PORKCHOP);
        MATS.add(Material.PURPUR_BLOCK);
        MATS.add(Material.PURPLE_WOOL);
        MATS.add(Material.PUMPKIN_SEEDS);
        MATS.add(Material.PINK_CONCRETE_POWDER);
        //Letter Q
        MATS.add(Material.QUARTZ);
        MATS.add(Material.QUARTZ_BLOCK);
        MATS.add(Material.QUARTZ_SLAB);
        MATS.add(Material.QUARTZ_STAIRS);
        //Letter R
        MATS.add(Material.REDSTONE);
        MATS.add(Material.RED_DYE);
        MATS.add(Material.RED_SANDSTONE);
        MATS.add(Material.RED_SAND);
        MATS.add(Material.RED_BED);
        MATS.add(Material.RED_MUSHROOM);
        MATS.add(Material.REDSTONE_ORE);
        MATS.add(Material.REPEATER);
        MATS.add(Material.ROTTEN_FLESH);
        MATS.add(Material.ROSE_BUSH);
        //Letter S
        MATS.add(Material.SADDLE);
        MATS.add(Material.SANDSTONE);
        MATS.add(Material.SAND);
        MATS.add(Material.SPONGE);
        MATS.add(Material.STONE);
        MATS.add(Material.STONE_AXE);
        MATS.add(Material.STONE_HOE);
        MATS.add(Material.SUGAR);
        MATS.add(Material.STONE_PICKAXE);
        MATS.add(Material.SHIELD);
        MATS.add(Material.SUGAR_CANE);
        //Letter T
        MATS.add(Material.TNT);
        MATS.add(Material.TORCH);
        MATS.add(Material.TERRACOTTA);
        //Letter U

        //Letter V

        //Letter W
        MATS.add(Material.WOODEN_SWORD);
        MATS.add(Material.WOODEN_SHOVEL);
        MATS.add(Material.WOODEN_PICKAXE);
        MATS.add(Material.WOODEN_HOE);
        MATS.add(Material.WOODEN_AXE);
        MATS.add(Material.WET_SPONGE);
        MATS.add(Material.WHITE_CONCRETE);
        MATS.add(Material.WHITE_DYE);
        MATS.add(Material.WHITE_STAINED_GLASS_PANE);
        MATS.add(Material.WHITE_BANNER);
        MATS.add(Material.WHITE_BED);
        MATS.add(Material.WHEAT);
        MATS.add(Material.WHEAT_SEEDS);
        MATS.add(Material.WITHER_ROSE);
        MATS.add(Material.WATER_BUCKET);
        MATS.add(Material.WITHER_SKELETON_SKULL);
        MATS.add(Material.WRITABLE_BOOK);
        //Letter X

        //Letter Y
        MATS.add(Material.YELLOW_CONCRETE);
        MATS.add(Material.YELLOW_DYE);
        MATS.add(Material.YELLOW_BED);
        MATS.add(Material.YELLOW_BANNER);
        MATS.add(Material.YELLOW_STAINED_GLASS_PANE);
        MATS.add(Material.YELLOW_STAINED_GLASS);
        MATS.add(Material.YELLOW_WOOL);
        //Letter Z



    }


}
