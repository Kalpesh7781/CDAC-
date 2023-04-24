package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CC {
	static Statement smt;
	static PreparedStatement pmt;
	static Connection createConnection(String str) throws ClassNotFoundException, SQLException
	{
		
		//loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		//System.out.println("enter database name");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+str,"root","Kalpesh");
		return con;

 }
	static void createStatement(Connection con) throws SQLException
	{
		 smt=con.createStatement();
	}
	static ResultSet smtExecuteStatement(String str) throws SQLException
	{
		 ResultSet rs=smt.executeQuery(str);
		return rs;
	}
	static int smtUpdateStatement(String str) throws SQLException
	{
		 int rs=0;
		 rs=smt.executeUpdate(str);
		return rs;
	}
	static PreparedStatement preaparedStatement1(Connection con,String str) throws SQLException
	{
		 pmt=con.prepareStatement(str);
		 return pmt;
	}
	
	static void pmtSet2(int no, String str) throws SQLException  
	{
		pmt.setNString(no, str);
		
	}
	static void pmtSet2(int no, int no2) throws SQLException  
	{
		pmt.setInt(no, no2);
		
	}
	
	
	static ResultSet pmtExecuteStatement() throws SQLException
	{
		 ResultSet rs=pmt.executeQuery();
		return rs;
	}
	static int pmtUpdateStatement(String str) throws SQLException
	{
		 int rs=0;
		 rs=pmt.executeUpdate(str);
		return rs;
	}
}