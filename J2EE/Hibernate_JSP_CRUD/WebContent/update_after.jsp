
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="cust" class="beans.CustomerBeans" scope="session"/>
 <jsp:setProperty property="*" name="cust"/> 
 <body>
update Outcome : ${sessionScope.cust.update()}
<br>
<a href="home.jsp">home</a>
</body>
</html>
 
