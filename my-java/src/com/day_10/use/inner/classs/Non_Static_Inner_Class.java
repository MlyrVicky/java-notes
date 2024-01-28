package com.day_10.use.inner.classs;

public class Non_Static_Inner_Class {

    class Bike{
        static void m1(){
            System.out.println("from");
        }
        void m2(){
            System.out.println("from2");
        }
    }

    public static void main(String[] args) {
        Non_Static_Inner_Class nonStatic_Obj = new Non_Static_Inner_Class();

        Bike.m1(); //--> we called  static method

        Bike bike = nonStatic_Obj.new Bike();

         bike.m2(); // ---> we called non-static method


    }

}
