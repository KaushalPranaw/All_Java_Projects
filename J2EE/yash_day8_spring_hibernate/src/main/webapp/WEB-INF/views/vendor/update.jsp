<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="vendor" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="id"/></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><form:input path="jDate" type="date" /></td>
			</tr>
			<tr>

				<td>
					<button>Add Vendor</button>
				</td>
			</tr>
		</table>
	</form:form>

</body>
</html>