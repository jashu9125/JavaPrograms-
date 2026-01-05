package com.LanguageFundementals.Constructors;

public class Employee {
	
	int eid;
	String ename;
	int salary;
	int age;
	
	Employee(){
		System.out.println("no arg constructor");
	}
	Employee(int eid){
		this();
		System.out.println("one arg constructor");
		this.eid=eid;
	}
	Employee(int eid, String ename){
		this(eid);
		System.out.println("Two arg constructor");
		this.ename=ename;
	}
	Employee(int eid,String ename, int salary){
		this(eid,ename);
		System.out.println("Three arg constructor");
		this.salary=salary;
	}
	
	Employee(int eid,String ename, int salary,int age){
		this(eid,ename,salary);
		System.out.println("four arg constructor");
		this.age=age;
	}

	public static void main(String[] args) {
		System.out.println("Main method started!!");

		Employee e = new Employee();
		e.display();
		
		Employee e1 = new Employee(101);
		e1.display();
		
		Employee e2 = new Employee(102,"jashu");
		e2.display();
		
		Employee e3 = new Employee(103,"Sri",100000);
		e3.display();
		
		Employee e4 = new Employee(103,"Sri",100000,22);
		e4.display();
		
		
	}
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(salary);
		System.out.println(age);
	}
	

}