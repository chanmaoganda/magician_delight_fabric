package com.chanmaoganda.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterUtils {
    public static Item registerModItems(ModItemBase item){
        return itemRegister(item, item.ItemName);
    }

    private static Item itemRegister(Item item, String name){
        return Registry.register(Registries.ITEM, new Identifier(Initializer.MOD_ID, name), item);
    }
}
