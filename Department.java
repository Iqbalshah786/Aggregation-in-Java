package com.company;

import java.util.ArrayList;

public class Department {
    private  String name;
    private ArrayList<Student> Students;

    public Department(String name, ArrayList<Student> students) {
        this.name = name;
        this.Students = students;
    }

    public ArrayList<Student> getStudents(){
        return this.Students;
    }
}
