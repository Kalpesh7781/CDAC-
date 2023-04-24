package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P7 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi","root","Kalpesh");
    String s= "select * from book where publication=?";
	PreparedStatement pmt=con.prepareStatement(s);
    pmt.setString(1, "bloomurrhy");
    ResultSet rs=pmt.executeQuery();
    while(rs.next())
    {
    	System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getInt(5)+rs.getString(6));
    }
 
}
}
