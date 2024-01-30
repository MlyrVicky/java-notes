package com.day11.pridicate;

import java.util.function.Predicate;

public class UseNegate {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (i)->i%2==0;
        Predicate<Integer> predicate2 = (i)->i>10;
        System.out.println(predicate2.negate().test(1));
            }
        }
