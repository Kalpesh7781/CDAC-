package day8;

public class Book {
	double price;
	String name,author,publisher;
	int isbno;
	public Book(String name, String author,int isbno, double price,String publisher ) {
		//super();
		this.price = price;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.isbno = isbno;
	}
	
}
