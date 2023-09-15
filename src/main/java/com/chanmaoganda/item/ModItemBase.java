package com.chanmaoganda.item;

import net.minecraft.item.Item;

public class ModItemBase extends Item{
	public static String ItemName;

	public ModItemBase(String name, Settings settings) {
		super(settings);
		ItemName = name;
		Initializer.ModItems.add(this);
	}
}