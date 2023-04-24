package day11;
//stored procedure with no parameter 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

public class CallableStmtEx3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con=CC.createConnection("demo2");
	String str="{call sp_exp()}";
	//CallableStatement cmt=(CallableStatement) 
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery(str);
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
	}
}
}
