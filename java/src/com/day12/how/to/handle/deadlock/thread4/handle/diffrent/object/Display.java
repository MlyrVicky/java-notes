package com.day12.how.to.handle.deadlock.thread4.handle.diffrent.object;

public class Display {

    public static synchronized void print(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("hello ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}

/*
note : use static
        -> is common for all object
        -> so different person debit the amount. is getting correct amount.

*/


