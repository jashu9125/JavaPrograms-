package com.javaLab;

//Backward Constructor
public class Movies {
	String movieName;
	String hero;
	String heroine;
	double budget;

	Movies() {
		this("Billa");
		System.out.println("No-arg constructor called...");

	}

	Movies(String movieName) {
		this(movieName, "Prabhas");
		System.out.println("One-arg constructor called...");

	}

	Movies(String movieName, String hero) {
		this(movieName, hero, "Anushaka");
		System.out.println("two-arg constructor called...");

	}

	Movies(String movieName, String hero, String heroine) {
		this(movieName, hero, "Anushaka", 20000000.0);
		System.out.println("three-arg constructor called...");

	}

	Movies(String movieName, String hero, String heroine, double budget) {
		System.out.println("four-arg constructor called...");
		this.movieName = movieName;
		this.hero = hero;
		this.heroine = heroine;
		this.budget = budget;
	}

	public static void main(String[] args) {
		Movies m = new Movies();
		m.display();

	}

	void display() {
		System.out.println("Movie Name is : " + movieName);
		System.out.println("Hero Name is : " + hero);
		System.out.println("Heroine Name is : " + heroine);
		System.out.println("Movie Budget is : " + budget);
	}

}
