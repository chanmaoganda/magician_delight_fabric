package com.chanmaoganda.item;

import com.chanmaoganda.Initializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemLists {
    public static final Item ORIGINIUM = registerModItems(new Item(new FabricItemSettings()), "originium");
    public static final Item RAW_ORIGINIUM = registerModItems(new Item(new FabricItemSettings()), "raw_originium");

    private static void AddItemToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(ORIGINIUM);
        entries.add(RAW_ORIGINIUM);
    }
    private static Item registerModItems(Item item, String name){
        return Registry.register(Registries.ITEM, new Identifier(Initializer.MOD_ID, name), item);
    }

    public static void RegisterHandler(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemLists::AddItemToIngredientItemGroup);
    }
}
