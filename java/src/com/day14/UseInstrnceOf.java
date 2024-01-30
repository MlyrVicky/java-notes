package com.day14;

public class UseInstrnceOf {
    public static void main(String[] args) {

        Object object = "10000" ;
        if(object instanceof String s ){

            System.out.println(s.length());
        }
    }
}
