<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3 align="center">${status}</h3>
	<form action="">
		<table align="center" border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Salary</th>
				<th>UPDATE</th>
				<th>DELETE</th>
			</tr>
			<c:forEach var="s" items="${stud_list}">
				<tr>
					<td>${s.id}</td>
					<td>${s.name}</td>
					<td>${s.salary}</td>
					<td><a href='<spring:url value="/student/update?id=${s.id}"/>'>update</a>
														
					</td>
					<td><a href='<spring:url value="/student/delete?id=${s.id}"/>'>delete</a>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5" align="center"><a href='<spring:url value="/student/create"/>'>create</a></td>
			</tr>
		</table>

	</form>
</body>
</html>