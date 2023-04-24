package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

 
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

	public static void main(String[] args) throws IOException 
	{
	
		      ServerSocket ss = new ServerSocket(888);
		      Socket s=  ss.accept();
		      
		      System.out.println("get the socket connection");
		      
		      // read data from socket
		      
		       InputStream is =s.getInputStream();
		       InputStreamReader ir = new InputStreamReader(is);
		       BufferedReader br = new BufferedReader(ir);
		      
		       	String msg =    br.readLine();
		       	
		       	// write data to the console
		       	
		  
		  System.out.println("message from client is = "+ msg);
		 
	}
	
}
