package com.day_4.parameter_constructor_using_super;

public class Mobiles extends Cars{
    String mobileName;

    Mobiles(){
        System.out.println("this is default constructor");
    }
    Mobiles(String mobileName , String carName , String bikeName){
        super(carName,bikeName);
        this.mobileName =mobileName;


    }
}
