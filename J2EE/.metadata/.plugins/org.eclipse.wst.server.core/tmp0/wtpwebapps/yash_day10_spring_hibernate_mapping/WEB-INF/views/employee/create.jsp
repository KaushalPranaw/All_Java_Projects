<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>pin code</td>
				<td><form:input path="address.pincode" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="address.city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><form:input path="address.state" /></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:input path="address.country" /></td>
			</tr>
			 <tr>
				<td>Contact 1</td>
				<td><form:input path="contactList[0].number" /></td>
			</tr>
			<tr>
				<td>Contact 2</td>
				<td><form:input path="contactList[1].number" /></td>
			</tr>
			<tr>
				<td>Course 1</td>
				<td><form:input path="courseList[0].courseName" /></td>
			</tr>
			<tr>
				<td>Course 2</td>
				<td><form:input path="courseList[1].courseName" /></td>
			</tr>
			<tr>
			<td>
					<button>Register</button>
				</td>
			</tr>	
		</table>
		
	</form:form>
</body>
</html>