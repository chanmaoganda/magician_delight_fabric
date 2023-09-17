package com.chanmaoganda.item;

import com.chanmaoganda.Initializer;
import com.chanmaoganda.block.ModBlockLists;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ORIGINIUM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Initializer.MOD_ID,"start_of_origin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.start_of_origin"))
            .icon(()-> new ItemStack(ModItemLists.ORIGINIUM))
            .entries((displayContext, entries) -> {
                entries.add(ModItemLists.ORIGINIUM);
                entries.add(ModItemLists.RAW_ORIGINIUM);
                entries.add(ModBlockLists.ORIGINIUM_BLOCK);
                entries.add(ModBlockLists.MAGIC_IRON_BLOCK);

            }).build());
    public static void registerItemGroup(){
    }
}
