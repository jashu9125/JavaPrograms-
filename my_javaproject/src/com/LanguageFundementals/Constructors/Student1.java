package com.LanguageFundementals.Constructors;

class Student1 {

    // Instance variables
    String name;
    int rollNo;
    String course;

    // 1. Constructor with only name
    Student1(String name) {
        this.name = name;
        System.out.println("Single-parameter constructor executed");
    }

    // 2. Constructor with name and roll number
    Student1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Two-parameter constructor executed");
    }

    // 3. Constructor with name, roll number, and course
    Student1(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        System.out.println("Three-parameter constructor executed");
    }

    // Display method
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Course : " + course);
        System.out.println("-----------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Object using single-parameter constructor
        Student1 s1 = new Student1("Jaswanth");
        s1.display();

        // Object using two-parameter constructor
        Student1 s2 = new Student1("Tanu", 101);
        s2.display();

        // Object using three-parameter constructor
        Student1 s3 = new Student1("Krishna", 102, "Java Full Stack");
        s3.display();
    }
}