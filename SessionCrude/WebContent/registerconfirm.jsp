<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./registercst" method="post">
enter cid:<%=request.getParameter("cid")%><br><input type="hidden" name="cid" value="<%=request.getParameter("cid")%>"><br>
enter firstname<%=request.getParameter("fname")%><br><input type="hidden" name="fname" value="<%=request.getParameter("fname")%>"><br>
enter lastname:<%=request.getParameter("lname")%><br><input type="hidden" name="lname" value="<%=request.getParameter("lname")%>"><br>
enter password:<%=request.getParameter("pwd")%><br><input type="hidden" name="pwd" value="<%=request.getParameter("pwd")%>"><br>
enter mobile:<%=request.getParameter("mob")%><br><input type="hidden" name="mob" value="<%=request.getParameter("mob")%>"><br>

enter address:<%=request.getParameter("add")%><br><input type="hidden" name="add" value="<%=request.getParameter("add")%>"><br>
enter country:<%=request.getParameter("country")%><br><input type="hidden" name="country" value="<%=request.getParameter("country")%>"><br>
<input type="submit"/><input type="reset"/>
</body>
</html>