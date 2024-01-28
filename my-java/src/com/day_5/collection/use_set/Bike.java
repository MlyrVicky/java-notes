package com.day_5.collection.use_set;

import java.util.HashSet;
import java.util.Set;

public class Bike {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();  // --> is hashing .hashing  means his get the value faster.
        // a set is unique value only return.

        set.add(777777);
        set.add(888888);
        set.add(777777);


        // get() method not working HashSet() area.


        System.out.println(set);
    }
}
