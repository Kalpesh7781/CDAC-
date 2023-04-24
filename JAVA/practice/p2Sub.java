package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class p2Sub {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fi=new FileInputStream("oos.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	Student1 s;//(Student1) oi.readObject();
	ArrayList<Student1> al=new ArrayList <>();
try{while((s=(Student1) oi.readObject())!=null) {
	System.out.println(s);
	al.add(s);}}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
