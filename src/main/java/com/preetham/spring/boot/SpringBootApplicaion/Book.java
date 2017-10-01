package com.preetham.spring.boot.SpringBootApplicaion;

public class Book {

	int id;
	String author;
	String name;
	
	
	
	public int getId() {
		return id;
	}



	public String getAuthor() {
		return author;
	}



	public String getName() {
		return name;
	}



	public Book(int id, String author, String name) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
	}
	
	
}
