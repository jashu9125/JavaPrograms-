package com.javaLab;

public class Student1 {
		
	int rollno;
	String name;
	float marks;
	boolean isPassed;
	public static void main(String[] args) {
		Student1 s = new Student1();
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s.rollno = 12;
		s.name = "Radha";
		s.marks = 80f;
		s.isPassed = true;
		
		System.out.println("Roll No is : " +s.rollno);
		System.out.println("Name is : " +s.name);
		System.out.println("Marks Gained is : " +s.marks);
		System.out.println("Condition is  " +s.isPassed);
//		if(s.isPassed == true)
//		{
//			System.out.println("True " +s.isPassed);
//		}
		System.out.println("--------------------------------");
		
		s1.rollno = 13;
		s1.name = "Krishna";
		s1.marks = 7.9f;
		s1.isPassed = false;
		
		System.out.println("Roll No is : " +s1.rollno);
		System.out.println("Name is : " +s1.name);
		System.out.println("Marks Gained is : " +s1.marks);
		System.out.println("Condition is  " +s1.isPassed);
		
//		if(s.isPassed == false)
//		{
//			System.out.println("Condition is  " +s.isPassed);
//		}
//		else {
//			System.out.println("False " +s.isPassed);
//		}
System.out.println("--------------------------------");
		
		s2.rollno = 14;
		s2.name = "BalRam";
		s2.marks = 7.8f;
		s2.isPassed = false;
		
		System.out.println("Roll No is : " +s2.rollno);
		System.out.println("Name is : " +s2.name);
		System.out.println("Marks Gained is : " +s2.marks);
		System.out.println("Condition is  " +s2.isPassed);
		

	}

}
