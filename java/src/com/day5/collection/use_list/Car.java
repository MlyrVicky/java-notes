package com.day5.collection.use_list;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static void main(String[] args) {
        // list  is  interface
        // ArrayList is implement the list

        List <String> list = new ArrayList<>();
        list.add("Range Rover");
        list.add("BMW i 7");
        list.add("Adi Q7");
        list.add("Range Rover");

        list.remove(1);
        list.set(1,"Benz");

        System.out.println(list.get(2));

        //note : BMW is deleted Adi going to replace to BMW please  Then we set the Benz data hear.
    }
}
