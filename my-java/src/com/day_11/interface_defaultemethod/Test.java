package com.day_11.interface_defaultemethod;

public interface Test {

    default void use() {
        System.out.println("this is a default method ");
    }

    class A implements Test {

        public void use() {
            System.out.println("this is the override method ");
        }
    }
}
