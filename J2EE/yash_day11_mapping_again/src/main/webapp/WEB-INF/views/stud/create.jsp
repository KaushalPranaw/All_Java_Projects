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


	<form:form modelAttribute="student" >
		<table align="center">
		 
			<tr>
				<td>Name</td>
				<td><form:input path="name"/> </td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary"/> </td>
			</tr>
			<tr>
				 
				<td colspan="2" align="center"><form:button>Register</form:button> </td>
			</tr>
		</table>

	</form:form>
</body>
</html>