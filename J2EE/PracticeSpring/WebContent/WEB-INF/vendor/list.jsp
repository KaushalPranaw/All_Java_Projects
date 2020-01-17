<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">List Of All Vendor</h2>
	 <table align="center" border="1" background="yellow">
	 	<c:forEach var="v" items="${requestScope.vendor_list}">
	 		<tr>
	 			<td>${v.name}</td>
	 			<td>${v.city}</td>
	 			 
	 			<td><a href="<spring:url value='/vendor/update?vid=${v.id}'/>">UPDATE</a> </td>
	 			<td><a href="<spring:url value='/vendor/delete?vid=${v.id}'/>">DELETE</a> </td>
	 		</tr>
	 	</c:forEach>
	 </table>
	 <h4>
	 	 <a href="<spring:url value='/vendor/add'/>">ADD</a> 
	 	 </h4>
	 			<h4><a href="<spring:url value='/vendor/logout'/>">LOGOUT</a> 
	 		
	 </h4>
</body>
</html>