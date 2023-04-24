package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepStmt {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2", "root", "Kalpesh");
	String m="select ename from emp where sal>?";
	PreparedStatement smt=con.prepareStatement(m);
	smt.setInt(1,2000);
	ResultSet rs=smt.executeQuery();
	//rs.next();
	while(rs.next()) {
	System.out.println(rs.getString(1));  }
	
}
}
