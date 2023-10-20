package com.chanmaoganda.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static ToolClassification toolClassify(String name){
        if(pattern_match(name, "pickaxe") != null)
            return ToolClassification.PICKAXE;
        if(pattern_match(name, "sword") != null)
            return ToolClassification.SWORD;
        if(pattern_match(name, "shovel") != null)
            return ToolClassification.SHOVEL;
        if(pattern_match(name, "axe") != null)
            return ToolClassification.AXE;
        return ToolClassification.HOE;
    }
    public static ArmorClassification armorClassify(String name){
        if(pattern_match(name, "helmet") != null)
            return ArmorClassification.HELMET;
        if(pattern_match(name, "chestplate") != null)
            return ArmorClassification.CHESTPLATE;
        if(pattern_match(name, "leggings") != null)
            return ArmorClassification.LEGGINGS;
        return ArmorClassification.BOOTS;
    }

    private static String pattern_match(String string, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(string);
        if(match.find()){
            return match.group();
        }
        return null;
    }
}
