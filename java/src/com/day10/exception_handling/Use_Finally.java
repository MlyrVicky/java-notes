package com.day10.exception_handling;

public class Use_Finally {
    public static void main(String[] args) {
        int[] num = new int[10];
        try {
            System.out.println(num[20]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("this ArrayIndexOutOfBoundsException");
        }finally {
            System.out.println("whatever you run the code is executed -->finally<---");
        }
    }

}