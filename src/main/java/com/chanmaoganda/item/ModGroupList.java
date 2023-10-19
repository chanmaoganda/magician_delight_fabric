package com.chanmaoganda.item;

import com.chanmaoganda.block.ModBlockList;
import com.chanmaoganda.utils.RegisterUtils;

public class ModGroupList {
    public static final net.minecraft.item.ItemGroup ORIGINIUM_MATERIAL_GROUP =
            RegisterUtils.registerItemGroup("material_of_origin", ModItemList.ORIGINIUM, ModItemList.ItemList);

    public static final net.minecraft.item.ItemGroup ORIGINIUM_TOOLS_GROUP =
            RegisterUtils.registerItemGroup("tools_in_origin", ModToolList.ORIGINIUM_SWORD, ModToolList.ToolList);
    public static final net.minecraft.item.ItemGroup ORIGINIUM_BLOCKS_GROUP =
            RegisterUtils.registerBlockGroup("blocks_in_origin", ModBlockList.ORIGINIUM_BLOCK, ModBlockList.BlockList);
//            Registry.register(Registries.ITEM_GROUP, new Identifier(Initializer.MOD_ID,"blocks_in_origin"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks_in_origin"))
//                    .icon(()-> new ItemStack(ModBlockLists.ORIGINIUM_BLOCK))
//                    .entries((displayContext, entries) -> {
//                        entries.add(ModBlockLists.ORIGINIUM_BLOCK);
//                        entries.add(ModBlockLists.MAGIC_IRON_BLOCK);
//
//                    }).build());

    public static void registerGroups(){
    }
}
