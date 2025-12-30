package com.javaLab;

public class Demo {
	static int num = 1;
	String name;
	static {
		System.out.println(num);
	}
	{
		Demo d1 = new Demo();
		System.out.println(name);
	}

//	static void hii() {
//		int num = 143;
//		System.out.println("Number is : " + num);
//	}
//
//	void display() {
//		String name = "RK";
//		System.out.println("Name : " + name);
//	}

	public static void main(String[] args) {
		Demo d = new Demo();
//		hii();
//		d.display();

	}

}