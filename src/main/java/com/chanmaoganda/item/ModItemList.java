package com.chanmaoganda.item;

import com.chanmaoganda.utils.RegisterUtils;
import net.minecraft.item.*;

import java.util.ArrayList;
import java.util.List;


public class ModItemList {
    public static final List<Item> ItemList = new ArrayList<>();
    public static final Item ORIGINIUM = RegisterUtils.registerItems("originium");
    public static final Item RAW_ORIGINIUM = RegisterUtils.registerItems("raw_originium");
       /**
     * initialize this class to make sure all items are registered in the right order
     */
    public static void RegisterHandler(){
    }

}
