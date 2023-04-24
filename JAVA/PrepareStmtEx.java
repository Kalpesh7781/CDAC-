package day10;

import java.sql.Connection;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

 

public class PrepareStmtEx {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con=CC.createConnection("hi");
	String str="select * from emp_bonus where bonus>?";
	CC.preaparedStatement1(con, str);
	//PreparedStatement pmt=con.prepareStatement(str);
    System.out.println("enter emp bonus:");
	Scanner ip=new Scanner(System.in);
    int empbonus=ip.nextInt();
	 CC.pmtSet2(1,empbonus);
	 
	ResultSet rs= CC.pmtExecuteStatement();
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)
		);
	}
	 
	
}
}
