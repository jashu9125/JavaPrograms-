package com.LanguageFundementals.Constructors;

public class Student {

	int sid;
	String sname;
	int marks;
	int age;

	// 1-arg constructor
	Student(int sid) {
		System.out.println("1-arg constructor");
		this.sid = sid;
	}

	// 3-arg constructor
	Student(int sid, String sname, int marks) {
		this(sid); // calls 1-arg
		System.out.println("3-arg constructor");
		this.sname = sname;
		this.marks = marks;
	}

	// 2-arg constructor
	Student(int sid, String sname) {
		this(sid, sname, 0); // calls 3-arg
		System.out.println("2-arg constructor");
	}

	// 4-arg constructor
	Student(int sid, String sname, int marks, int age) {
		this(sid, sname); // calls 2-arg
		System.out.println("4-arg constructor");
		this.age = age;
	}

	// Static method
	static void createStudent() {
		System.out.println("\nStatic method started");

		Student s = new Student(301, "Jashu", 85, 21);
		s.display();
	}

	// Instance method
	void display() {
		System.out.println("ID: " + sid);
		System.out.println("Name: " + sname);
		System.out.println("Marks: " + marks);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {

		System.out.println("Main method started");

		// Calling static method
		Student.createStudent();
	}
}
