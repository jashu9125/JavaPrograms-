package com.javaLab;

class Vehicle {
	int registrationNumber;
	double price;

	Vehicle(int registrationNumber, double price) {
		System.out.println("Two arg constructor called");
		this.registrationNumber = registrationNumber;
		this.price = price;
	}

	Vehicle(Vehicle v) {
		this.registrationNumber = v.registrationNumber;
		this.price = v.price;
	}
}
public class Car extends Vehicle {
	String model;
	String ownerName;
	
	Car(String model,String ownerName,int registrationNumber,double price){
		super(registrationNumber,price);
		System.out.println("Four arg constructor called");
		this.model=model;
		this.ownerName=ownerName;
//		this.registrationNumber=registrationNumber;
//		this.price=price;
	}
		Car(Car v){
			super(v);
			this.model=v.model;
			this.ownerName=v.ownerName;
		}
		
	
	void display() {
		System.out.println("-------------------");
		System.out.println("Model : "+model);
		System.out.println("OwnerName : "+ownerName);
		System.out.println("Reg No : "+registrationNumber);
		System.out.println("Price : "+price);
	}

	public static void main(String[] args) {
		Car c = new Car("Swift","Krishna",123,1500000.00);
		c.display();
		
		Car c1 = new Car(c);
		c1.display();
	}
}
