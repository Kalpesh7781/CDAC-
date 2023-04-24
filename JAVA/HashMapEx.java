package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapEx {
public static void main(String[] args) {
	HashMap <Integer,Student>hm=new HashMap<>();
	Student s1=new Student(1,"ram",6,"reading");
	Student s2=new Student(2,"shamal",7,"writing");
	Student s3=new Student(3,"amit",5,"playing");
	Student s4=new Student(4,"manoj",6,"reading");
	Student s5=new Student(5,"pooja",5,"writing");
	Student s6=new Student(6,"raj",6,"singing");
	hm.put(1, s1);
	hm.put(2, s2);
	hm.put(3, s3);
	hm.put(4, s4);
	hm.put(5, s5);
	System.out.println("display hashmap");
	for(Entry<Integer, Student> ele:hm.entrySet())
	{
		System.out.println(ele);
		Student ss=ele.getValue();
		System.out.println(ss.rollno+" "+ss.name);
	}
	System.out.println("sorting :");
	 ArrayList<Student> ck=new ArrayList <>();;
	 for(Entry<Integer, Student> ele:hm.entrySet())
		{
			//System.out.println(ele);
			Student ss=ele.getValue();
			ck.add(ss);
		}
	 Sortbystd sss=new Sortbystd();
	 Collections.sort(ck,sss);
	 for(Student ele:ck)
		{
			System.out.println(ele);
			 
		}
}
}
