package com.day_11.anonymous.Interface;

public class Test {


    public static void main(String[] args) {
        A a = new A() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println(a.add(100, 200));
    }

    interface A {
        public int add(int a, int b);
    }

}

