package day12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
	
		Socket s = new Socket("localhost",999);
		
		//read from console
		
		 InputStreamReader ir = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(ir);
		  
		 System.out.println("enter the message for server");
		 String msg = br.readLine();
		
		 
		 //write to the socket
		 
		   OutputStream os=s.getOutputStream();
		    PrintStream ps = new PrintStream(os);
		    
		    //write to the socket
		    
		    ps.println(msg);
		    
		    
		    // read data from socket
		      
		       InputStream is =s.getInputStream();
		       InputStreamReader ir1 = new InputStreamReader(is);
		       BufferedReader br1 = new BufferedReader(ir1);
		      
		       	String msg1 =    br1.readLine();
		       	
		    
		        System.out.println("message from server is = "+ msg1);
		        
		        s.close();
		        os.close();
		        ps.close();
		
		
	}
	
}
