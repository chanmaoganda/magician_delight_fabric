package com.chanmaoganda.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import java.util.ArrayList;
import java.util.List;


public class Initializer implements ModInitializer {
    public static final String MOD_ID = "magician_delight";

    public static List<ModItemBase> ModItems = new ArrayList<>();

    // item instances
    public static final ModItemBase STONE_OF_ORIGIN = new ModItemBase("stone_of_origin", new FabricItemSettings());

    @Override
    public void onInitialize() {
        for(ModItemBase item : ModItems){
            RegisterUtils.registerModItems(item);
        }
    }
}
