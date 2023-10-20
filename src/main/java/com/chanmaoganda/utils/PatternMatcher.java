package com.chanmaoganda.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static ToolClassification toolClassify(String name){
        if(pattern_match(name, "sword"))
            return ToolClassification.SWORD;
        if(pattern_match(name, "shovel"))
            return ToolClassification.SHOVEL;
        if(pattern_match(name, "pickaxe"))
            return ToolClassification.PICKAXE;
        if(pattern_match(name, "axe"))
            return ToolClassification.AXE;
        return ToolClassification.HOE;
    }
    public static ArmorClassification armorClassify(String name){
        if(pattern_match(name, "helmet"))
            return ArmorClassification.HELMET;
        if(pattern_match(name, "chestplate"))
            return ArmorClassification.CHESTPLATE;
        if(pattern_match(name, "leggings"))
            return ArmorClassification.LEGGINGS;
        return ArmorClassification.BOOTS;
    }

    private static boolean pattern_match(String string, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(string);
        return match.find();
    }
}
