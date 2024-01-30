package com.day14.use.map.array.easy.way;

import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer,Integer>map = Map.of(1,3,3,2,89,67);

      Set<Map.Entry<Integer, Integer>>enry = map.entrySet();

      for(Map.Entry<Integer, Integer> en:enry){
          System.out.println("key : "+en.getKey() +" "+"values : "+en.getValue());
      }
    }
}
