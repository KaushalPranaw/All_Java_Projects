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
	<h2>On List Page</h2>
	<h2>Emp details:</h2>
	<h2>Status: ${status}</h2>
	<form action="">

		<table align="center" border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Salary</th>
				<th>City</th>
				<th>state</th>
				<th>country</th>
				<th colspan="2">Mobile Number</th>

				 
				<th>UPDATE</th>
				<th>DELETE</th>
				
			</tr>
			<c:forEach var="emp" items="${emp_list}">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.salary}</td>
					<td>${emp.address.city}</td>
					<td>${emp.address.state}</td>
					<td>${emp.address.country}</td>
					<td>${emp.contactList[0].number}</td>
					<td>${emp.contactList[1].number}</td>
					<%-- <td>${emp.courseList[0].courseName} </td>
  		<td>${emp.courseList[1].courseName} </td> --%>
					<td><a href='<spring:url value="/emp/update?id=${emp.id}"/>'>UPDATE</a>
					</td>
					<td><a href='<spring:url value="/emp/delete?id=${emp.id}"/>'>DELETE</a>
					</td>
				

					<td>
						<h3>
							<a href='<spring:url value="/emp/addCourse?id=${emp.id}"/>'>Add Course</a>
						</h3>
					</td>
					<td>
						<h3>
							<a href='<spring:url value="/emp/viewCourse?id=${emp.id}"/>'>View Course</a>
						</h3>
					</td>
				</tr>
			</c:forEach>
		</table>

	</form>
</body>
</html>