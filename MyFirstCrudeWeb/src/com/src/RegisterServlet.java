package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
			String sql="insert into logindetails values(?,?,?,?)";
			con = DriverManager.getConnection(url, username, password);
		    //insert employee record into database
		   PreparedStatement stmt = con.prepareStatement(sql);
		   stmt.setString(1,fn);
		   stmt.setString(2, ln);
		   stmt.setString(3,un);
		   stmt.setString(4,pwd);
		    stmt.executeUpdate();
		
		PrintWriter p=response.getWriter();
		p.print("registered");
		stmt.close();
		con.close();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	catch(Exception e)
		{
		
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
