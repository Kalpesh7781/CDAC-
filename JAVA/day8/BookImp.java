package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookImp {
//public static void main(String[] args) {
	//System.out.println("id"+" book name author  isbno  price publication" );
	Scanner ip=new Scanner(System.in);
	 
	 void disp(HashMap<Integer,Book> hm)
	{
	for(Map.Entry<Integer, Book> ele:hm.entrySet())
	{
		int key=ele.getKey();
		Book b=ele.getValue();
		System.out.print(key);
		System.out.println(" "+ b.name+" "+b.author+" "+b.isbno+" " +b.price+" "+b.publisher+" ");
	}}
	
	 void search(HashMap<Integer,Book> hm)
	{
	 
	System.out.println("enter book id to display details");
	int ch=ip.nextInt();
	
	Book b=hm.get(ch);
 
	System.out.println("Book name:"+ b.name+" Author:"+b.author+" isbno:"+b.isbno+" Price:" +b.price+" Publication:"+b.publisher+" ");
	}
	
	 void reduce(HashMap<Integer,Book> hm)
	{
	System.out.println("enter book id to to get 10% disc");
	int c=ip.nextInt();
	Book be=hm.get(c);
	//System.out.println("id"+" book name author  isbno  price publication" );

	/*for(Map.Entry<Integer, Book> ele:hm.entrySet())
	{
		if(ele.getKey()==c) {
		int key=ele.getKey();
		Book b8=ele.getValue();
		be.price=be.price-0.11*be.price;
		//System.out.println(key);*/
	    be.price=be.price-0.11*be.price;
		System.out.println("Book name:"+ be.name+" Author:"+be.author+" isbno:"+be.isbno+" Price:" +be.price+" Publication:"+be.publisher+" ");
		//}}
	
	
	
}


}
