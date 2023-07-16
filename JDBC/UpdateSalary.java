package demos;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
public class UpdateSalary {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/danny";
		Connection con=DriverManager.getConnection(url,"root","Danny@123");
		Statement st=con.createStatement();
		
		int n=st.executeUpdate("update emp13 set sal=1500 where sal<1000");
		
		System.out.println(n);
		ResultSet rs=st.executeQuery("select * from emp13 where sal=1500");
		while(rs.next())
		{
				for(int i=1;i<=6;i++)
				{
					System.out.println(rs.getString(i));
				}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
