package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2
{
public static void main(String[] args) throws IOException 
{

	ServerSocket ss = new ServerSocket(999);
    Socket s=  ss.accept();
    System.out.println("get the socket connection");
    
    // read data from socket
    
    InputStream is =s.getInputStream();
    InputStreamReader ir = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(ir);
   
    	String msg =    br.readLine();
    	
    	
    	// write data to the console
       	
		  
		  System.out.println("message from client is = "+ msg);
		  
		  //read from console
		  
		  
		     InputStreamReader ir1 = new InputStreamReader(System.in);
			 BufferedReader br1 = new BufferedReader(ir1);
			 
			 
			 System.out.println("enter the message for client");
			 String msg1 = br1.readLine();  
		  
		  //write to the socket
			 
			    OutputStream os=s.getOutputStream();
			    PrintStream ps = new PrintStream(os);
			    
			    //write to the socket
			    
			    ps.println(msg1);
			    
			    
			    s.close();
			    ss.close();
		        os.close();
		        ps.close();
    
    
}
}
