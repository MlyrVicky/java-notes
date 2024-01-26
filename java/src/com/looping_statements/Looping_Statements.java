package com.looping_statements;

public class Looping_Statements {



    public static void main(String[] args) {
        // UseForLoopExp1();
        //UseDoWhileLoop();
        UseWhileLoop();
       

    }


    public static void UseForLoopExp1() {

        // initiation + condition + expression
        System.out.println("this is ");
        for (int i = 0; i <= 5; i++) {
            System.out.print(i);
        }
    }

    public static void UseDoWhileLoop() {
        System.out.println("this is do while loop :");
        int i = 0;
        do {
            System.out.print(i);
            i++;
        } while (i <= 5);


    }

    public static void UseWhileLoop() {
        System.out.println("this  while loop :");
        int i = 0;
        while (i <= 5) {
            System.out.print(i);
            i++;
        }
    }

   

}