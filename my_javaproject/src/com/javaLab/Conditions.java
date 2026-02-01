package com.javaLab;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks of Student : ");
		int m = sc.nextInt();
		
		System.out.println("Enter Attendence Percentage : ");
		double a = sc.nextDouble();
		
		if(m>50 && m<100 && a>80 && a<100) {
			System.out.println("The Student is eligible for scholarship of $10000");
		}else {
			System.out.println("The Student is not eligible for scholarship");
		}
		
		System.out.println("Main Method Ended !!");
	}

}
