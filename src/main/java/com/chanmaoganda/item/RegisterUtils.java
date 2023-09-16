package com.chanmaoganda.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterUtils {
    public static final Item STONE_OF_ORIGIN = registerModItems(new Item(new FabricItemSettings()), "stone_of_origin");
    public static final Item RAW_STONE_OF_ORIGIN = registerModItems(new Item(new FabricItemSettings()), "raw_stone_of_origin");

    private static void AddItemToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(STONE_OF_ORIGIN);
        entries.add(RAW_STONE_OF_ORIGIN);
    }
    private static Item registerModItems(Item item, String name){
        return Registry.register(Registries.ITEM, new Identifier(Initializer.MOD_ID, name), item);
    }

    public static void RegisterHandler(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(RegisterUtils::AddItemToIngredientItemGroup);
    }
}
