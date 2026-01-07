package com.LanguageFundementals.Constructors;

class customer {

	String name;
	int id;

	customer() {
		System.out.println("no arg constructor");
	}

	customer(String name, int id) {
		System.out.println("Parameterized constructor");
	}

}

class employee extends customer {

	employee(String name, int id) {
		super(name, id);
		System.out.println("Two arg constructor");
		this.name = name;
		this.id = id;
	}

}

public class Shop {
	public static void main(String[] args) {
		System.out.println("main method started");

		new employee("Jashu", 02);
	}

}
