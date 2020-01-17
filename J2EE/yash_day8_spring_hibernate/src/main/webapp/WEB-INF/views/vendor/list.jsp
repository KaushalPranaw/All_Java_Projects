<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All List</title>
</head>
<body>
	<h2 align="center">${status}</h2>
	<form action="">
		
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Salary</th>
				<th>Date</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="v" items="${list}">
				<tr>
					<td>${v.id}</td>
					<td>${v.name}</td>
					<td>${v.salary}</td>
					<td>${v.jDate}</td>
					<td><a href='<spring:url value="/vendor/update?id=${v.id}"/>'>Update</a>
					</td>
					<td><a href='<spring:url value="/vendor/delete?id=${v.id}"/>'>Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	<a href='<spring:url value="/vendor/add"/>'>Add Vendor</a>



</body>
</html>