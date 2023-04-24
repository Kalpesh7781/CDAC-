package day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExa {
	public static void main(String[] args) throws IOException {
		
	
FileReader fr=new FileReader("D:\\hi.txt"); 
BufferedReader br=new BufferedReader(fr);
/*for(int i=0;i<15;i++)
{
	String str= br.readLine();
	System.out.println(str);
}*/
 
 /*int count=0;
String str;
while((str=br.readLine())!=null)
{
	count++;
	//System.out.println(str);
}
System.out.println("total count of line at:"+count);
*/
//System.out.println(str2);
//System.out.println(str3);

//br.close();

int ch;
int ccount=0;
ch=fr.read();
int lcount=0;
while((ch=fr.read())!=-1)
{
	//if((ch=fr.read())==32)
		lcount++;
System.out.print((char)ch);	
  
//ccount++;
 
}
 
System.out.println();
System.out.println("line count "+lcount);
//System.out.println("total count of char at:"+ccount);
fr.close();
 

}
}
