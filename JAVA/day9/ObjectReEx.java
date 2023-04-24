package day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.*;

public class ObjectReEx {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Emp e=new Emp(15,"ram",20000);
	
	FileOutputStream os=new FileOutputStream("file1.txt");
	FileOutputStream os2=new FileOutputStream("file3.txt");
	FileWriter fw=new FileWriter("file2.txt");
	ObjectOutputStream oo=new ObjectOutputStream(os);
	DataOutputStream dos=new DataOutputStream(os2);
	String l="Kalpesh bro how are you";
String o=new String("what happen brother \nhappy or not");
	dos.writeBytes(o);
	oo.writeObject(e);
	//String l="Kalpesh bro how are you";
	 
	fw.write(l);
	fw.close();
	 
	
	FileInputStream is=new FileInputStream("file1.txt");
	ObjectInputStream oi=new ObjectInputStream(is);
	Emp k=(Emp) oi.readObject();
	System.out.println(k);
	
	FileInputStream is1=new FileInputStream("file3.txt");
	DataInputStream ios=new DataInputStream(is1);
	String f;
	 while( (f=ios.readLine())!=null) {
	System.out.println(f);}
	
	FileReader fr=new FileReader("file2.txt");
	BufferedReader br1=new BufferedReader(fr);
	String n=br1.readLine();
	System.out.println(n);
}
}
