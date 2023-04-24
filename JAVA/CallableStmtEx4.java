package day11;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStmtEx4 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con=CC.createConnection("demo2");
	String str="{call exa(?,?,?)}";
	CallableStatement cmt=con.prepareCall(str);
	System.out.println("enter emp no:");
	Scanner ip=new Scanner(System.in);
	int val1=ip.nextInt();
	//System.out.println("enter second number: ");
	//int val2=ip.nextInt();
	
	cmt.setInt(1,val1);
	//cmt.setInt(2, val2);
	cmt.registerOutParameter(2, Types.VARCHAR);
	
	cmt.registerOutParameter(3, Types.INTEGER);
	cmt.execute();
	//int k=cmt.getInt(3);
	System.out.println("empname ="+cmt.getString(2)+" dept no "+cmt.getInt(3));
	//System.out.println(k);
}
}
