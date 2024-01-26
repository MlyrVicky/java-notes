package com.day_12.multitheard;

public class Thread_Join_2 {

    public static void main(String[] args) throws InterruptedException {
        Cab.T = Thread.currentThread();

        Cab car = new Cab();
        Thread t = new Thread(car);
        t.start();
       t.interrupt();
        for (int i = 0; i < 5; i++) {

            Thread.sleep(500);
            System.out.println(" main method");
        }
    }

}

class Car extends Thread {
    static Thread T;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" this child class ");
            try {
                T.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

/*note : this time child method waite main method is executed
* */