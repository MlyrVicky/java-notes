package com.day_11.pridicate;

import java.util.function.BiPredicate;

public class Use_Bipredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a + b == 10;

        System.out.println(biPredicate.test(5,5));
    }
}
