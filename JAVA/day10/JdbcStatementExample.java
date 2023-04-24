package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementExample
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	//select
		Statement smt=null;
		int nor=0;
		
		//loading driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","Kalpesh");
		
		//create statement
		
		smt  = con.createStatement();
		
		// create Query
		 
		 String q1 = "Select * from emp ";
		 
		 //execute Query
		 
		 ResultSet rs =smt.executeQuery(q1);
		 
		 //iterate the resultSet and display on console
		 
		while(rs.next())
		{
			System.out.println(rs.getInt("EMPNO") + "  "+ rs.getString("ENAME")+ " "+ rs.getFloat("SAL"));
		
		
		}
		
		//--------------------------------------------------------------------//
		
		//update
		
		
		//smt = con.createStatement();
		
			String q2= "update emp set sal = sal+100 where empno = 7698";
		
			nor =smt.executeUpdate(q2);
		
		System.out.println(nor +" "+ "row updated");
		 //close connection
		
		
		
		
		//insert
		
	    String q3 ="insert into emp(empno,ename,sal)values(1001,'shan',40000)";
		nor=smt.executeUpdate(q3);
		
		System.out.println(nor +" "+ "record inserted");
		
		 
		//delete
		
		
        String q4="delete from emp where empno =1001";
		
		nor=smt.executeUpdate(q4);
		
		System.out.println(nor +" "+ "record deleted");
		
		rs.close();
		 
		 
		 
		 
		 
		
		
	}
	
	
}