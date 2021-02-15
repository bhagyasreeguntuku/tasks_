<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./ItemServlet" method="post">
enter ItemId:<%=request.getParameter("ItemId")%><br><input type="hidden" name="ItemId" value="<%=request.getParameter("ItemId")%>"><br>
enter ItemName:<%=request.getParameter("ItemName")%><br><input type="hidden" name="ItemName" value="<%=request.getParameter("ItemName")%>"><br>
enter ItemPrice:<%=request.getParameter("ItemPrice")%><br><input type="hidden" name="ItemPrice" value="<%=request.getParameter("ItemPrice")%>"><br>
<input type="submit"/><input type="reset"/>


</body>
</html>