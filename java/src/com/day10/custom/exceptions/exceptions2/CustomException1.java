package com.day10.custom.exceptions.exceptions2;

public class CustomException1 {
    public static void main(String[] args) throws Exception {
        try {
            mutipleException(null);
        }catch (ArithmeticException a){
            System.out.println("the Arithmetic exception is handling ");
        }
    }

    public static void mutipleException(Integer i) throws ArithmeticException {
        if (i == null) {
            throw new ArithmeticException("this arithmetic exception ");
        }
        System.out.println(i);
    }
}



