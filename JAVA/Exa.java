package day10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exa {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Connection con=CC.createConnection("demo");
			
			CC.createStatement(con);
			String str="select * from emp";
			ResultSet rs=CC.smtExecuteStatement(str);
			 
				while(rs.next())
				{
					System.out.println(rs.getInt("empcode") + "  "+ rs.getString("empname")+ "  "+ rs.getString("deptcode"));
				
				
				}
				
				
				Connection con1=CC.createConnection("hi");
				CC.createStatement(con1);
				String str2="update emp set dob ='1998-06-12' where empid = 1";
				int rs1=CC.smtUpdateStatement(str2);
				ResultSet rs2=CC.smtExecuteStatement(str);
				while(rs2.next())
				{
					System.out.println(rs2.getInt("empid") + "  "+ rs2.getString("name")+ "  "+ rs2.getString("dob")+" "+rs2.getInt("salary"));
				
				
				}
				

			
		}
}
