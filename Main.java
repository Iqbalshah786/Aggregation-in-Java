package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Student student1 = new Student("Iqbal",1,"BSCS");
        Student student2 = new Student("Ali",2,"BSCS");
        Student student3 = new Student("Ali Shah",2,"BSCE");
        Student student4 = new Student("Haris",3,"BSSE");

        ArrayList<Student> cs_student = new ArrayList<>();
        ArrayList<Student> se_student = new ArrayList<>();

        cs_student.add(student1);
        cs_student.add(student2);

        se_student.add(student3);
        se_student.add(student4);

        Department CS = new Department("CS",cs_student);
        Department SE = new Department("SE",se_student);


        ArrayList<Department> departments = new ArrayList<>();
        departments.add(CS);
        departments.add(SE);

        University university = new University("SZABIST",departments);
        System.out.println("Total Students count in University List : \n");
        System.out.println(university.getTotalStudentsInUniversity()+ "\n");

        System.out.println("Totoal students in CS Deaprtment list : ");
        System.out.println(CS.getStudents()+"\n");

        System.out.println("Total students in SE Department lit : \n");
        System.out.println(SE.getStudents()+"\n");


    }
}
