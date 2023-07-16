package demos;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EmpNumber {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/danny";
		Connection con=DriverManager.getConnection(url,"root","Danny@123");
		Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("select * from emp13 where empno=?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the empno");
		int no=Integer.parseInt(br.readLine());
		ps.setInt(1, no);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			for (int i=1;i<=6;i++)
			{
				System.out.println(rs.getString(i));
			}
		}
		
		
	

	}

}
