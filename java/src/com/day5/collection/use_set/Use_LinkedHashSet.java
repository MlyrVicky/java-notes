package com.day5.collection.use_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Use_LinkedHashSet {
/*
    note :it's  unique value only return. which value
     we're passing that same value printing the output.*/

    public static void main(String[] args) {
        Set<String > set = new LinkedHashSet<>();

        set.add("Range Rover");
        set.add("Range Rover");
        set.add("BMW i7");
        set.add("Royal Enfield ");
        set.add("Mahindra Thar");
    //    System.out.println(list);

     /*   for(String s:list){
            System.out.println(s);
        }*/
        Iterator<String > iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
