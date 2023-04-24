package day11;
//with only in parameter
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStmt {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 Connection con=CC.createConnection("demo");
	 String str="{call sp_deptinfo(?)}";
	 //PreparedStatement pmt=con.prepareCall(str);
	 CallableStatement cmt=con.prepareCall(str);
	 cmt.setString(1,"Accounts");
	// pmt.setString(1,"Accounts");
	 ResultSet rs=cmt.executeQuery();
	// ResultSet rs=pmt.executeQuery();
	 while(rs.next())
	 {
		 System.out.println(rs.getInt(1)+" "+rs.getString(2));
	 }
}
}
