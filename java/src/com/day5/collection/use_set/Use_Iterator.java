package com.day5.collection.use_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Use_Iterator {
    public static void main(String[] args) {
        Set<Integer>set = new HashSet<>();
        set.add(56666);
        set.add(75555);

        Iterator<Integer> i = set.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
         }
    }
}
