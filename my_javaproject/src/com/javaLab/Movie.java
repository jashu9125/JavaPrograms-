package com.javaLab;
//Forward Constructor
public class Movie {
	String movieName;
	String hero;
	String heroine;
	double budget;
	
	Movie(){
		System.out.println("No-arg constructor called...");
		
	}
	Movie(String movieName){
		this();
		System.out.println("One-arg constructor called...");
		this.movieName=movieName;
	}
	Movie(String movieName,String hero){
		this(movieName);
		System.out.println("Two-arg constructor called...");
		this.hero=hero;
	}
	Movie(String movieName,String hero,String heroine){
		this(movieName,hero);
		System.out.println("Three-arg constructor called...");
		this.heroine=heroine;
	}
	Movie(String movieName,String hero,String heroine,double budget){
		this(movieName,hero,heroine);
		System.out.println("Four-arg constructor called...");
		this.budget=budget;
				
	}
	public static void main(String[] args) {
		Movie m = new Movie("Darling","Prabhas","Kajol",10000000.0);
		m.display();
	}
	void display() {
		System.out.println("Movie Name is : "+movieName);
		System.out.println("Hero Name is : "+hero);
		System.out.println("Heroine Name is : "+heroine);
		System.out.println("Movie Budget is : "+budget);
	}
}
