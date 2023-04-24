package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.jar.Attributes.Name;

 

public class CreateStmt {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","Kalpesh");
	 Statement smt=con.createStatement();
	 String s="select * from emp";
	 
	ResultSet rs= smt.executeQuery(s);
	
	 while(rs.next())
	 {
		 System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	 }
	 
	 
}
}
