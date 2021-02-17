package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		var fn=request.getParameter("fname");
		var ln=request.getParameter("lname");
		var un=request.getParameter("uname");
		var pwd=request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out1=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bhagyadb";
			String username="root";
			String password="root";
			Connection con;
			con = DriverManager.getConnection(url, username, password);
			    System.out.println("Successfully connected");
		   	    String sql2="update logindetails set lname='bhagya' where fname='bhagya'";
		   	 PreparedStatement stmt = con.prepareStatement(sql2);
		     stmt.executeUpdate();
			    String sql1="select * from logindetails";
			    //insert employee record into database
			  Statement stmt1 = con.prepareStatement(sql1);
			   ResultSet st=stmt1.executeQuery(sql1);
			   response.setContentType("text/html");
			    sql1="delete  from logindetails where fname='NULL'";
			    PreparedStatement stmt2 = con.prepareStatement(sql1);
			     stmt2.executeUpdate();
			    response.setContentType("text/html");
			    while(st.next())
			    {
			    	out1.print(st.getString(1)+"|"+st.getString(2)+"|"+st.getString(3)+"|"+st.getString(4)+"<br>");
			    }
		}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
				   
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
