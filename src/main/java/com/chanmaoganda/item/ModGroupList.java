package com.chanmaoganda.item;

import com.chanmaoganda.block.ModBlockList;
import com.chanmaoganda.utils.RegisterUtils;

public class ModGroupList {
    public static final net.minecraft.item.ItemGroup ORIGINIUM_MATERIAL_GROUP =
            RegisterUtils.registerItemGroup("material_of_origin", ModItemList.ORIGINIUM, ModItemList.ItemList);

    public static final net.minecraft.item.ItemGroup ORIGINIUM_TOOLS_GROUP =
            RegisterUtils.registerToolGroup("tools_in_origin", ModToolList.ORIGINIUM_SWORD, ModToolList.ToolList);
    public static final net.minecraft.item.ItemGroup ORIGINIUM_BLOCKS_GROUP =
            RegisterUtils.registerBlockGroup("blocks_in_origin", ModBlockList.ORIGINIUM_BLOCK, ModBlockList.BlockList);
    public static final net.minecraft.item.ItemGroup ORIGINIUM_ARMORS_GROUP =
            RegisterUtils.registerItemGroup("armors_in_origin", ModArmorList.ORIGINIUM_CHESTPLATE, ModArmorList.ArmorList);


    public static void registerGroups(){
    }
}
