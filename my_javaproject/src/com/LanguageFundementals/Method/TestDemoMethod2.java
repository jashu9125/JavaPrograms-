package com.LanguageFundementals.Method;

import java.util.Scanner;

//No return type + with arguments
public class TestDemoMethod2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		TestDemoMethod2 t = new TestDemoMethod2();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your First name : ");
		String Firstname = sc.nextLine();

		System.out.println("Enter Your Last name : ");
		String Lastname = sc.next();

		System.out.println("Enter Your Age : ");
		int Age = sc.nextInt();
		
		System.out.println("Enter Your Height : ");
		float height = sc.nextFloat();
		
		System.out.println("Enter Your weight : ");
		double weight = sc.nextDouble();
		
//		System.out.println("Enter Youe Gender : ");
//		char male = sc.
		
		System.out.println("Student Information : ");
		boolean StudentInfo = sc.nextBoolean();
		
		t.getName(Firstname, Lastname);
		t.getAge(Age);
		t.getheight(height);
		t.getweight(weight);
		t.getStudentInfo(StudentInfo);
		System.out.println("Main Method Ended !!");

	}
	

	void getName(String Firstname, String Lastname) {
		System.out.println("------------Details Of Student------------ ");
		System.out.println("Your Name Is : " +Firstname + " " +  Lastname);
	}
	void getAge(int Age) {
		System.out.println("Your Age Is : " +Age);
	}
	void getheight(float height) {
		System.out.println("Your Height Is : " +height);
	}
	void getweight(double weight) {
		System.out.println("Your weight is : " +weight);
	}
//	void getgender(char male,char female) {
//		System.out.println("Your Gender is : " +male +" "+female );
//		
//	}
	void getStudentInfo(boolean StudentInfo) {
		System.out.println("Student Information : " +StudentInfo);
	}
}
