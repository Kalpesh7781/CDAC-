package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcPreparedExample
{

	 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	    Scanner ip=new Scanner(System.in);
		PreparedStatement pmt=null;
		Connection con =JdbcManagement.createConnection();
		boolean flag=true;
		while(flag)
		{
			
			System.out.println("Enter a choice");
			System.out.println("1: display content of database");
			System.out.println("2: update sal by rs on empno");
			System.out.println("3: delete database by empno");
			int ch=ip.nextInt();
			switch(ch)
			
			{
			case 1:
				JdbcManagement.Select(con,pmt);
			     break;
			case 2:
				 
				JdbcManagement.update(con,pmt);
				break;
			case 3:
				JdbcManagement.delete(con,pmt);
				break;
			
			}
			
		//Connection con =JdbcManagement.createConnection();
	//JdbcManagement.Select(con,pmt);
		//JdbcManagement.delete(con,pmt);
		//JdbcManagement.update(con,pmt);
		
		}
		
		
		
		
		
		
		
		
	}
	
}
