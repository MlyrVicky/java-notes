package com.day6.use_comparator_method;

import java.util.Comparator;

public class Compar implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        return o2.getName().compareTo(o1.getName());
    }

    class ageComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {

            return o2.getAge().compareTo(o1.getAge());
        }
    }

    class DepartmentComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {

            return o2.getDepartment().compareTo(o1.getDepartment());
        }
    }
}

