<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
</head>
<body>
<h3 align="center">${sessionScope.cust.status}</h3>
	<form action="register_after.jsp">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter User Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Enter User Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Enter Reg Amount</td>
				<td><input type="number" name="amount" /></td>
			</tr>
			<tr>
				<td>Enter Role</td>
				<td><input type="text" name="role" /></td>
			</tr>
			<tr>
				<td>Enter Reg Date</td>
				<td><input type="date" name="date" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register Me" /></td>
			</tr>
		</table>
	</form>
</body>
</html>