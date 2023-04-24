package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcObject 
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
			 
			 ArrayList<Emp> al = new ArrayList<>();
			 
			while(rs.next())
			{
			//	System.out.println(rs.getInt("EMPNO") + "  "+ rs.getString("ENAME")+ " "+ rs.getFloat("SAL"));
			
				Emp e = new Emp(rs.getInt("EMPNO"),rs.getString("ENAME"),rs.getFloat("SAL"));
			
				 al.add(e);
			}
		
		System.out.println("data from arraylsit");
			for(Emp e :al)
			{
				e.dispemp();
			}
			
			
	} 
	
}