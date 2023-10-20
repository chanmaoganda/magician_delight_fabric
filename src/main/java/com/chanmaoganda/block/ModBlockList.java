package com.chanmaoganda.block;

import com.chanmaoganda.utils.RegisterUtils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class ModBlockList {
    public static final List<Block> BlockList = new ArrayList<>();

    public static final Block ORIGINIUM_BLOCK = RegisterUtils.registerBlocks(
            "originium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block MAGIC_IRON_BLOCK = RegisterUtils.registerBlocks(
            "magic_iron_block", new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));


    public static void RegisterHandler(){
    }
}
