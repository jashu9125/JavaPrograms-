package com.javaintro;

public class TestDemo1 {
	static {
		System.out.println("static block ");
	}
	{
		System.out.println("instance block ");

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started !");

		System.out.println("Main Method Ended !");

	}

}
