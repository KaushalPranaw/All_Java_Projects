<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<table border="1" align="center">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Date</th>
		<th>Salary</th>
		<th>Email</th>
		<th>Password</th>
		<th>Role</th>
	</tr>
	<tr>
		<td>${user_dtls.id}</td>
		<td>${user_dtls.name}</td>
		<td>${user_dtls.date1}</td>
		<td>${user_dtls.salary}</td>
		<td>${user_dtls.email}</td>
		<td>${user_dtls.password}</td>
		<td>${user_dtls.role}</td>
		
	</tr>
	<tr>
	
		<td><a href="<spring:url value='/customer/logout'/>">Logout</a>
		 </td>
	</tr>
	</table>
</form>


</body>
</html>