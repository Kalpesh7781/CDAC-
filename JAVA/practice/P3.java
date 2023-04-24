package practice;

import java.security.DomainCombiner;
import java.util.Random;
import java.util.Scanner;

public class P3 implements Array1D{
 
int []arr=new int[15];
int a=-5;
int b=10;

public static void main(String[] args) {
	P3 p=new P3();
	p.populate(p.arr, p.a, p.b);
	p.display(p.arr);
	System.out.println("enter element:");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	System.out.println("total elements:"+p.celement(p.arr,k));
	
}
	@Override
	public void populate(int[] a, int b, int c) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int i=0;i<a.length;i++)
		{
		arr[i]=r.nextInt(b, c+1);}
	}

	@Override
	public void display(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println();}
		
		int celement(int[]a,int no)
		{
			int count=0;
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==no)
				{
			 count++;}}
			return count;
			
		}
 
	}

 