package com.chanmaoganda.item;

import com.chanmaoganda.utils.RegisterUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;

import java.util.ArrayList;
import java.util.List;

public class ModToolList {
    public static final List<ToolItem> ToolList = new ArrayList<>();

    public static final ToolItem ORIGINIUM_SWORD = RegisterUtils.registerToolItems(
            "originium_sword" , ToolMaterialList.ORIGINIUM,5.0F, -2.4F);
    public static final ToolItem ORIGINIUM_SHOVEL = RegisterUtils.registerToolItems(
            "originium_shovel" , ToolMaterialList.ORIGINIUM,3.5F, -3.0F);
    public static final ToolItem ORIGINIUM_PICKAXE = RegisterUtils.registerToolItems(
            "originium_pickaxe" , ToolMaterialList.ORIGINIUM,3.0F, -2.8F);
    public static final ToolItem ORIGINIUM_AXE = RegisterUtils.registerToolItems(
            "originium_axe" , ToolMaterialList.ORIGINIUM,8.0F, -3.0F);
    public static final ToolItem ORIGINIUM_HOE = RegisterUtils.registerToolItems(
            "originium_hoe" , ToolMaterialList.ORIGINIUM,0.0F, 0.0F);

    public static void RegisterHandler(){
    }
}
