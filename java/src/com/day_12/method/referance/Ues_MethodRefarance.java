package com.day_12.method.referance;

public interface Ues_MethodRefarance {

    void t1();

    public class Bike {

        public static void m1 (){
            System.out.println("no argument passing");
        }
        void  m2(){
            System.out.println( "no 2");
        }

        public static void main(String[] args) {
            Ues_MethodRefarance I1 = Bike::m1;
            I1.t1();

            Bike b  = new Bike();

            Ues_MethodRefarance I2 = b ::m2;


        }
    }
}
