package com.day12.how.to.handle.deadlock.therad2.usingsynchronized;

public class Display {

    public  synchronized void print(String name) {
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
note : use synchronized
        -> is only one thread allowing.
        example :
         it means only one payment process is allowing at te time.


*/


