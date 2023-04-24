package day12;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client3 
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
	
		 Socket s = new Socket("localhost",1520);
		 
		 //create object of Student
		 
		 Student stu = new Student(1001,"nsnathan",50); 
		 
		 //write object into the socket
		 
		  OutputStream os =s.getOutputStream();
		  ObjectOutputStream oos = new ObjectOutputStream(os);
		  
		  oos.writeObject(stu);
		  
		  System.out.println("object write is over");
		  
		  s.close();
		  os.close();
		  oos.close();
		  
		  
		  
		  
		  
		  
		  
		  
		 
	}
	
	
}
