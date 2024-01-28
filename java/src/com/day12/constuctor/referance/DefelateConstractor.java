package com.day12.constuctor.referance;

public interface DefelateConstractor {
    void m1();

    class H{
        H(){
            System.out.println("this is deflate method ");
        }

    }

    public static void main(String[] args) {
        DefelateConstractor I = H::new;
        I.m1();
    }

}


