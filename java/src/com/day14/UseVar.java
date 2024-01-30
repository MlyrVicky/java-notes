package com.day14;


import java.util.LinkedHashMap;


public class UseVar {

    public static  void main(String[] args) {
       // Map<Integer,Integer> map = new LinkedHashMap<>();

        var map = new LinkedHashMap<>();
        map.put("Vignesh",24);

       for(var entry : map.entrySet()){
           System.out.println(entry.getKey()+" "+ entry.getValue());
       }

    }
}
