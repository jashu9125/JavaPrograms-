package com.javaLab;

import java.util.Scanner;

public class Methods {
	int getAddition(int a, int b) {
		System.out.println("Addition Method !!");
		int c=a+b;
		
		
		return c;
	}
	
	int getSubtraction(int a, int b) {
		int c=b-a;
		System.out.println("Subtraction Method !!");
		
	
		return c;
	}
	int getMultiplication(int a, int b) {
		System.out.println("Multiplication Method !!");
		int c=a*b;
		
		System.out.println();
		return c;
	}
	public static void main(String[] args) {
		Methods m = new Methods();
		System.out.println("Main Method Started !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Value : ");
		int a = sc.nextInt();
		System.out.println("Enter B Value : ");
		int b = sc.nextInt();
		
		
		
		int d = m.getAddition(a,b);
		System.out.println("Addition of two numbers is : " +d);
		int e = m.getSubtraction(a, d);
		System.out.println("Subtractin of two numbers is : " +e);
		int f =m.getMultiplication(a, e);
		System.out.println("Multiplication of two numbers is : " +f);
		System.out.println("Main Method Ended !!");
		
		sc.close();
	}

}
