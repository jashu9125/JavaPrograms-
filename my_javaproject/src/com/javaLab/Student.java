package com.javaLab;

public class Student {
	int id;
	String name;
	long mobileNo;

	void display(){
		System.out.println("****** Instance Method ******");
		System.out.println("Student Id Number : " +id);
		System.out.println("Student Name  : " +name);
		System.out.println("Student Mobile Number : " +mobileNo);
		
	}
	
	static void hii(){
		System.out.println("****** Static Method ******");
		Student s1 = new Student();
		s1.id = 2;
		s1.name = "Radha";
		s1.mobileNo = 6783513264L;
		s1.display();
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.id = 1;
		s.name = "Krishna";
		s.mobileNo = 6783513263L;
//		s.display();
		hii();
		
	}

}
