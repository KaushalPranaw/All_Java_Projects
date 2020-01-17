<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="search.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: Arial;
}

* {
	box-sizing: border-box;
}

form.example input[type=number] {
	padding: 10px;
	font-size: 17px;
	border: 1px solid grey;
	float: left;
	width: 80%;
	background: #f1f1f1;
}

form.example button {
	float: left;
	width: 20%;
	padding: 10px;
	background: #2196F3;
	color: white;
	font-size: 17px;
	border: 1px solid grey;
	border-left: none;
	cursor: pointer;
}

form.example button:hover {
	background: #0b7dda;
}

form.example::after {
	content: "";
	clear: both;
	display: table;
}
</style>
<title>Home</title>
</head>
<body>
	<form class="example"
		action="/poc_project/employee/search"
		style="margin: auto; max-width: 300px">
		<input type="number" placeholder="Search.." name="id">
		<button type="submit">
			<i class="fa fa-search"></i>
		</button>
	</form>
	<div align="center">
		<h2>${status}</h2>
	</div>

	<form:form>
		<table border="1" align="center">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>TASK</th>
				<th>ASSIGNED_BY</th>
				<th>STATUS</th>
				<th colspan="2">OPERATION</th>
			</tr>
			<c:forEach items="${employee_details}" var="employee">
				<tr>
					<td>${employee.employeeId}</td>
					<td>${employee.employeeName}</td>
					<td>${employee.employeeTask}</td>
					<td>${employee.assignedBy}</td>
					<td>${employee.status}</td>
					<td><a
						href='<spring:url value="/employee/edit?id=${employee.employeeId}"/>'>edit</a>
					</td>
					<td><a
						href='<spring:url value="/employee/delete?id=${employee.employeeId}"/>'>delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>

	</form:form>
	<div align="center">
		<a href='<spring:url value="/employee/add"/>'>Add Employee</a>
	</div>
</body>
</html>