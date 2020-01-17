<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="search.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<style>
.error {
	color: #ff0000;
}

</style>
</head>
<body>
	<form:form modelAttribute="employee" method="post">
		<table align="center">
			<tr>
				<td>Name</td>
				<td><form:input path="employeeName" /></td>
				<td><form:errors path="employeeName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Task</td>
				<td><form:input path="employeeTask" /></td>
				<td><form:errors path="employeeTask" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Assigned By</td>
				<td><form:input path="assignedBy" /></td>
				<td><form:errors path="assignedBy" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><form:select path="status">
						<form:option value="pending" />
						<form:option value="completed" />
					</form:select></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Employee"></td>
			</tr>

		</table>

	</form:form>
</body>
</html>