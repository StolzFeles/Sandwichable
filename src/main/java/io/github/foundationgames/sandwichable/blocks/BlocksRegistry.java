package io.github.foundationgames.sandwichable.blocks;

import io.github.foundationgames.sandwichable.Sandwichable;
import io.github.foundationgames.sandwichable.blocks.entity.*;
import io.github.foundationgames.sandwichable.items.InfoTooltipBlockItem;
import io.github.foundationgames.sandwichable.items.SandwichBlockItem;
import io.github.foundationgames.sandwichable.util.Util;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SandBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class BlocksRegistry {

    public static final Block SANDWICH_TABLE = new SandwichTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE).build());
    public static final Block LETTUCE = new LettuceCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).build());
    public static final Block TOMATOES = new TomatoCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).build());
    public static final Block ONIONS = new OnionCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).build());
    public static final Block CUCUMBERS = new CucumberCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).build());

    public static final Block SANDWICH = new SandwichBlock(FabricBlockSettings.copy(Blocks.CAKE).nonOpaque().build());

    public static final Block OAK_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block BIRCH_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block SPRUCE_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block JUNGLE_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block ACACIA_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block DARK_OAK_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block CRIMSON_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block WARPED_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());

    public static final Block ANDESITE_BASIN = new BasinBlock(FabricBlockSettings.copy(Blocks.ANDESITE).build());
    public static final Block DIORITE_BASIN = new BasinBlock(FabricBlockSettings.copy(Blocks.DIORITE).build());
    public static final Block GRANITE_BASIN = new BasinBlock(FabricBlockSettings.copy(Blocks.GRANITE).build());
    public static final Block BASALT_BASIN = new BasinBlock(FabricBlockSettings.copy(Blocks.POLISHED_BASALT).build());
    public static final Block BLACKSTONE_BASIN = new BasinBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE).build());

    public static final Block TOASTER = new ToasterBlock(FabricBlockSettings.copy(Blocks.STONECUTTER).build());

    public static final Block DESALINATOR = new DesalinatorBlock(FabricBlockSettings.copy(Blocks.STONECUTTER).lightLevel(13).build());

    public static final Block PICKLE_JAR = new PickleJarBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE).build());

    public static final Block SHRUB = new ShrubBlock(FabricBlockSettings.copy(Blocks.DEAD_BUSH).build());
    public static final Block SALTY_SAND = new SandBlock(14406560, FabricBlockSettings.copy(Blocks.SAND).build());

    public static final Block POTTED_SHRUB = new PottedShrubBlock(SHRUB, FabricBlockSettings.copy(Blocks.POTTED_DEAD_BUSH).build());

    public static BlockEntityType<SandwichTableBlockEntity> SANDWICHTABLE_BLOCKENTITY;
    public static BlockEntityType<SandwichBlockEntity> SANDWICH_BLOCKENTITY;
    public static BlockEntityType<CuttingBoardBlockEntity> CUTTINGBOARD_BLOCKENTITY;
    public static BlockEntityType<ToasterBlockEntity> TOASTER_BLOCKENTITY;
    public static BlockEntityType<BasinBlockEntity> BASIN_BLOCKENTITY;
    public static BlockEntityType<PickleJarBlockEntity> PICKLEJAR_BLOCKENTITY;
    public static BlockEntityType<DesalinatorBlockEntity> DESALINATOR_BLOCKENTITY;

    public static void init() {
        registerBlock(SANDWICH_TABLE, "sandwich_table", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(TOASTER, "toaster", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(ANDESITE_BASIN, "andesite_basin", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(DIORITE_BASIN, "diorite_basin", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(GRANITE_BASIN, "granite_basin", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(BASALT_BASIN, "basalt_basin", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(BLACKSTONE_BASIN, "blackstone_basin", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(OAK_CUTTING_BOARD, "oak_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(BIRCH_CUTTING_BOARD, "birch_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(SPRUCE_CUTTING_BOARD, "spruce_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(JUNGLE_CUTTING_BOARD, "jungle_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(ACACIA_CUTTING_BOARD, "acacia_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(DARK_OAK_CUTTING_BOARD, "dark_oak_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(CRIMSON_CUTTING_BOARD, "crimson_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(WARPED_CUTTING_BOARD, "warped_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(SHRUB, "shrub", Sandwichable.SANDWICHABLE_ITEMS);

        registerBlock(POTTED_SHRUB, "potted_shrub");
        registerBlock(PICKLE_JAR, "pickle_jar");

        registerBlock(SALTY_SAND, "salty_sand", Sandwichable.SANDWICHABLE_ITEMS);
        registerBlock(DESALINATOR, "desalinator", Sandwichable.SANDWICHABLE_ITEMS);

        registerSandwich(SANDWICH, "sandwich");

        registerBlock(LETTUCE, "lettuce");
        registerBlock(TOMATOES, "tomatoes");
        registerBlock(CUCUMBERS, "cucumbers");
        registerBlock(ONIONS, "onions");

        SANDWICHTABLE_BLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Util.id("sandwich_table_ent"), BlockEntityType.Builder.create(SandwichTableBlockEntity::new, SANDWICH_TABLE).build(null));
        CUTTINGBOARD_BLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Util.id("cutting_board_ent"), BlockEntityType.Builder.create(CuttingBoardBlockEntity::new, OAK_CUTTING_BOARD, BIRCH_CUTTING_BOARD, SPRUCE_CUTTING_BOARD, JUNGLE_CUTTING_BOARD, ACACIA_CUTTING_BOARD, DARK_OAK_CUTTING_BOARD, CRIMSON_CUTTING_BOARD, WARPED_CUTTING_BOARD).build(null));
        SANDWICH_BLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Util.id("sandwich_ent"), BlockEntityType.Builder.create(SandwichBlockEntity::new, SANDWICH).build(null));
        TOASTER_BLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Util.id("toaster_ent"), BlockEntityType.Builder.create(ToasterBlockEntity::new, TOASTER).build(null));
        BASIN_BLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Util.id("basin_ent"), BlockEntityType.Builder.create(BasinBlockEntity::new, ANDESITE_BASIN, GRANITE_BASIN, DIORITE_BASIN, BASALT_BASIN, BLACKSTONE_BASIN).build(null));
        PICKLEJAR_BLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Util.id("pickle_jar_ent"), BlockEntityType.Builder.create(PickleJarBlockEntity::new, PICKLE_JAR).build(null));
        DESALINATOR_BLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Util.id("desalinator_ent"), BlockEntityType.Builder.create(DesalinatorBlockEntity::new, DESALINATOR).build(null));
    }

    public static void registerBlock(Block block, String name, ItemGroup group) {
        registerBlock(block, name);
        Registry.register(Registry.ITEM, Util.id(name), new InfoTooltipBlockItem(block, new Item.Settings().group(group)));
    }

    public static void registerSandwich(Block block, String name) {
        Registry.register(Registry.BLOCK, Util.id(name), block);
        Registry.register(Registry.ITEM, Util.id(name), new SandwichBlockItem(block));
    }

    public static void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, Util.id(name), block);
    }
}
