package com.day_11.pridicate;

import java.util.function.Predicate;

public class UseAnd {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (i) -> i%2==0;
        Predicate<Integer>predicate2 = (i) -> i>10;

        System.out.println(predicate1.and(predicate2).test(100));


    }
}

