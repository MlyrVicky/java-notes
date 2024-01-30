package com.day11.supplier;

import java.util.function.Supplier;

public class Use_Supplier {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 100;

        System.out.println(supplier.get());


    }
}