package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareUpdate {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String query="update pawan set age=? where name=? and id=?";
	try {
		Connection conn=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		java.sql.PreparedStatement ps=conn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		ps.setInt(1,age);
		System.out.println("enter the name:");
		String name=sc.next();
		ps.setString(2,name);
		System.out.println("enter the id:");
		int id=sc.nextInt();
		ps.setInt(3,id);
		conn.close();
		if(age>0)
		{
			System.out.println("record updated");
		}
		else
		{
			System.out.println("invaild age");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
