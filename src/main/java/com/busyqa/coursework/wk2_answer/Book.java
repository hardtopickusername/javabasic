package com.busyqa.coursework.wk2_answer;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book(String title, String authorFirstName, String authorLastName, double price)
	{
		this.title = title;
		this.author = authorFirstName + " " + authorLastName;
		this.price = price;
	}
	
	public String toString()
	{
		return "TITLE: " + title + "\n" + "AUTHOR: " + author + "\n" + "PRICE: " + price;
	}
}

