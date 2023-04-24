package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C1 {
public static void main(String[] args) throws UnknownHostException, IOException {
	//create connection with server
	Socket s=new Socket("localhost",1241);
	
	//read message from console
	InputStreamReader ir=new InputStreamReader(System.in); //takes input as int
	 
	BufferedReader br=new BufferedReader(ir);
	 
	System.out.println("enter message to server");
	String msg=br.readLine(); 
	 
	
	//write to socket
	OutputStream os=s.getOutputStream();
	 
	PrintStream ps=new PrintStream(os);//since we dont have method to print in os we use printstream

	ps.println(msg);
	
	//read from socket
	InputStream is=s.getInputStream();
	InputStreamReader ir1=new InputStreamReader(is);
	 
	BufferedReader br1=new BufferedReader(ir1);
	String msg1=br1.readLine();
	System.out.println("message from server:"+msg1);
	
	
	s.close();
	os.close();
	ps.close();
	
	
	
	
}
}
