package day12;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3
{

	private static void findResult(Student stu) 
	{
	if(stu.mark>40)
		System.out.println("PASS");
	else
		System.out.println("FAIL");
		
	}
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		ServerSocket ss = new ServerSocket(1520);
	      Socket s=  ss.accept();
	      System.out.println("get the socket connection");
	      
	      //read from the socket
	      
	       InputStream is=s.getInputStream();
	       ObjectInputStream ois = new ObjectInputStream(is);
	       
	       Student stu =(Student) ois.readObject();   
	     
	    //display on the console
	       
	       
	         stu.displayStudent();
	         findResult(stu);  
	         
	     
	     ss.close();
	     s.close();
	     ois.close();
	     
	     
	     
	     
	     
	}

	
}


