package day11;
// with out parameter only
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmtEx2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con=CC.createConnection("demo2");
	String str="call sp_out(?)";
	CallableStatement cmt=con.prepareCall(str);
	cmt.registerOutParameter(1,Types.VARCHAR);
	cmt.execute();
	System.out.println(cmt.getInt(1));
}
}
