package com.day5.collection.code_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s = "bbBBVVRREEE";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                int existingCount = map.get(c);
                map.put(c,existingCount +1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
