package com.javaintro;

public class Main {
	int id=11;
	String name="Yuvi";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method !");
	}
	void hello(){
		Main m4 = new Main();
		System.out.println("*****" +m4);
	}
	public static void main(String[] args) {
		System.out.println("Main method started !");
		Main m = new Main();
		Main m1 = new Main();
		Main m2 = new Main();
		Main m3 = new Main();
		m3=m1;
		m3.hello();
		System.out.println(m3);
//		m1=null;
		System.out.println(m1);//Address of the object
		
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println("Main method ended !");
		m2=null;
		System.out.println(m2);
		System.out.println(m3);
		System.gc();
	}

}
