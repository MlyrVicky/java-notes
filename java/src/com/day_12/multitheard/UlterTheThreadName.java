package com.day_12.multitheard;

public class UlterTheThreadName {
    public static void main(String[] args) {
        Thread.currentThread().setName("thread method");
        System.out.println(Thread.currentThread().getName());

    }
}
