package com.javaintro;

public class Cricketer {

	// Step-1 Declaration
	// static
	static int countryId;
	static String countryName;

	// non-static or instance
	int jersyNo;
	String CricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome To Indian Cricket Team !!");

		// Creating object of a class
		// LHS : Cricketer is a class name & vk is a Reference Variable for an Object.
		// RHS : new is a Keyword to create object with the help of Constructor,
		// Cricketer() is a Consturctor
		Cricketer vk = new Cricketer();

		// Step-2 : Initialization
		countryId = 91;
		countryName = "India";

		vk.jersyNo = 18;
		vk.CricketerName = "ViratKohli";

		// Step-3 Accessing static data directly
		System.out.println("Country Id : " + countryId);// 0
		System.out.println("Country Name : " + countryName);// null

		System.out.println("Jersy Number : " + vk.jersyNo);
		System.out.println("Cricketer Name : " + vk.CricketerName);
	}

}
