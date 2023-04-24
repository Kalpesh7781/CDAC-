package day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderImp {
      static int ch;
      
      static void dispCont(FileReader fr) throws IOException
  	{
    	  System.out.println("content in file : ");
  		 while((ch=fr.read())!=-1)
  		{
  			System.out.print((char) ch);
  			 
  		}
  		System.out.println();
  	 
  	}
      
      
	static void chCount(FileReader fr) throws IOException
	{
		int chcount=0;
		
		while((ch=fr.read())!=-1)
		{
			//System.out.println((char) ch);
			if (ch==32 || ch==10 || ch==13)
			{continue;}
			chcount++;
			 
			
		}
		
		System.out.println("total char in file : "+chcount);
	}
	static void wdCount(FileReader fr) throws IOException
	{
		int wdcount=0;
		
		while(((ch=fr.read())!=(-1)))
		{
			//System.out.print((char)ch);
			//if((ch=fr.read())==32)
				System.out.print((char)ch);
			System.out.print(ch);
			if(ch==32 || ch==13 )
				{wdcount++;}
		}
		System.out.println();
		System.out.println("total word in file : "+(wdcount+1));
		
	}
	static void lnCount(FileReader fr,BufferedReader br) throws IOException
	{
		int lncount=0;
		String str;
		while((str=br.readLine())!=null)
		{
			 
			lncount++;
		}
		System.out.println("line count in file : "+lncount);
		
	}
	
	
	static void searchwd(FileReader fr,BufferedReader br) throws IOException
	{
		System.out.println("enter word to search");
		Scanner ip=new Scanner(System.in);
		String wd=ip.next();
		String [] words;
		int count=0;
		int cc=0;
		String str;
		boolean search=false;
		
		while((str=br.readLine())!=null)
		{
			 words=str.split(" ");
			 for(String ele:words)
			 {
				 if(ele.equals(wd))
				 {search=true;cc=count;}
				 count++;
			 }
		}
		
		System.out.println(wd+" found in file :"+search);
		System.out.println(wd+" found at : "+(cc+1)+" occurance");
	}
	
	
	static void copyData(FileReader fr,BufferedReader br) throws IOException
	{
		int ch;
		System.out.println("enter file name to create");
		Scanner ip=new Scanner(System.in);
		String fname=ip.next();
		FileWriter fw=new FileWriter("D:\\lectures and material\\"+fname+".txt");
		while((ch=br.read())!=-1)
		{
			 fw.write((char)ch);
		}
		System.out.println(fname+" file created and data add sucessfully");
		fw.close();	
	}
	
	
}
