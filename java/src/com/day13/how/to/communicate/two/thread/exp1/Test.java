package com.day13.how.to.communicate.two.thread.exp1;

public class Test {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Thread t1 = new Thread(() -> {                // this is runnable lambda
            try {
                processor.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );

        Thread t2 = new Thread(() -> {

            try {
                processor.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );

        t1.start();
        t2.start();
    }

    /*
     note : like this way communicate on two thread.
          : we use .notify() -> this is relies the thread lock.
          : we use .waite()  -> is waiting  for the particular function.
                                if not mention .waite(); is continue looping.
     */
}