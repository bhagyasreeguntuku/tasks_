package com.src;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterCustomerServlet
 */
@WebServlet("/registercst")
public class RegisterCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String cid=request.getParameter("cid");
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String password=request.getParameter("pwd");
		String mobile=request.getParameter("mob");
		String address=request.getParameter("sadd");
		String country=request.getParameter("country");
		
		

DbConnection dbc=new DbConnection();
String sql="insert into authentication1 values(?,?)";
PreparedStatement ps=dbc.getMyPreparedStatement(sql);

String sql1="insert into customerdetails values(?,?,?,?,?,?,?)";
PreparedStatement ps1=dbc.getMyPreparedStatement(sql1);

try {
	ps.setString(1,cid);

ps.setString(2,password);

ps1.setString(1,cid);
ps1.setString(2,firstname);
ps1.setString(3,lastname);
ps1.setString(4,password);
ps1.setString(5,mobile);
ps1.setString(6,address);
ps1.setString(7,country);
int i=ps.executeUpdate();
int j=ps1.executeUpdate();
String message;
if(i>0 && j>0)
{
message="registered successfully";
response.sendRedirect("index.jsp?msg="+"message inserted");
//rename index.html to index.jsp
//msg(server-client//maintaing tracking called session tracking)
//(cookies,hiddenforn,url rewriting,httpsessions)


}
else
{

message="not able to add student";
response.sendRedirect("register.jsp?msg="+"message uncessfull");
}

		
} catch (SQLException e) {
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
