package com.day_12.multitheard;

public class Exapmle1 {
    public static void main(String[] args) throws InterruptedException {
             Model.childMethod();
        for (int i = 0; i < 5; i++) {
            System.out.println("use main thread ");
        }
    }

    class Model extends Exapmle1 {
        public static void childMethod() throws InterruptedException {
            Thread.sleep(3000);
            for (int i = 0; i < 5; i++) {
                System.out.println("print child class");
            }
        }

    }
}

