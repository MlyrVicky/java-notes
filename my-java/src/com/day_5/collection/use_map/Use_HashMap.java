package com.day_5.collection.use_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Use_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Range Rover",12000000);
        map.put("Range Rover",9800000);
        map.put("Mahindra thar",1500000);
        map.put("Royal Enfield ",300000);
        map.put("BMW i 7",9800000);
        map.put("BMW i78",24000000);


       /* System.out.println(map.keySet());  --> Keys store in Unique
                                           --> so the out put is unique */


       /* System.out.println(map.values());  --> Values store collection
                                             --> value are not unique is printing all values */


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String,Integer>entry : entrySet){
            System.out.println(entry.getKey()+ "  :  "+ entry.getValue());


        }


    }
}
