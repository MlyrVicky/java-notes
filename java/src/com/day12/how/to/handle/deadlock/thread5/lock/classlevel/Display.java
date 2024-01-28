package com.day12.how.to.handle.deadlock.thread5.lock.classlevel;

public class Display {

    public static void print(String name) {

        synchronized (Display.class) {
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
}

/*
note :
          multithreading not allow.

          example : amount debit


               deadlock means  [race condition] [threads are waiting  by each other to complete infinitely  ]
*/


