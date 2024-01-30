package com.day6.use_comparator_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("adam",24,"civil");
        Student student2 = new Student("bala",24,"civil");
        Student student3 = new Student("zack",24,"mech");

     //   System.out.println(student1.compareTo(student2));

        List<Student>students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


        System.out.println(students);
        Collections.sort(students,new Compar() );
        System.out.println(students);



    }

}
