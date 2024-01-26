package com.day_5.collection.use_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Use_TreeSet {
    public static void main(String[] args) {

        // note : the output ascending only printing.
        //unique value only support
        Set<String> set = new TreeSet<>();
        set.add("Range Rover");
        set.add("Range Rover");
        set.add("BMW i7");
        set.add("Royal Enfield ");
        set.add("Mahindra Thar");

        Iterator<String>iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
