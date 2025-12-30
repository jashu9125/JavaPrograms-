package com.javaLab;

public class Sample {
	
	static int i;
	long l;
	
	void dis(){
		Sample s = new Sample();
		System.out.println("Instance Method");
		System.out.println(s.l);
		hi();
	}
	static void hi() {
		System.out.println("Static Method");
		System.out.println(i);
	}
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.dis();
		
	}

}
