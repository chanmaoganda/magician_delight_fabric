package com.chanmaoganda.block;

import com.chanmaoganda.Initializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockLists {

    public static final Block ORIGINIUM_BLOCK = registerBlock(new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),"originium_block");
    public static final Block MAGIC_IRON_BLOCK = registerBlock(new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)),"magic_iron_block");

    private static Block registerBlock(Block block, String name){
        registerBlockItem(block, name);
        return Registry.register(Registries.BLOCK, new Identifier(Initializer.MOD_ID, name), block);
    }
    private static Item registerBlockItem(Block block, String name){
        return Registry.register(Registries.ITEM, new Identifier(Initializer.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterHandler(){

    }
}
