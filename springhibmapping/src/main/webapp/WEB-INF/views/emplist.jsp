<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body>
	<table border="1">
		<tr>
			<td>Image</td>
			<td>NAME</td>
			<td>TASK</td>
			<td>ASSIGNEDBY</td>
			<td>STATUS</td>
			<td>ADDRESSID</td>
			<td>CITY</td>
			<td>STATE</td>
			<td>COUNTRY</td>
			<td>PINCODE</td>
			<td>CODE</td>
			<td>NUMBER</td>
			<td>COURSEID</td>
			<td>COURSENAME</td>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><img src="data:image/jpg;base64,${images[0]}" width="24"
					height="30" /></td>
				<td>${employee.name}</td>
				<td>${employee.task}</td>
				<td>${employee.assignedby}</td>
				<td>${employee.status}</td>
				<td>${employee.address.city}</td>
				<td>${employee.address.state}</td>
				<td>${employee.address.country}</td>
				<td>${employee.address.pincode}</td>
				<td>${employee.contactList[0].number}</td>
				<td>${employee.course[0].courseName}</td>
				<td><a href="<c:url value='/edit${employee.id}' />">${employee.id}
						edit</a></td>
				<td><a href="<c:url value='/delete${employee.id}' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="<c:url value='/new' />">Add New Employee</a>

</body>
</html>