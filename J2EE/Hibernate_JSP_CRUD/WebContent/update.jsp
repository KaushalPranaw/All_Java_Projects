<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title> 
</head>

<body>
<% int id=Integer.parseInt(request.getParameter("id")); %>
<%= id %>
<jsp:setProperty property="id" name="cust"/>

${cust.custById.date}
<br>
 
	<form action="update_after.jsp">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Id</td>
				<td><input type="text" name="id" value="${cust.custById.custId}"  /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"value="${cust.custById.email}"  /></td>
			</tr>
			<tr>
				<td> Password</td>
				<td><input type="password" value="${cust.custById.password}" name="password" /></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="name" value="${cust.custById.name}" /></td>
			</tr>
			<tr>
				<td>Enter new  Reg Amount</td>
				<td><input type="number" value="${cust.custById.amount}" name="amount" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><input type="text" name="role" value="${cust.custById.role}"/></td>
			</tr>
			<tr>
				<td>Enter new Reg Date</td>
				<td><input type="date"  name="date" value="${cust.custById.date}"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form> 
</body>
</html>