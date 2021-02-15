<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String msg=request.getParameter("msg");
if(msg!=null)
{
	%>
	
	<%=msg %>
	<% 
}
%>

<form action="./registerconfirm.jsp" method="post">
enter Customer id: <input type="text" name="cid"/><br>
enter Customer first name: <input type="text" name="fname"/><br>
enter Customer last name: <input type="text" name="lname"/><br>
enter Customer  password:<input type="text" name="pwd"/><br>
enter Customer  mobileno:<input type="text" name="mob"/><br>
enter Customer  address:<textarea name="address"/></textarea><br>
enter Customer  country:<select name="country">
<option>select country</option>
<option>ind</option>
<option>chaina</option>
</select>
<input type="submit"/><input type="reset"/>

</form>
</body>
</html>