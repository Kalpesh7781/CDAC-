package day8;

import java.util.HashMap;
import java.util.Scanner;

public class BookMain {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	HashMap<Integer,Book> hm=new HashMap<>();
	Book b1=new Book("harrypotter1","j.k.rowling",1254,550,"bloomsburrhy");
	Book b2=new Book("harrypotter1","j.k.rowling",1350,650,"bloomsburrhy");
	Book b3=new Book("harrypotter1","j.k.rowling",1416,750,"bloomsburrhy");
	Book b4=new Book("harrypotter1","j.k.rowling",1517,755,"bloomsburrhy");
	Book b5=new Book("harrypotter1","j.k.rowling",1854,858,"bloomsburrhy");
	
	hm.put(1, b1);
	hm.put(2, b2);
	hm.put(3, b3);
	hm.put(4, b4);
	hm.put(5, b5);
	
	BookImp b=new BookImp();
	boolean flag=true;
	while(flag)
	{
		System.out.println("enter ur choice");
		System.out.println("1: display hashmap");
		System.out.println("2: display book");
		System.out.println("3: get 10% discount");
		 
		int ch=ip.nextInt();
		switch(ch)
		{
		
		case 1:
			b.disp(hm);
			break;
		case 2:
			b.search(hm);
			break;
		case 3:
			b.reduce(hm);
			break;
		default:
			flag=false;
				
		}
		
		
	}
}
}
