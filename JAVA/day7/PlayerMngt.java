
package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayerMngt {
	Scanner ip=new Scanner(System.in);
	
	ArrayList<Player> al=new ArrayList <>();
	
	public void create()
	{
		System.out.println("enter a details of player");
		System.out.println("name  , total run  , no_of_wicket  ,  no_of_match  ,country ,no_of_century  , category");
		String name=ip.next();
		int total_run=ip.nextInt();
		int no_of_wick=ip.nextInt();
		int no_of_match=ip.nextInt();
		String count=ip.next();
		int no_of_cent=ip.nextInt();
		String category=null;
		Player p1=new Player(name, total_run, no_of_wick, no_of_match, count,no_of_cent);
		al.add(p1);
		
	}
	public void display()
	{
		for(Player ele:al )
		{
			System.out.println(ele);	
		}
		
	}
	public void max() {
		// TODO Auto-generated method 
        int max=0;
		for(Player ele:al )
		{
			if(ele.total_run>max)
			{max=ele.total_run;}
			
		}
		for(Player ele:al )
		{
			if(ele.total_run==max)
				System.out.println(ele);
			
		}
	}
	public void name()
	{ 
		System.out.println("on which criteria you want to sort ");
		System.out.println("1: name"+"\n"+"2:no of wick"+"3:no of matches");
		Scanner ip=new Scanner(System.in);
		int ch=ip.nextInt();
		if (ch==1) {
		sortByName s=new sortByName();
		Collections.sort(al, s);}
		else if(ch==2)
		{
			sortbywicket s2=new sortbywicket();
			Collections.sort(al, s2);
		}
		 
		
	}
	public void remove() {
		// TODO Auto-generated method stub
		for(Player ele:al )
		{
			if(ele.total_run<100)
			{al.remove(ele);}
			
		}
		 
	}

}
