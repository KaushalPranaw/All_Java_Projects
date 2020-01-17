<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="vendor">
		<table>
			<tr>
				<td>Enter vendor email</td>
				<td><form:input path="email"/> </td>
			</tr>
			<tr>
				<td>Enter vendor pass</td>
				<td><form:input path="password"/> </td>
			</tr>
			<tr>
				<td>Enter vendor name</td>
				<td><form:input path="name"/> </td>
			</tr>
			<tr>
				<td>Enter vendor city</td>
				<td><form:input path="city"/> </td>
			</tr>
			 
			<tr>
				<td>Enter vendor role</td>
				<td><form:input path="role"/> </td>
			</tr>
			<tr>				 
				<td colspan="2" ><input type="submit" value="register me"/> </td>
			</tr>
		</table>
		
	</form:form>
</body>
</html>