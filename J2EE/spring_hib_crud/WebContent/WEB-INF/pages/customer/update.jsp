<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="customer">
		<table>
		<tr>
			<td>ID : </td>
				<td><form:input path="id"/>
				</td>
				
				
			</tr>
			<tr>
			<td>Email : </td>
				<td><form:input path="email"/>
				</td>
				
				
			</tr>
			
			<tr>
				<td>Name : </td>
				<td><form:input path="name"/>
				</td>
				
			</tr>
			<tr>
				<td>Password : </td>
				<td><form:password path="password"/>
				</td>
				
			</tr>
			<tr>
				<td>Salary : </td>
				<td><form:input path="salary"/>
				</td>
				
			</tr>
			<tr>
				<td>Role : </td>
				<td><form:input path="role"/>
				</td>
				
			</tr>
			<tr>
				<td>date : </td>
				<td><form:input type="date" path="date1" />
				</td>
				
			</tr>
			<tr>
				 
				<td><input type="submit" value="register" />
				</td>
				
			</tr>
		</table>
	</form:form>
</body>
</html>