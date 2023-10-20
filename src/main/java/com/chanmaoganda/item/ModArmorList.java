package com.chanmaoganda.item;

import com.chanmaoganda.utils.RegisterUtils;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModArmorList {
    public static final List<Item> ArmorList = new ArrayList<>();

    public static final Item ORIGINIUM_HELMET = RegisterUtils.registerArmorItems("originium_helmet", ArmorMaterialList.INSTANCE);
    public static final Item ORIGINIUM_CHESTPLATE = RegisterUtils.registerArmorItems("originium_chestplate", ArmorMaterialList.INSTANCE);
    public static final Item ORIGINIUM_LEGGINGS = RegisterUtils.registerArmorItems("originium_leggings", ArmorMaterialList.INSTANCE);
    public static final Item ORIGINIUM_BOOTS = RegisterUtils.registerArmorItems("originium_boots", ArmorMaterialList.INSTANCE);

    public static void RegisterHandler(){
    }
}
