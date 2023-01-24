package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareDelete {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String query="delete from pawan where id=?";
	try {
		Connection conn=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		java.sql.PreparedStatement ps=conn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id:");
		int id=sc.nextInt();
		ps.setInt(1,id);
		ps.executeUpdate();
		conn.close();
		System.out.println("records updated");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
