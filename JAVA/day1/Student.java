package day1;
import java.util.*;
public class Student {
	int id;
	String name;
	int [] marks=new int [5];
	String result;
	
	public void readdata()
	{
		System.out.println("enter id, name");
		Scanner ip=new Scanner(System.in);
		id=ip.nextInt();
		name=ip.next();
		for(int i=0;i<5;i++)
		{
			System.out.println("enter marks of subject "+(i+1));
			marks[i]=ip.nextInt();
		}
		
	}
	public void showdata()
	{
		System.out.println("report for student ");
		System.out.println("id of student : "+id);
		System.out.println("name of student : "+name);
	    System.out.println("enter marks of subject : ");
			 
		for(int i=0;i<5;i++)
		{
			System.out.print(marks[i]+" ");
			 
		}
		System.out.println();
		if (res()=="pass")
		{
		System.out.println("marks obtain by student :"+sum());
		double percent=sum()/5;
		System.out.println("percentage obtain by student :"+percent);
		}
		System.out.println("result of  student : "+ res());
	}
	public String res()
	{
		result ="pass";
		for(int i=0;i<5;i++)
		{
			if(marks[i]<35)
				result="fail";
			
		}
		  
		return result;
	}
	public int sum()
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+marks[i];
			
		}
		 
		return sum;
	}
	
	
	

	public static void main(String[] args) {
     Student s1=new Student();
     s1.readdata();
     s1.showdata();
     
     Student s2=new Student();
     s2.readdata();
     s2.showdata();

	}

}
