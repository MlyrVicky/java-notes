package com.code_practices.use_apstract;

public class MainFunction extends Cars {
    @Override
    String address() {
        return "vignesh";
    }

    @Override
    String bikeName(String name1, String name2) {

        name1 = "Royal Enfield";
        name2 = "BMW";
        return bikeName();

    }


    @Override
    void myName() {
        System.out.println("My Name is vignesh T");
    }

    @Override
    String bikeName() {
        return "I love all super bikes ";
    }

    @Override
    void carsName(String name1, String name2) {

        System.out.println( "Name1 : "+name1+" Name2 : "+name2);
    }

    public static void main(String[] args) {

        MainFunction opj = new MainFunction();
       String  name1 ="BMW I7";
       String  name2 = "Range over ";
        opj.carsName(name1,name2);

        opj.carsName("vigesh","vicky");

    }


}
