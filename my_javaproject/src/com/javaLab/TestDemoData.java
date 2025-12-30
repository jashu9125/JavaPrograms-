package com.javaLab;
import java.math.BigDecimal;
import java.math.BigInteger;
class Animal{
	
}

public class TestDemoData {
	String name = "Jashu";
	String name1 = new String("Vcube");
	
	
	Integer i = 100;
	Integer i1 = Integer.valueOf(100);//Converting primitive data type to wrapper object data type is called Auto Boxing
	Integer i2 = i1.intValue();//Converting wrapper object data type to primitive data type is called auto unBoxing
	
	Character c = 'M';
	Long l = 198545678938527L;
	
	Float f = 5.9f;
	Double d = 123456789.00;
	
	BigInteger bid = new BigInteger("1000987654");
	BigInteger bid1 = new BigInteger("109876552");
	BigDecimal bd = new BigDecimal("1234567899865432");
	BigDecimal bd1 = new BigDecimal("1234567899865432");
	
//	Animal a = new Animal();
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TestDemoData td = new TestDemoData();
//		System.out.println("String Value : ");
//		System.out.println(td.name);
//		System.out.println(td.name1);
//		System.out.println("------------------------------------");
//		
//		System.out.println("Integer Value : ");
//		System.out.println(td.i);
//		System.out.println(td.i1);
//		System.out.println(td.i2);
//		System.out.println("------------------------------------");
//		
//		System.out.println("Character Value : ");
//		System.out.println(td.c);
//		
//		System.out.println("------------------------------------");
//		System.out.println("Long Value : ");
//		System.out.println(td.l);
//		
//		System.out.println("------------------------------------");
//		System.out.println("Float Value : ");
//		System.out.println(td.f);
//		
//		System.out.println("------------------------------------");
//		System.out.println("Decimal Value : ");
//		System.out.println(td.d);
		
		System.out.println("--------------Big Integer----------------------");
		System.out.println("Big Integer Value : ");
		System.out.println(td.bid);
		System.out.println(td.bid1);
		System.out.println("Addition : " + td.bid.add(td.bid1));
		System.out.println("Subtract : " + td.bid.subtract(td.bid1));
		System.out.println("Multiplication : " + td.bid.multiply(td.bid1));
		System.out.println("Division : " + td.bid.divide(td.bid1));
		System.out.println("Modulus : " + td.bid.mod(td.bid1));
		
		System.out.println("------------Big Decimal------------------------");
		System.out.println("Big Decimal Value : ");
		System.out.println(td.bd);
		System.out.println("Addition : " + td.bd.add(td.bd1));
		System.out.println("Subtract : " + td.bd.subtract(td.bd1));
		System.out.println("Multiplication : " + td.bd.multiply(td.bd1));
		System.out.println("Division : " + td.bd.divide(td.bd1));
		System.out.println("Maximum : " + td.bd.max(td.bd1));
//		System.out.println("Modulus : " + td.bd.mod(td.bd1));
		
//		System.out.println(td.a);

	}

}
