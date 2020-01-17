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
<title>Insert title here</title>
</head>
<body>

	<c:choose>
		<c:when test="${check}">
			<form:form>
				<table border="1" align="center">
					<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>TASK</th>
						<th>ASSIGNED_BY</th>
						<th>STATUS</th>
						<th colspan="2">OPERATION</th>
					</tr>

					<tr>
						<td>${emp_list.employeeId}</td>
						<td>${emp_list.employeeName}</td>
						<td>${emp_list.employeeTask}</td>
						<td>${emp_list.assignedBy}</td>
						<td>${emp_list.status}</td>
						<td><a
							href='<spring:url value="/employee/edit?id=${emp_list.employeeId}"/>'>edit</a>
						</td>
						<td><a
							href='<spring:url value="/employee/delete?id=${emp_list.employeeId}"/>'>delete</a>
						</td>
					</tr>

				</table>

			</form:form>

		</c:when>
		<c:otherwise>
			<div align="center">
				result not found
			</div>
			
		</c:otherwise>
	</c:choose>
</body>
</html>