package com.javaintro;

public class Hello {
//	native void show();
	
		
	public static void hello() {
		
		System.out.println("Hello Guys, WhattsApp !");
		System.out.println("Hello Guys, WhattsApp !");
		System.out.println("Hello Guys, WhattsApp !");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started !");
		System.out.println("Main Method Started !");
		System.out.println("Main Method Started !");
		
		
		System.out.println("*******" +Thread.currentThread().getName());
//		creating an object for Hello
		Hello h = new Hello();
//		call the static  hello method
		hello();
//		calling the instance welcome method by using object reference variable
//		Note  : We cannot call instance method in static area,
//		If we want call non-static methods to static area, we must need to create objects.
		h.welcome();
		
//		h.show();
		
		System.out.println("Main Method Ended !");
	}
	public void welcome() {
		
		System.out.println("Welcome To WhattsApp !");
		System.out.println("Welcome To WhattsApp !");
		System.out.println("Welcome To WhattsApp !");
	}
}
