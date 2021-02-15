package com.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
public Statement getMyStatement()
    {	
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/bhagyadb";
			String username="root";
			String password="root";
			
			con=DriverManager.getConnection(url,username,password);
			st=con.createStatement();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
	}
		return st;
}
public PreparedStatement getMyPreparedStatement(String sql)
{	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/bhagyadb";
		String username="root";
		String password="root";
		
		con=DriverManager.getConnection(url,username,password);
		ps=con.prepareStatement(sql);
	}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
}
	return ps;
}


}