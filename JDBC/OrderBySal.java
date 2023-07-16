package demos;

import java.sql.Connection;
import java.util.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrderBySal {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/danny";
		Connection con=DriverManager.getConnection(url,"root","Danny@123");
		Statement st=con.createStatement();
		//		ResultSet rs=st.executeQuery("select * from emp13 order by sal desc");
		ResultSet rs=st.executeQuery("select * from emp13");
		Set<Emp>list=new TreeSet<>();
		while(rs.next())
		{
			Emp e=new Emp(rs.getInt(1), rs.getString(2), rs.getFloat(6));
			list.add(e);
		}
		for(Emp k : list)
		{
			System.out.println(k);
		}


	}

}
