package com.javaLab;

public class Students {
	int id;
	String name;
	String branch;
	int marks;
	
	Students(int id, String name, String branch, int marks ){
		System.out.println("Parameterised constructor called.....");
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method started !");
		
//		Students s = new Students();
		
		Students s = new Students(02,"Jashu","cse",100);
		s.dis();
		System.out.println("---------------------");
		
		Students s1 =new Students(03,"Mohan","ece",80);
		s1.dis();
		System.out.println("---------------------");
		
		Students s2 =new Students(04,"Siva","cse",95);
		s2.dis();
		System.out.println("---------------------");
		
		Students s3 =new Students(05,"Vinod","Mca",90);
		s3.dis();
		
		System.out.println("Main method ended !");
	}
	void dis() {
		System.out.println("Student Id : "+id);
		System.out.println("student Name : "+name);
		System.out.println("Student Branch : "+branch);
		System.out.println("student Marks : "+marks);
	}

}
