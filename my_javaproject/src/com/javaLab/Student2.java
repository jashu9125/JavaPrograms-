package com.javaLab;

public class Student2 {
	int rollNo;
	String name;
	String branch;
	
	Student2(int rollNo, String name){
		
		System.out.println("Two args constructor called..");
		this.rollNo=rollNo;
		this.name=name;
	}
	
	Student2(Student2 s,String branch){
		System.out.println("Three args constructor called..");
		this.rollNo=s.rollNo;
		this.name=s.name;
		this.branch=branch;
		
		
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("---------------------------");
		Student2 s = new Student2(02,"Jashu");
		s.display();
		Student2 s1 = new Student2(s,"CSE");
		s1.display();
	}
	void display() {
		
		System.out.println("Student rollNo : " +rollNo);
		System.out.println("Student Name : " +name);
		System.out.println("Student Branch : " +branch);
		System.out.println("---------------------------");
	}
}
