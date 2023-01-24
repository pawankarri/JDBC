package jdbc;
import java.sql.*;
public class DeleteQuery {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String query="delete from table1 where id=102";
	try {
		Connection conn=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		System.out.println("connection established");
		Statement stmt=conn.createStatement();
		System.out.println("platform created");
		stmt.executeUpdate(query);
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
