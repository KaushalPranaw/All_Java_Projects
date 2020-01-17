<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Form</title>

<style>
.error {
	color: red;
}
</style>

</head>

<body>

	<h2>Registration Form</h2>

	<form:form method="POST" modelAttribute="employee">
		<form:input type="hidden" path="id" id="id" />
		<table>
			<tr>
				<td><label for="name">Name: </label></td>
				<td><form:input path="name" id="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="task">task: </label></td>
				<td><form:input path="task" id="task" /></td>
				<td><form:errors path="task" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="assignedby">assignedby: </label></td>
				<td><form:input path="assignedby" id="assignedby" /></td>
				<td><form:errors path="assignedby" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="status">status: </label></td>
				<td><form:input path="status" id="status" /></td>
				<td><form:errors path="status" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="employee.address.addressId">addressId: </label></td>
				<td><form:input path="address.addressId" id="addressId" /></td>

			</tr>

			<tr>
				<td><label for="employee.address.city">city: </label></td>
				<td><form:input path="address.city" id="city" /></td>

			</tr>

			<tr>
				<td><label for="employee.address.state">state: </label></td>
				<td><form:input path="address.state" id="state" /></td>

			</tr>

			<tr>
				<td><label for="employee.address.country">country: </label></td>
				<td><form:input path="address.country" id="country" /></td>

			</tr>

			<tr>
				<td><label for="employee.address.pincode">pincode: </label></td>
				<td><form:input path="address.pincode" id="pincode" /></td>

			</tr>

			<tr>
				<td><label for="employee.contactList[0].code">code: </label></td>
				<td><form:input path="contactList[0].code" id="code"
						readonly="true" /></td>

			</tr>

			<tr>
				<td><label for="employee.contactList[0].number">number:
				</label></td>
				<td><form:input path="contactList[0].number" id="number" /></td>

			</tr>

			<tr>
				<td><label for="employee.course[0].courseId">courseId:
				</label></td>
				<td><form:input path="course[0].courseId" id="courseId" /></td>

			</tr>

			<tr>
				<td><label for="employee.course[0].courseName">courseName:
				</label></td>
				<td><form:input path="course[0].courseName" id="courseName" /></td>
				<td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="edit" />
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/home' />">List of All Employees</a>
</body>
</html>