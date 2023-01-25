package jdbc;
import java.sql.*;
public class CallableStatementOracle {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try {
		Connection con=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		CallableStatement cs=con.prepareCall("{call insert5(?,?,?)}");
		cs.setInt(1,101);
		cs.setString(2,"pawan");
		cs.setInt(3,24);
		cs.executeUpdate();
		con.close();
		System.out.println("record updated");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
