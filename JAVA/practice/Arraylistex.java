package practice;

import java.util.ArrayList;

public class Arraylistex {
public static void main(String[] args) {
	ArrayList <Student> al=new ArrayList <>();
	
	Student s1=new Student(1,"ram",6,"reading");
	Student s2=new Student(2,"radha",7,"writing");
	Student s3=new Student(3,"raman",5,"playing");
	Student s4=new Student(4,"ramesh",6,"reading");
	Student s5=new Student(5,"rana",5,"writing");
	Student s6=new Student(6,"raj",6,"singing");
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	
	System.out.println("display arraylist:");
	for(Student ele:al)
	{
		System.out.println(ele);
	}
	
	System.out.println();
	System.out.println("student 3: \n"+al.get(2));
	
	System.out.println("print roll and name only:");
	for(Student ele:al)
	{
		System.out.println( ele.rollno+"  "+ ele.name);
	}
	
	System.out.println(al.contains(s2)); 
	
	Student s=al.get(2);
	System.out.println(al.equals(s3));
	
	System.out.println(al.isEmpty());
	
	System.out.println("delete 2nd :");
	al.remove(s2);
	
	System.out.println("updating");
	/*System.out.println(*/al.set(3,s6);//);
	for(Student ele:al)
	{
		System.out.println(ele);
	}
	
System.out.println("al size:"+al.size());

System.out.println("after sort with std: ");
Sortbystd s8=new Sortbystd();

 al.sort(s8);
 
 for(Student ele:al)
	{
		System.out.println(ele);
	}

 System.out.println("delete all:");
 al.clear();
 
 System.out.println("size of al:"+al.size());
 
	
}
}
