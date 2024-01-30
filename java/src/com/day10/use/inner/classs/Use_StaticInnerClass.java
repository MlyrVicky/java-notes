package com.day10.use.inner.classs;


public class Use_StaticInnerClass {


    static class Demo {
        static void m1() {
            System.out.println("from 1");
        }

        void m2(){
            System.out.println("from2 ");
        }
    }

        public static void main(String[] args) {
            Demo.m1();  //--> this static method

            Demo test = new Demo();
             test.m2(); // --> this is public method

        }
}