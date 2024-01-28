package com.day_4.using_the_object_library_to_override;

public class Test {
    public static void main(String[] args) {
        Animals animals = new Animals("Elephant");

        Animals animals1 = new Animals("Elephant");

       System.out.println(animals.equals(animals1));

     /*  System.out.println(animals.hashCode());
        System.out.println(animals1.hashCode());
*/
    }
}
