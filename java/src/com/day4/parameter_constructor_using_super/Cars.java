package com.day4.parameter_constructor_using_super;

public class Cars extends Bikes {
    public  String CarName;

    public Cars(){
        System.out.println("this called default constructor ");
    }


    public Cars(String bikeName,String CarName){
        super(bikeName);
        this.CarName= CarName;
    }

}
