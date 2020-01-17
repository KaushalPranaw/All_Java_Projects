<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h3 align="center"> ${requestScope.status}
</h3>
<form method="post" >
	<table>
		<tr>
			<td>Email : </td>
			<td><input type="text" name="email">
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="password" name="pass">
		</tr>
		<tr>
			
			<td colspan="2" align="center"><input type="submit" value="login">
		</tr>
	</table>
</form>
</body>
</html>