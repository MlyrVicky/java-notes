package com.day_11.funtional_interface;

public class Test {


    class B implements A {
        @Override
        public int add(int a, int b) {
            return a + b;
        }

    }


// funtional  interface

    @FunctionalInterface
    interface A {
        public int add(int a, int b);
    }



}