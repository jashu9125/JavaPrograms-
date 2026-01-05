package com.LanguageFundementals.Constructors;

public class Product {

    int pid;
    String pname;
    int price;
    int quantity;

    // 1-arg constructor
    Product(int pid) {
        System.out.println("1-arg constructor");
        this.pid = pid;
    }

    // 4-arg constructor
    Product(int pid, String pname, int price, int quantity) {
        this(pid);   // calls 1-arg
        System.out.println("4-arg constructor");
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

    // 2-arg constructor
    Product(int pid, String pname) {
        this(pid, pname, 0, 0); // calls 4-arg
        System.out.println("2-arg constructor");
    }

    // 3-arg constructor
    Product(int pid, String pname, int price) {
        this(pid, pname); // calls 2-arg
        System.out.println("3-arg constructor");
    }

    // Static method
    static void createProduct() {
        System.out.println("\nStatic method started");

        Product p = new Product(501, "Laptop", 60000);
        p.display();
    }

    // Instance method
    void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        // Call static method
        Product.createProduct();
    }
}
