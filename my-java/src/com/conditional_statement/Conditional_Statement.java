package com.conditional_statement;

import java.util.Scanner;

public class Conditional_Statement {

   static  void nested_If_Condition(){

     //  note : this nested if condition is true then is checked inside the if condition.
        Scanner s = new Scanner(System.in);
        System.out.print("please enter your age : ");
        int age = s.nextInt();
        if(age > 18){
            System.out.println("his eligible for voting ");
            if(age ==60){
                System.out.println("his senior citizen  ");
            }
        }
    }

    static void use_If_Else(){
       Scanner s = new Scanner(System.in);
        System.out.print("please enter your age : ");
        int age = s.nextInt();

        if(age>= 18 ){
            System.out.println("his eligible for voting ");
        }else{
            System.out.println("his not eligible for voting ");
        }

    }
    static void use_else_If(){
       Scanner s = new Scanner(System.in);
        System.out.print("please enter your age : ");
        int age = s.nextInt();

        if(age>=18){
            System.out.println("his eligible for voting ");
        } else if (age ==60){
            System.out.println("his senior citizen ");
        }else if(age <12 || age == 10){
            System.out.println("he is baby boy or girl ");
        }else {
            System.out.println("his not eligible for voting ");
        }
    }

    static void use_Switch_Case(){

       // note : if you use lot oof if else statement that area use Switch case. 
       Scanner s = new Scanner(System.in);
        System.out.print("please enter 1 to 12 : ");
        int monthName = s.nextInt();

        switch (monthName){
            case 1 :
                System.out.println("January ");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("please enter the correct digit number ");
        }
    }
    public static void main(String[] args) {

           nested_If_Condition();
         // use_else_If();
         // use_If_Else();
       //use_Switch_Case();

    }
}
