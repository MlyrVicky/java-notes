package com.day_11.interface_defaultemethod;

public class Demo {

    interface A {
        default void m1() {
            System.out.println("from A");
        }

    }

    interface B {
        default void m1() {
            System.out.println("from B");
        }
    }

    class Test implements A, B {
        @Override
        public void m1() {

        }
    }
}
