package day9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("D:\\lectures and material\\demo.txt");
String str;
Scanner ip=new Scanner(System.in);


while(!(str=ip.nextLine()).equals("bye"))
{
fw.write(str+"\n");	
}
//fw.write(str);
System.out.println("file created");
fw.close();
	}

}
