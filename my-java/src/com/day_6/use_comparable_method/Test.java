package com.day_6.use_comparable_method;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("vignes",24,"civil");
        Student student2 = new Student("vignes",24,"civil");

        System.out.println(student1.compareTo(student2));


    }

}
