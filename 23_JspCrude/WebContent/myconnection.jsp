<%@ page import="java.sql.*,java.io.PrintWriter" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String u=request.getParameter("uname");
String p=request.getParameter("pwd");
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/bhagyadb";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement ps;
	String sql="insert into authentication values(?,?)";
	//PreparedStatement 
	ps=con.prepareStatement(sql);
	ps.setString(1,u);
	ps.setString(2,p);
	ps.execute();
	String sql1="update authentication set spassword='kavya' where sid='557'";
	 ps=con.prepareStatement(sql1);
	 ps.execute();
	 String sql2="delete from authentication where spassword='NULL'";
	 ps=con.prepareStatement(sql2);
	 ps.execute();
	 response.setContentType("text/html");
	 PrintWriter pw=response.getWriter();
	// pw.print("Records updated<br>");
	// pw.print("updated records are:<br>");
String	sql3="select * from authentication";
	 Statement s=con.createStatement();
	 ResultSet rs=s.executeQuery(sql3);
	 while(rs.next())
	 {
		 pw.print(rs.getString(1)+" "+rs.getString(2));
		 pw.print("<br>");
	 }
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>
</body>
</html>