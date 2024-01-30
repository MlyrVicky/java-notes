package com.type.casting;

public class Autoboxing {

    public static void main(String[] args) {
        // small value to big value that call autoboxing.
        int i = 1111;
        long l =i;

        int y = (int) l;
        System.out.println(y);


       //  note: java forced to convert int type


        long ln = 1000000000000l;
        float f =ln;
        double d =f;
        System.out.println(d);
    }
}
