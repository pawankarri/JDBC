package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableDeleteORacle {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try {
		Connection con=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		CallableStatement cs=con.prepareCall("{call delete1(?)");
		cs.setInt(1,102);
		cs.executeUpdate();
		con.close();
		System.out.println("deleted");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
