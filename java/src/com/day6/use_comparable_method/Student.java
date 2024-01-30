package com.day6.use_comparable_method;

public class Student implements Comparable<Student> {

    private String name;

    private Integer age;
    private String department;


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    @Override
    public int compareTo(Student student2) {
        //  Student student2 = (Student) o;
        int nameCom = this.name.compareTo(student2.name);
        int ageCom = this.age.compareTo(student2.age);
        int departmentCom = this.department.compareTo(student2.department);
        return nameCom + ageCom + departmentCom;
    }
}
