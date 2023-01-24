package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ExcuteProgram {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try {
		Connection conn=DriverManager.getConnection(url,"c##batch4pm","nareshit");
		Statement stmt=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the query");
		String query=sc.nextLine();
		boolean b=stmt.execute(query);
		if(b==true)
		{
			ResultSet rs=stmt.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3))											;
				
			}
		}
		else
		{
			int rowcount=stmt.getUpdateCount();
			System.out.println(rowcount);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
