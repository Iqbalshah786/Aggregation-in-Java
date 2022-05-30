package com.company;

public class Student {
    private  String name;
    private int id;
    private String department;

    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return  "\nStudent Name : "+getName() + "\n" +"Student Id: "+getId()+ "\n" + "Student department : " +getDepartment();
    }
}
