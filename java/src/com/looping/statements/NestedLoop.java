package com.looping.statements;

public class NestedLoop {
    public static void main(String[] args) {
        //nestedLoopExp1();
        //nestedLoopExp2();
        // nestedLoopExample3();
        nestedExp4();

    }

    static void nestedLoopExp1() {

        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.println("******************");

            for (int j = 0; j < 5; j++) {
                System.out.print(j);
            }
            System.out.println();


        }
    }

    static void nestedLoopExp2() {
        System.out.println("example two");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void nestedLoopExample3() {
        System.out.println("example 3");
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void nestedExp4() {
        System.out.println("example 4");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}