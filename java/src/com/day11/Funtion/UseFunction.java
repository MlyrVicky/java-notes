package com.day11.Funtion;

import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> function = (i)->i*i; // 10*10 = 100
        Function<Integer,Integer> function2 = (i)->i+i;

        System.out.println(function.apply(10));
    }
}
