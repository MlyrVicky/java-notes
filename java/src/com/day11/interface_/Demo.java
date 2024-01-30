package com.day11.interface_;

public class Demo implements Bike{
    @Override
    public int num() {
        return 200;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.num());
    }
}
