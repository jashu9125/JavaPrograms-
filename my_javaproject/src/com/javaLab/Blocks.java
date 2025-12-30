package com.javaLab;

public class Blocks {
	static {
		System.out.println("Static Block1 Started !!");
	}

	{
		System.out.println("Instance Block Started !!");
	}
	static {
		System.out.println("Static Block2 Started !!");
	}

	public static void main(String[] args) {
		Blocks b = new Blocks();
		
	}

}
