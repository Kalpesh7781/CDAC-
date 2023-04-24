package day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 

public class FileReaderMain {
public static void main(String[] args) throws IOException {
	//FileReader fr=new FileReader("D:\\lectures and material\\hi.txt");
	//BufferedReader br=new BufferedReader(fr);
	Scanner ip=new Scanner(System.in);
	
	boolean flag=true;
	while(flag)
	{
		FileReader fr=new FileReader("D:\\lectures and material\\hi.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println("enter ur choice");
		System.out.println("1: display file content");
		System.out.println("2: charecter count");
		System.out.println("3: word count");
		System.out.println("4: lines count");
		System.out.println("5: search word");
		System.out.println("6:copy data");
		System.out.println("7: exit");
		int ch=ip.nextInt();
		switch(ch)
		{
		case 1:
			FileReaderImp.dispCont(fr);
			break;
		case 2:
			FileReaderImp.chCount(fr);
			break;
		case 3:
			FileReaderImp.wdCount(fr);
			break;
		case 4:
			FileReaderImp.lnCount(fr, br);
			break;
		case 5:
			FileReaderImp.searchwd(fr, br);
			break;
		case 6:
			FileReaderImp.copyData(fr, br);
			break;
		case 7:
			flag=false;
		}
		
	}
}
}
