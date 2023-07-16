package demos;

import java.sql.Connection;
import java.util.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConSql
{
	public static void main(String[] args) throws Exception
	{
		
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/test";
		
		Connection con=DriverManager.getConnection(url,"root","Danny@123");
	
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from worker");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			System.out.println();
		}
		
		
		

	}

}
