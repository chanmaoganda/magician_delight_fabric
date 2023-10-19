package com.chanmaoganda.item;

import com.chanmaoganda.utils.RegisterUtils;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModToolList {
    public static final List<Item> ToolList = new ArrayList<>();

    public static final Item ORIGINIUM_SWORD = RegisterUtils.registerToolItems("originium_sword" , 6.0F, -2.4F);
    public static final Item ORIGINIUM_PICKAXE = RegisterUtils.registerToolItems("originium_pickaxe" ,3.0F, -3.0F);

    public static void RegisterHandler(){
    }
}
