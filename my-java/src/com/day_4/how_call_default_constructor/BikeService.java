package com.day_4.how_call_default_constructor;

public class BikeService extends Bikes {
    public BikeService (){

        System.out.println("this child class constructor ");
    }

    public static void main(String[] args) {

        Bikes bikes = new Bikes();
    }
}
