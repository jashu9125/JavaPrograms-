package com.LanguageFundementals.Constructors;
//super or base or parent
class Vehicle {
	String name = "Tata"; 
	int model;
	String brand;
	double price;
	
	public static void main(String[] args) {
		System.out.println("Main Method Started From Vehicle !!");
	}
	
}

//Sub or divided or child
public class Bike extends Vehicle{
	String name = "V-cube"; 

	public static void main(String[] args) {
		System.out.println("Main Method Started From Bike !!");
		
		Bike b = new Bike();
		
		b.display();
		
		System.out.println("Main Method Ended !!");
	}
	void display() {
		System.out.println(name);
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(this.name);
		System.out.println(super.name);
	}

}
