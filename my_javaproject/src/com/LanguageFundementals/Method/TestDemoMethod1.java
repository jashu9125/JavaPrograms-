package com.LanguageFundementals.Method;

//no return type + no argument 
public class TestDemoMethod1 {
	void add() {
		System.out.println("Adding Method !!");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		TestDemoMethod1 td = new TestDemoMethod1();
		td.welcome();
		td.add();
		System.out.println("Main Method Ended !!");
	}

	public static void welcome() {
		System.out.println("Welcome to java !!");
	}

}