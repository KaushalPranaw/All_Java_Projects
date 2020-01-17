<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h3 align="center">Last Action Status : ${sessionScope.cust.status}</h3>
 

	<table style="background-color: cyan; margin: auto;" border="1">
		 
			<tr>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>ROLE</th>
				<th>AMOUNT</th>
				<th>DATE</th>
				<th> UPDATE  </th>
				<th> DELETE  </th>
			</tr>
	<c:forEach var="c" items="${sessionScope.cust.allCust}">
			<tr>
				<td>${c.name}</td>
				<td>${c.email}</td>
				<td>${c.role}</td>
				<td>${c.amount}</td>
				<td>${c.date}</td>
				<td><a href="update.jsp?id=${c.custId}">UPDATE</a> </td>
				<td><a href="delete.jsp?id=${c.custId}">DELETE</a> </td>
			</tr>
		</c:forEach>
		
		</table>
	 
	<h4>
		<a href="logout.jsp">Log Out</a>
	</h4>
  
</body>
</html>