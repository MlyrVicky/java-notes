package com.day_12.multitheard;

public class Use_ThreadJoin1 {


    public static void main(String[] args) throws InterruptedException {
        Mo mo = new Mo();
        mo.start();
        mo.join(); // main Thread to waite child thread to complete execution.
        for (int i = 0; i < 10; i++) {
            System.out.println("use main thread ");
        }
    }
}
class Mo extends Thread{
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

