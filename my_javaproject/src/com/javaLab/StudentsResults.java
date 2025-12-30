package com.javaLab;

import java.util.Scanner;

public class StudentsResults {
	double totalmarks;

	
	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		StudentsResults s = new StudentsResults();
		Scanner sc = new Scanner(System.in);

		System.out.println("English marks were : ");
		double en = sc.nextDouble();

		System.out.println("Telugu marks were : ");
		double t = sc.nextDouble();

		System.out.println("Maths marks were : ");
		double ma = sc.nextDouble();

		System.out.println("Science marks were : ");
		double sci = sc.nextDouble();

		System.out.println("Social marks were : ");
		double so = sc.nextDouble();
		
		s.avgmarks(en, t, ma, sci, so);
		
		
		System.out.println("Main Method Ended !!");
		
	}
	void totalmarks(double english, double telugu, double maths, double science, double social) {
		totalmarks = english + telugu + maths + science + social;
		System.out.println("Total Marks : " + totalmarks);

	}


	void avgmarks(double english, double telugu, double maths, double science, double social) {
		totalmarks(english,telugu,maths,science,social);
		double avg = totalmarks/5;
		System.out.println("Average : " +avg);
	}

}
