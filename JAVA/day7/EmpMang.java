package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpMang {
	
	ArrayList<Emp> al=new ArrayList<>();
	Scanner ip=new Scanner(System.in);
	 
public  void createEmp()
	{
	 
		Emp e1=new Emp(15,"ram",85);
		Emp e2=new Emp(16,"raj",45);
		Emp e3=new Emp(17,"ravi",55);
		Emp e4=new Emp(18,"rakesh",65);
		  
		//ArrayList<Emp> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		//display(al);
		
		System.out.println("created");
	}

public  void display( )

{
	//            ArrayList<Emp> al=new ArrayList<>();
	for(Emp ele:al )
	{
		System.out.println(ele);	
	}
 
	
}
public void insert( )
{
	System.out.println("enter empno, name, age");
	int empno=ip.nextInt();
	String name=ip.next();
	int age=ip.nextInt();
	Emp e5=new Emp(empno,name,age);
	al.add(e5);
}

public void update( )
{
	System.out.println("enter empno to update");
	
	int empno=ip.nextInt();
	System.out.println("what you want to update  N:name  A:age");
    String choice=ip.next();
    
    if (choice.equals("A"))
    {
    	System.out.println("enter age to update");
    	int ageu=ip.nextInt();
    	for(Emp ele:al )
    	{
    		if(ele.empno==empno)
    			ele.age=ageu;
    		
    	}
    }
    else if (choice.equals("N"))
    {
    	System.out.println("enter name to update");
    	String nameu=ip.next();
    	for(Emp ele:al )
    	{
    		if(ele.empno==empno)
    			ele.name=nameu;
    		
    	}
    }
	
	 
	
}

public void remove() {
	System.out.println("enter emp no to remove");
	int i=ip.nextInt();
	for(Emp ele:al )
	{
		if(ele.empno==i)
			al.remove(ele);
		
	}
}

public void sort() {
	// TODO Auto-generated method stub
	//Collections.sort(al.empno);
	//al.sort();
}

}

