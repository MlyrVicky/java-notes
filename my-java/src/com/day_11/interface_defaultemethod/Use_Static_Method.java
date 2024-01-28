package com.day_11.interface_defaultemethod;

public class Use_Static_Method {

    interface A{
        static void m1(){
            System.out.println("this static method ");
        }

            public static void main(String[] args) {

                A.m1();
            }

        }

    }

