<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="">
	<table border="1" align="center" bgcolor="yellow">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>SALARY</th>
			<th>ROLE</th>
			<th>DATE</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
		<c:forEach var="c" items="${requestScope.customer_dtls}">
			<tr>
				<td>${c.id}</td>
				<td>${c.name}</td>
				<td>${c.email}</td>
				<td>${c.password}</td>
				<td>${c.salary}</td>
				<td>${c.role}</td>
				<td>${c.date1}</td>
				<td><a href="<spring:url value='/customer/update?cid=${c.id}'/>">update</a> </td>
				<td><a href="<spring:url value='/customer/delete?cid=${c.id}'/>">delete</a> </td>
			</tr>
		</c:forEach>
	</table>

</form>
</body>
</html>