package com.day4.using_the_object_library_to_override;



public class Animals {

    String animalName;

    Animals(String animalName){

        this.animalName = animalName;
    }

    // one value to change another value --> this called type casting
    public boolean equals(Object obj) {
   Animals a = (Animals) obj;
        return a.animalName.equals(this.animalName);
    }


    public  int hashCode(){

        return this.animalName.length();
    }
}
