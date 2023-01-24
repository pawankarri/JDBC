package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String query="update table1 set city='hyderabad' where id=102";
	try {
		Connection conn=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		Statement stmt=conn.createStatement();
		stmt.executeUpdate(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
