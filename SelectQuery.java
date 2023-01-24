package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String query="select * from table1";
	try {
		Connection conn=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		boolean status=rs.next();
		System.out.println("status:"+status);
		int id=rs.getInt("id");
		String name=rs.getString("name");
		String city=rs.getString("city");
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("city:"+city);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
