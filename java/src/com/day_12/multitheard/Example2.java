package com.day_12.multitheard;

public class Example2 {

    public static void main(String[] args) {
        Mo model = new Mo();
        model.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("use main thread ");
        }
    }
}
     class Model extends Thread{
        public  void run()  {
            for (int i = 0; i < 10; i++) {
                System.out.println("print child class");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
