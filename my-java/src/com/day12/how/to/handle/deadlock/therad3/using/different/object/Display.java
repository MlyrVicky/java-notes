package com.day12.how.to.handle.deadlock.therad3.using.different.object;

public class Display {

    public synchronized void print(String name){
        for(int i = 0;i<10;i++){
            System.out.print("hello ");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}


