package com.chanmaoganda;

import com.chanmaoganda.block.ModBlockList;
import com.chanmaoganda.item.ModArmorList;
import com.chanmaoganda.item.ModGroupList;
import com.chanmaoganda.item.ModItemList;
import com.chanmaoganda.item.ModToolList;
import net.fabricmc.api.ModInitializer;


public class Initializer implements ModInitializer {
    public static final String MOD_ID = "magician_delight";
    public static final String Author = "Avania";

    @Override
    public void onInitialize() {
        ModGroupList.registerGroups();
        ModItemList.RegisterHandler();
        ModToolList.RegisterHandler();
        ModArmorList.RegisterHandler();
        ModBlockList.RegisterHandler();
    }
}
