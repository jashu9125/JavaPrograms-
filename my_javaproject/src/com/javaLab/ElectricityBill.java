package com.javaLab;

public class ElectricityBill {
	 int units = 150;
	 double rpu = 6;
	 static double gst = 0.05;
	 double b;
	 double c;
	 
	void cal() {
		 b = rpu*units;
		 System.out.println("Bill per units : " +b);	 
	}
	
	static void calu(ElectricityBill e) {
		e.cal();
		gst = e.b*gst;
		System.out.println("Gst Amount : " +gst);
	}
	void add() {
		c = b+gst;
		System.out.println("Total Bill : " +c);
	}
	public static void main(String[] args) {
		System.out.println("Main Method started !!");
		ElectricityBill eb = new ElectricityBill();
		calu(eb);
		eb.add();
		
	}

}
