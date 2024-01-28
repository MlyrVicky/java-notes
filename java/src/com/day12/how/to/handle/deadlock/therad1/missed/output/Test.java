package com.day12.how.to.handle.deadlock.therad1.missed.output;

public class Test implements Runnable {
    Display display;
    String name;

    public Test(Display display, String name) {
        this.display = display;
        this.name = name;


    }

    @Override
    public void run() {
        display.print(name);
    }

    public static void main(String[] args) {
        Display display1 = new Display();
        Test test1 = new Test(display1, " vicky ");
        Test test2 = new Test(display1, " vinayaka ");

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        t1.start();
        t2.start();
/*

note : this process like payment debit and credit. every time some person debit the amount or credit the amount right
       that time processing  this type of code.

        but the output missed right.

            because two person debit amount same time. that why the output is missed.

            so how to solve it :
                use synchronised is only one thread allow the area.


*/

    }
}
