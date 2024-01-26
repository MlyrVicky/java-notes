package com.day_4.parameter_constructor_using_super;

public class Test {
    public static void main(String[] args) {
        Mobiles mobiles = new Mobiles("apple","Range Rover","Royal enfield");
        System.out.println(mobiles.mobileName);
        System.out.println(mobiles.bikeName);
        System.out.println(mobiles.CarName);
    }
}
