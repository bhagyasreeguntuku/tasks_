package com.src;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ItemServlet
 */
@WebServlet("/ItemServlet")
public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Cookie ck[]=request.getCookies();
		ck[0].getValue();
		String user=ck[0].getValue();
		String ItemId=request.getParameter("ItemId");
		String ItemName=request.getParameter("ItemName");
		String ItemPrice=request.getParameter("ItemPrice");
		
				
		
		DbConnection db=new DbConnection();
		String sql="insert into item values(?,?,?)";
		PreparedStatement ps=db.getMyPreparedStatement(sql);
		try {
			ps.setString(1,user);
			ps.setString(2,ItemId);
			ps.setString(3,ItemName);
			ps.setString(4,ItemPrice);
			
			int i=ps.executeUpdate();

Cookie ck1=new Cookie("user","");
ck1.setMaxAge(0);
response.addCookie(ck1);	
			
			if(i>0)
			{
				response.sendRedirect("profile.jsp");
			}
			else
			{
				response.sendRedirect("ItemRegistration.jsp");
			}
		} catch (SQLException e) {



		
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
