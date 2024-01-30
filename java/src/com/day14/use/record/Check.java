package com.day14.use.record;

public class Check {
    public static void main(String[] args) {


        EmployeeRecord employeeRecord = new EmployeeRecord("vimal", 24);
        EmployeeRecord employeeRecord1 = new EmployeeRecord("vimal", 24);

       // System.out.println(employeeRecord.equals(employeeRecord1));

        System.out.println(employeeRecord1.hashCode());
        System.out.println(employeeRecord.hashCode());
    }
}
