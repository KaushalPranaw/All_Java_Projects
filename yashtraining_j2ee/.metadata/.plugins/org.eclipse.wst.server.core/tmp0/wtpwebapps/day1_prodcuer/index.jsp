<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/day1_prodcuer/rest/service/formparam" method="post">
		<table align="center">
			<tr>
				<td>Id :</td>
				<td><input type="text" name="keyId"></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="keyName"></td>
			</tr>
			<tr>

				<td colspan="4"><button>submit</button></td>
			</tr>
		</table>
	</form>
</body>
</html>