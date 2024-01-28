package com.boodcam1;

public class Demo {

    public static void main(String[] args) {


        int x =100;
        int y = 200;
        int z=300;

        int sum= add(x,y);
        System.out.println(sum-z);

    }
// *** note  if  i am remove static keyword there was error showing
    public static int add (int a, int b){
        int x =a;
        int y=b;
        int c= x+y;
        System.out.println(c);

        return c;
    }
}
