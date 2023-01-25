package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableInsert {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	try {
		Connection conn=DriverManager.getConnection(url);
		CallableStatement cs=conn.prepareCall("call pawan.InsertRecord");
		cs.executeUpdate();
		System.out.println("record inserted");
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
