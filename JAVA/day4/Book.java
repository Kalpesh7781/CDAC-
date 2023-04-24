package day4;
 
public class Book {
private String name;
  
private double price;
private int qty;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
private Author auth=new Author("darwin","xyz@gmail.com",'m');
 


public void getAuth() {
	System.out.println(auth.toString());  
}
 
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}

public void display()
{
	System.out.println(toString());
}
 

}





