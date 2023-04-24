package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P4 {
public static void main(String[] args) {
	Student2 s1=new Student2(1,"ram",6,"reading");
	Student2 s2=new Student2(2,"sakshi",7,"writing");
	Student2 s3=new Student2(3,"aman",5,"playing");
	Student2 s4=new Student2(4,"mangesh",6,"reading");
	Student2 s5=new Student2(5,"karan",5,"writing");
	Student2 s6=new Student2(6,"nitin",7,"singing");
	Set<Student2> ts=new TreeSet<>();
	 
	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	ts.add(s4);
	ts.add(s5);
	ts.add(s6);
	 
	
	System.out.println(ts.size());
	//TreeSet<Student> ts1=(TreeSet<Student>) ts.clone();
    ArrayList<Student2> al= new ArrayList<>();
  //Set<Student2> ts1= (Set<Student2>) al;
    for(Student2 ele:ts)
    {
    	al.add(ele);
    	System.out.println(ele);
    }
    System.out.println(al.size());
    Sortbyname2 s=new Sortbyname2();
    Collections.sort(al,s);
    
    for(Student2 ele:al)
    {
    	System.out.println(ele);
    }
    System.out.println("std sort ");
   Sortbystd2 st=new Sortbystd2();
   Collections.sort(al,st);
   Iterator it=al.iterator();
   
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
}
}
