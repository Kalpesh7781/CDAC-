package day12;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
	
		 Socket s = new Socket("localhost",888);
		
		 InputStreamReader ir = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(ir);
		 
		 
		 System.out.println("enter the message for client");
		 String msg = br.readLine();
		 
		 //we have opened the socket for write
		 
		    	 
		    OutputStream os=s.getOutputStream();
		    PrintStream ps = new PrintStream(os);
		    
		    //write to the socket
		    
		    ps.println(msg);
		 
		    os.close();
		    ps.close();
		 
		     
	}
}
