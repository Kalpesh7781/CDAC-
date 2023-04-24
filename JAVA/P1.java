package practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class P1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi","root","Kalpesh");
	Statement smt=con.createStatement();
	String d="select * from emp";
	ResultSet rs=smt.executeQuery(d);
	while(rs.next())
	{
		System.out.println(rs.getInt(3)+" "+rs.getString(1)+" "+rs.getDate(2)+" "+rs.getInt(4));
	}
	//con.close();
	//Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi","root","Kalpesh");
	System.out.println("\n prepared statement \n");
	String h="select * from emp where empid=?";
	PreparedStatement pmt=con.prepareStatement(h);
	pmt.setInt(1,21);
	ResultSet re=pmt.executeQuery();
	while(re.next())
	{
		System.out.println(re.getInt(3)+" "+re.getString(1)+" "+re.getDate(2)+" "+re.getInt(4));
	}
	
	
	
	System.out.println("\n callable statement \n");
	Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","Kalpesh");
	String l="{call sp_inout(?,?,?)}";
	CallableStatement cmt=con1.prepareCall(l);
	cmt.setInt(1,450);
	cmt.setInt(2,134);
	cmt.registerOutParameter(3, Types.INTEGER);
	cmt.execute();
	System.out.println(cmt.getInt(3));
	 
	
}
}
