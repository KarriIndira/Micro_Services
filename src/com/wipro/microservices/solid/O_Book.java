package com.wipro.microservices.solid;

interface DiscountStrategy {
	 double calculateDiscount(double price);
	}


	class FictionDiscount implements DiscountStrategy {
	 @Override
	 public double calculateDiscount(double price) {
	     return price * 0.10;  
	 }
	}


	class NonFictionDiscount implements DiscountStrategy {
	 @Override
	 public double calculateDiscount(double price) {
	     return price * 0.05;  
	 }
	}


	class Book {
	 private String title;
	 private double price;
	 private DiscountStrategy discountStrategy;

	 
	 public Book(String title, double price, DiscountStrategy discountStrategy) {
	     this.title = title;
	     this.price = price;
	     this.discountStrategy = discountStrategy;
	 }

	 
	 public double getDiscount() {
	     return discountStrategy.calculateDiscount(price);
	 }

	 public String getTitle() {
	     return title;
	 }

	 public double getPrice() {
	     return price;
	 }
	}


	public class O_Book {
	 public static void main(String[] args) {
	    
	     Book fictionBook = new Book("Harry Potter", 30.0, new FictionDiscount());
	     Book nonFictionBook = new Book("Sapiens", 40.0, new NonFictionDiscount());

	     
	     System.out.println("Discount on " + fictionBook.getTitle() + ": $" + fictionBook.getDiscount());
	     System.out.println("Discount on " + nonFictionBook.getTitle() + ": $" + nonFictionBook.getDiscount());
	 }
	}

