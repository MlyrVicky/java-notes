package com.day5.collection.use_set;

import java.util.HashSet;
import java.util.Set;

public class Ues_ForEach {
    public static void main(String[] args) {

        Set<Integer>set =new HashSet<>();
        set.add(23333);
        set.add(33333);
        set.add(33333);

        for (Integer i:set) {
            System.out.println(i);
        }

    }
}
