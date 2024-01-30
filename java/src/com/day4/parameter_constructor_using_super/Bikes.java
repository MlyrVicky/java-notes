package com.day4.parameter_constructor_using_super;

public class Bikes {

  public  String bikeName;

    public Bikes(){
        System.out.println("this called default constructor ");
    }


    public Bikes(String bikeName){
        this.bikeName= bikeName;
    }

}
