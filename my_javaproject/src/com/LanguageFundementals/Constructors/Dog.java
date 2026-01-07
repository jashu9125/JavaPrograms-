package com.LanguageFundementals.Constructors;

class Animal{
	
	String name;
	String breed;
	int age;
	
	Animal(){
		System.out.println("No-arg constructor called from Animal...");
	}
	
//	public Animal(String name, String breed, int age) {
//		super();
//		System.out.println("Parameterised constructor called...");
//	}

	public static void main(String[] args) {
		System.out.println("Main Method started From Dog...");
	}
}

public class Dog extends Animal{
	Dog(String name,String breed,int age){
		System.out.println("No-arg constructor called from dog...");
		super.name = name;
		this.breed = breed;
		this.age = age;
	
	}
//	String name = "Smily";
	public static void main(String[] args) {
		System.out.println("Main Method started From Dog");
		Dog d = new Dog("Silky","GS",2);
		d.show();
		
	}
	void show() {
		System.out.println("Name : " +name);
		System.out.println("Breed : " +breed);
		System.err.println("Age : " +age);
	}

}
