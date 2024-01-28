package com.day12.how.to.handle.deadlock.thread5.lock.object.level;


public class Test implements  Runnable{


Display display;
    String name;

    public Test(Display display, String name) {
        this.display = display;
        this.name = name;


    }

    @Override
    public void run() {  // delete this method

    }

   /* @Override
    public void run() {
        Display.print(name);
    }

    public static void main(String[] args) {
        Display display1 = new Display();

        Test test1 = new Test(display1, " vicky ");
        Test test2 = new Test(display1, " vinayaka ");

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        t1.start();
        t2.start();*/


    }
