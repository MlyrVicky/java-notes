package com.day_12.constuctor.referance;

public interface ParameterConstractor {

    void m1(String name1,String name2);

    class K{

        K(String n1,String n2){
            System.out.println(n1+" "+n2);
        }
    }

    public static void main(String[] args) {
        ParameterConstractor I = K::new;

        I.m1("vignesh","mani");
    }
}
