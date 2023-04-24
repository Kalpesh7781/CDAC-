package practice;

import java.io.Serializable;

public class Book implements Serializable {
	int id;
	String name;
	double price;
	String author;
	
	int isbno;
	String publication;
	public Book(int id, String name, double price, String author, int isbno, String publication) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.isbno = isbno;
		this.publication = publication;
	}
	
	 
	
}
