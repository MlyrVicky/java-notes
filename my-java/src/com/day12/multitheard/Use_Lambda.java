package com.day12.multitheard;

public class Use_Lambda {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for(int i =0;i<5;i++){
                System.out.println("print first ");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        t.start();

        for(int i = 0 ; i<5 ;i++){
            System.out.println("print second ");
        }

    }
}

