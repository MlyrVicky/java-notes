package com.day14.cutom.object.override.the.hashcode;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("vicky", 24);

        Employee employee1 = new Employee("vicky", 24);

        System.out.println( employee);
        System.out.println(employee1);
    }
}

