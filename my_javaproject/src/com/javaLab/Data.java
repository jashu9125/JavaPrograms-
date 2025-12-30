package com.javaLab;

public class Data {
//	int age = 22;
//	long mobileNo = 6301238459L;
//
//	float height = 5.9f;
//	double salary = 1000000.0;
//
//	char gender = 'M';
//	boolean Vcubestudents = true;
	
	byte b;
	short s;
	
	int age;
	long mobileNo;

	float height;
	double salary;

	char gender;
	boolean Vcubestudents;

	void run() {
//		System.out.println("Your Byte Is : " + b);
//		System.out.println("Your Short Is : " + s);
//		System.out.println("Your Age Is : " + age);
//		System.out.println("Mobile Number : " + mobileNo);
//		System.out.println("Your Height Is : " + height);
//		System.out.println("Your Salary Is : " + salary);
//		System.out.println("Your Gender Is : " + gender);
//		System.out.println("Your Vcubestudents Is : " + Vcubestudents);
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.run();
		System.out.println("Your Byte Is : " +d.b);
		System.out.println("Your Short Is : " + d.s);
		System.out.println("Your Age Is : " + d.age);
		System.out.println("Mobile Number : " + d.mobileNo);
		System.out.println("Your Height Is : " + d.height);
		System.out.println("Your Salary Is : " + d.salary);
		System.out.println("Your Gender Is : " + d.gender);
		System.out.println("Your Vcubestudents Is : " + d.Vcubestudents);
	}

}
