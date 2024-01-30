package com.day10.exception_handling;

public class ArithmeticException_1 {
    public static void main(String[] args) {
        int i = 0;
        int d = 3;

       try{
           System.out.println(d / i);
       }catch (ArithmeticException a){
           System.out.println("this is ArithmeticException");

           //System.out.println(a.getMessage());
       }catch (Exception e){
           System.out.println("mention second exception");

       }

        System.out.println("hello world");

    }
}
