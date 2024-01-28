package com.code_practices.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s = "AABBCCCDDDEAAAAAA";

        Map<Character,Integer> map =new  LinkedHashMap<>();

        for (int i =0 ; i<s.length();i++){
            char c = s.charAt(i);
            System.out.println(i+" == "+c);
            if (map.containsKey(c)){
               int existingCount = map.get(c); // A, 1 -> A,2
                map.put(c,existingCount +1); // A,2 A,3
            }else {
                map.put(c,1);// A,1
            }
            System.out.println(map);
        }

        System.out.println(map);

    }
}
