<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 
1.sql:setDataSource 
2.sql:query 
3.sql:update
4.sql:param 
5.sql:dateParam 
6.sql:transaction -->


<sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/bhagyadb" user="root" 
password="root"/>


<sql:update dataSource="${ds}" var="count">  
INSERT INTO  bookdetails values('59',919,'hello', 'hello', 'hello');  
</sql:update> 

<sql:update dataSource="${ds}" var="count1">  
delete from bookdetails where bookid=?
<sql:param value="1"/>
</sql:update>  

<sql:update dataSource="${ds}" var="count2">  
update bookdetails set bookname=? where sid=?
<sql:param value="biography"/>
<sql:param value="admin"/>
</sql:update>  

  
<sql:query dataSource="${ds}" var="rs">
select * from bookdetails;

</sql:query>

<c:forEach var="tab" items="${rs.rows}">
Sid: <c:out value="${tab.sid}"></c:out><br>
Bookid: <c:out value="${tab.bookid}"></c:out><br>
BookName <c:out value="${tab.bookname}"></c:out><br>
AuthorName <c:out value="${tab.authorname}"></c:out><br>
PublisherName <c:out value="${tab.publishername}"></c:out><br>

</c:forEach>

<sql:transaction dataSource="${ds}">

<sql:update var="count">  
INSERT INTO  bookdetails values('599',819,'ello', 'ello', 'ello');  
</sql:update> 

<sql:update var="count1">  
delete from bookdetails where bookid=?
<sql:param value="1"/>
</sql:update>  

<sql:update var="count2">  
update bookdetails set bookname=? where sid=?
<sql:param value="biography"/>
<sql:param value="admin"/>
</sql:update>  

  
<sql:query var="rs">
select * from bookdetails;

</sql:query>

<c:forEach var="tab" items="${rs.rows}">
Sid: <c:out value="${tab.sid}"></c:out><br>
Bookid: <c:out value="${tab.bookid}"></c:out><br>
BookName <c:out value="${tab.bookname}"></c:out><br>
AuthorName <c:out value="${tab.authorname}"></c:out><br>
PublisherName <c:out value="${tab.publishername}"></c:out><br>

</c:forEach>


 </sql:transaction>


</body>
</html>

