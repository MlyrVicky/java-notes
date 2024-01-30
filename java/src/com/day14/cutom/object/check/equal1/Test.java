package com.day14.cutom.object.check.equal1;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("vicky",24);
        Employee employee1 = new Employee("vicky",24);

        System.out.println(employee.equals(employee1));


    }
}
/*
output:
false

note : the memory location is different  so the output is false.

*/

