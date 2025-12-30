package com.javaintro;

public class Welcome {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main Method Started !");
		
		//Class.forName("com.javaintro.Test1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Main Method Ended !");
		
	}

}
