package com.day10.custom.exceptions.exceptions;

public class CustomExp1 {
    public static void main(String[] args) throws Exception {
        try {
            mutipleException(null); //<---- this is static method.
        }catch (HandelNullException a){
            System.out.println(a.getMessage());
        }
    }

    public static void mutipleException(Integer i) throws HandelNullException {
        if (i == null) {
            throw new HandelNullException("handle null exception ");
        }
        System.out.println(i);
    }
}

