package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcManagement
{

	static Connection createConnection() throws ClassNotFoundException, SQLException
	{
		
		//loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","Kalpesh");
		return con;
		
	}

	public static void Select(Connection con,	PreparedStatement pmt) throws SQLException 
    {
		
		String q = "select * from emp where deptno =?";
		pmt  = con.prepareStatement(q);
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the dept no to select emp");
		int dno = s.nextInt();
		pmt.setInt(1, dno);
		ResultSet rs=pmt.executeQuery();
		
		
while(rs.next())
{
	System.out.println(rs.getInt("EMPNO") + "  "+ rs.getString("ENAME")+ " "+ rs.getFloat("SAL")+ " "+ rs.getInt("deptno"));


}
		
	}

	public static void delete(Connection con, PreparedStatement pmt) throws SQLException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the empno to delete from  emp");
		int eno = s.nextInt();
		String q = "delete from emp where empno = ?";
		pmt  = con.prepareStatement(q);
		pmt.setInt(1, eno);
		int nor=pmt.executeUpdate();
		System.out.println(nor + "rows deleted");
	}

	public static void update(Connection con, PreparedStatement pmt) throws SQLException
	{
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter the empno,sal to update");
		int eno = s.nextInt();
		float sal = s.nextFloat();
		
		String q = "update emp set sal = sal + ? where empno = ?";
		pmt  = con.prepareStatement(q);
		pmt.setFloat(1, sal);
		pmt.setInt(2, eno);
		int nor=pmt.executeUpdate();
		System.out.println(nor + "rows updated..");
		
		
	}
	
}
