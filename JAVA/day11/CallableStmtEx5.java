package day11;
//program for inout parameter
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStmtEx5 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con=CC.createConnection("hi");
	String str="{call empsal(?)}";
	CallableStatement cmt=con.prepareCall(str);
	System.out.println("Enter name to view salary");
	Scanner ip=new Scanner(System.in);
	String name=ip.next();
	cmt.setString(1,name);
	
	cmt.registerOutParameter(1,Types.VARCHAR);
	cmt.execute();
	System.out.println(cmt.getString(1));
}
}
