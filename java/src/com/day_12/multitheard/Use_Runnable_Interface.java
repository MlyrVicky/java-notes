package com.day_12.multitheard;

public class Use_Runnable_Interface {

    public static void main(String[] args) {
        GH gh = new GH();
        Thread t = new Thread(gh);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("parent class printing ");
        }


    }
}interface i{}

     class GH implements Runnable{
        @Override
        public void run() {
            for(int i =0;i<10;i++){
                System.out.println("child class printing ");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


