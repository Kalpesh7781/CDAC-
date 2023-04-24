package day9;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class StudentRW {
	 static int pcount=0;
	  static int fcount=0;
	 
	
  String result(Student dd)
	{
		if(dd.marks<35)
			{
			pcount++;
			return "Pass";
			}
		
		else
			fcount++;
			return "fail";
		 
	}
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student s1=new Student(1,"ram",40,"Eng");
	Student s2=new Student(2,"radha",50,"Eng");
	Student s3=new Student(3,"shyam",32,"Eng");
	Student s4=new Student(4,"Raj",56,"Eng");
	Student s5=new Student(5,"radha",34,"Eng");
	
	FileOutputStream o=new FileOutputStream("file8.txt");
	ObjectOutputStream os=new ObjectOutputStream(o);
	os.writeObject(s1);
	os.writeObject(s2);
	os.writeObject(s3);
	os.writeObject(s4);
	os.writeObject(s5);
	os.close();
	FileInputStream i=new FileInputStream("file8.txt");
	ObjectInputStream oi=new ObjectInputStream(i);
	//System.out.println(oi.read());
	 //(Student) oi.readObject();
	/*System.out.println(oi.readObject());
	System.out.println(oi.readObject());
	System.out.println(oi.readObject());
	System.out.println(oi.readObject());
	System.out.println(oi.readObject());
	//System.out.println(oi.readObject());*/
//oi.read
	System.out.println("display hashmap");
	Student s;//(Student) oi.readObject();
	try{while((s=(Student) oi.readObject())!=null) {
	  
	   System.out.println(s);
	}}catch(Exception e)
	{e.getMessage();}
	
	System.out.println("getting result");
	
	 FileInputStream i2=new FileInputStream("file8.txt");
		ObjectInputStream oi2=new ObjectInputStream(i2);
	Student p;//(Student) oi.readObject();
	try{ while((p=(Student) oi2.readObject())!=null) {
	  
	   System.out.print(p);
	   StudentRW d=new StudentRW();
	   String e=d.result(p);
	   System.out.println(" result: "+e);
	  //
	}}catch(Exception e)
	{e.getMessage();}
	// oi2.close();
	 oi.close();
	 
	 System.out.println("pass student:"+pcount);
	 System.out.println("fail student : "+fcount);
	 
	 System.out.println("after sorting");
	 FileInputStream i3=new FileInputStream("file8.txt");
	 ObjectInputStream oi3=new ObjectInputStream(i3);
	 ArrayList<Student> al=new ArrayList<>();
	 Student k;
	try { while((k=(Student) oi3.readObject())!=null) {
		  
		    al.add(k);
		  //
		}}catch(Exception e)
		{e.getMessage();}
	System.out.println(al.size());
	Sortbymarks sbm=new Sortbymarks();
	Collections.sort(al, sbm);
	for(Student ele:al)
	{
		System.out.println(ele);
	}
	
	
}
}
