package com.day5.collection.use_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Use_LikedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Range Rover",12000000);
        map.put("Range Rover",9800000);
        map.put("Mahindra thar",1500000);
        map.put("Royal Enfield ",300000);
        map.put("BMW i 7",9800000);
        map.put("BMW i78",24000000);


        Set<Map.Entry<String, Integer>>entrySet= map.entrySet();

        for(Map.Entry<String, Integer> entries:entrySet) {
            System.out.println(entries.getKey()+ " : " +entries.getValue());

        }

        for(Map.Entry<String, Integer> entries:entrySet) {

        }


    }
}
