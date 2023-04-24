package javatut;

import java.util.Scanner;

public class ArrayExam {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	//declaring array
	int[]marks;
	String name[]=new String[5];
	int class1[],class2[],class3[]; //allowed to declare multiple array;
	
	//allocating memory for array
	marks=new int[5];
	class1=new int[2];
	class2=new int[2];
	class3=new int[2];
	
	//initializing array
	marks[0]=10;
	marks[1]=20;
	marks[2]=30;
	marks[3]=40;
	marks[4]=50;
	
	
	 
	
	for(int i=0;i<5;i++)
	{
		System.out.println("enter element");
		name[i]=ip.next();
	}
	
	
	//display array;
	for(int i=0;i<5;i++)
	{
		System.out.println(marks[i]);
		System.out.println(name[i]);
	}
	}
	
}

