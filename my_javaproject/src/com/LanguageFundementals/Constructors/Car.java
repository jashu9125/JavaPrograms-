package com.LanguageFundementals.Constructors;

public class Car {
	int num;
	String name;
	double price;

	Car() {
		System.out.println("No-arg comstructor called...");
		num = 100;
		name = "unknown";
		price = 1000000.00;
	}

	Car(int num, String name, double price) {
		System.out.println("Parameterised constructor called....");
		this.num = num;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		// Default Constructor Loading when no constructor is present
		Car c = new Car();
		c.display();
		Car c1 = new Car(101, "KIA", 1000000.00);
		c1.display();
		System.out.println("Main method ended !!");
	}

	void display() {
		System.out.println("Number of the car : " + num);
		System.out.println("Name of the car : " + name);
		System.out.println("Price of the car : " + price);
	}
}