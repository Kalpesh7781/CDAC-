package practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Callablestmt {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi","root","Kalpesh");
	String h="{call empsal(?)}";
	CallableStatement cmt=con.prepareCall(h);
	cmt.setString(1,"ajit");
	
	cmt.registerOutParameter(1,Types.INTEGER);
	
	cmt.execute();
	System.out.println(cmt.getInt(1));
	
}
}
