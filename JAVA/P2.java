package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class P2 {
public static void main(String[] args) throws IOException {
	FileOutputStream fo=new FileOutputStream("oos.txt");
	
	ObjectOutputStream os=new ObjectOutputStream(fo);
	Student1 s1=new Student1(1,"ram",6,"reading");
	Student1 s2=new Student1(2,"radha",7,"writing");
	Student1 s3=new Student1(3,"raman",5,"playing");
	Student1 s4=new Student1(4,"ramesh",6,"reading");
	Student1 s5=new Student1(5,"rana",5,"writing");
	Student1 s6=new Student1(6,"raj",6,"singing");
	os.writeObject(s1);
	os.writeObject(s2);
	os.writeObject(s3);
	os.writeObject(s4);
	os.writeObject(s5);
	os.writeObject(s6);
	os.close();
	
}
}
