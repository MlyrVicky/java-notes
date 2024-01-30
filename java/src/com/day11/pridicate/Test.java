package com.day11.pridicate;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i%2==0;
        System.out.println(predicate.test(100));
        }
    }

