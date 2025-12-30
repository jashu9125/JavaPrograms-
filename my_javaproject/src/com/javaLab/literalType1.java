package com.javaLab;

public class literalType1 {

	public static void main(String[] args) {
//		Integer Literal
//		Decimal Literals
		int a = 100;
		int a1 = 456786;
//		int a2 = 012345679; // out of range The literal 012345679 of type int is out of range 
		System.out.println(a);
		System.out.println(a1);
//		System.out.println(a2);
		
		
		int a3 = 0x123;
		int a4 = 0xab11;
		int a5 = 0xabab124;
		System.out.println("Heaxa Decimal");
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		int a6 = 012367;
//		int a7 = 012345678;
		System.out.println("Octa Decimal");
		System.out.println(a6);
//		System.out.println(a6);
		
		int a8 = 0b1010;
		int a9 = 0b1100;
		System.out.println("Binary");
		System.out.println(a8);
		System.out.println(a9);
		
		System.out.println("-------------------------------------------");
//		Floating point data
//		float f = 2314.12; //Type mismatch: cannot convert from double to float
//		System.out.println(f);
		float f1 = 100;
		float f2 = 0123.21f;
//		float f3 = 123456.789D;//Type mismatch: cannot convert from double to float
		float f4 = 123.43f;
		float f5 = 63545.12f;
		System.out.println("Floating point data : ");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f4);
		System.out.println(f5);
		
		System.out.println("-------------------------------------------");
//		Double Literals
		double d = 123.456d;
		double d1 = 0123.456;
		double d2 = 0x12eab;
//		double d3 = 0x123.456;//Invalid hex literal number
		double d4 = 0b1010;
		double d5 = 0b1110;
		double d6 = 1.2e3;
		System.out.println("Double point data : ");
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		
		System.out.println("-------------------------------------------");
		char c = 'a';
		char c1 = 12342;
//		char c2 = 12.23;//Type mismatch: cannot convert from double to char
//		char c3 = 12.33f;//Type mismatch: cannot convert from float to char
		char c4 = 0x122;
		char c5 = 0b1011;
//		char c6 = 12ea1;//Invalid float literal number
//		char c7 = 01a2e;//Syntax error on token "a2e", delete this token
		System.out.println("Character point data : ");
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c4);
		System.out.println(c5);
	}

}
