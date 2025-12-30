package com.javaintro;

public class Student {
	int sid=123;
	String sname="Krishna";
	 Student s;
	 @Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Called !!");
	}
	 void hello(){
			
			System.out.println("*****");
		}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
//		s1=null;
//		s2=null;
		
		s1.s=s2;
		s2.s=s1;
		System.out.println(s1);
		s5=null;
		
//		s1=s4;
//		s1.hello();
		
		new Student();
		System.gc();
		System.out.println("Student Id : " +s1.sid);
		System.out.println("Student Name : " +s1.sname);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

	}

}
