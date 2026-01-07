package com.javaLab;

class Book {
	String bookName;
	int price;

	public Book(String bookName, int price) {
		System.out.println("Details of Book : ");
		this.bookName = bookName;
		this.price = price;
	}

}

class Author extends Book {
	String authorName;
	String authorState;

	Author(String authorName, String authorState, String bookName, int price) {
		super(bookName, price);
		this.authorName = authorName;
		this.authorState = authorState;
	}

	void display() {
		System.out.println("---------------------------");
		System.out.println("Author Name : " + authorName);
		System.out.println("Author State : " + authorState);
		System.out.println("Book Name : " + bookName);
		System.out.println("Price : " + price);

	}
}

public class Details {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("-------------------------");
		Author a = new Author("Jashu", "Vijayawada", "Horror Story", 500);
		a.display();
	}

}
