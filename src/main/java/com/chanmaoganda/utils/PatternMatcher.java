package com.chanmaoganda.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static ToolClassification tool_classify(String name){
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
    private static String pattern_match(String string, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(string);
        if(match.find()){
            return match.group();
        }
        return null;
    }
}
