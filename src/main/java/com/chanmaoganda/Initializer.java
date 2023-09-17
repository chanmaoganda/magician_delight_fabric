package com.chanmaoganda;

import com.chanmaoganda.block.ModBlockLists;
import com.chanmaoganda.item.ModItemGroup;
import com.chanmaoganda.item.ModItemLists;
import net.fabricmc.api.ModInitializer;

public class Initializer implements ModInitializer {
    public static final String MOD_ID = "magician_delight";

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();
        ModItemLists.RegisterHandler();
        ModBlockLists.RegisterHandler();
    }
}
