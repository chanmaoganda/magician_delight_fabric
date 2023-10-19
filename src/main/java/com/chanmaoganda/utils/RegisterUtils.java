package com.chanmaoganda.utils;

import com.chanmaoganda.Initializer;
import com.chanmaoganda.block.ModBlockList;
import com.chanmaoganda.item.CustomToolMaterial;
import com.chanmaoganda.item.ModItemList;
import com.chanmaoganda.item.ModToolList;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class RegisterUtils {
    public static ItemGroup registerItemGroup(String path, ItemConvertible item, List<Item> list){
        return Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(Initializer.MOD_ID,path),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + path))
            .icon(()-> new ItemStack(item))
            .entries((displayContext, entries) -> {
                for(Item item1 : list)
                    entries.add(item1);
            }).build());
    }
    public static ItemGroup registerBlockGroup(String path, ItemConvertible item, List<Block> list){
        return Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(Initializer.MOD_ID,path),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + path))
            .icon(()-> new ItemStack(item))
            .entries((displayContext, entries) -> {
                for(Block block1 : list)
                    entries.add(block1);
            }).build());
    }

    public static Item registerItems(String name){
        Item item = new Item(new FabricItemSettings());
        ModItemList.ItemList.add(item);
        return Registry.register(Registries.ITEM, new Identifier(Initializer.MOD_ID, name), item);
    }


    /**
     * auto-detect the kind of tools, classify it to different varieties.
     * name must contain one of the names of the tools
     * */
    public static Item registerToolItems(String name, float Attackdamage, float Attackspeed) {
        //auto-detect the kind of tools
        ToolClassification classification = PatternMatcher.tool_classify(name);
        Item registering = switchToolFields(classification,Attackdamage, Attackspeed);
        ModToolList.ToolList.add(registering);
        return Registry.register(Registries.ITEM, new Identifier(Initializer.MOD_ID, name), registering);
    }

//    public static Item registerArmorItems(String name){
//
//    }

    public static Block registerBlocks(Block block, String name){
        Registry.register(Registries.ITEM, new Identifier(Initializer.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        ModBlockList.BlockList.add(block);
        return Registry.register(Registries.BLOCK, new Identifier(Initializer.MOD_ID, name), block);
    }

    private static Item switchToolFields(ToolClassification classification, float Attackdamage, float Attackspeed){
        return
            switch (classification) {
                case AXE -> new AxeItem(CustomToolMaterial.INSTANCE, Attackdamage, Attackspeed, new Item.Settings());
                case SWORD -> new SwordItem(CustomToolMaterial.INSTANCE, (int) Attackdamage, Attackspeed, new Item.Settings());
                case PICKAXE -> new PickaxeItem(CustomToolMaterial.INSTANCE, (int) Attackdamage, Attackspeed, new Item.Settings());
                case SHOVEL -> new ShovelItem(CustomToolMaterial.INSTANCE, Attackdamage, Attackspeed, new Item.Settings());
                case HOE -> new HoeItem(CustomToolMaterial.INSTANCE, (int) Attackdamage, Attackspeed, new Item.Settings());
            };
    }


}
