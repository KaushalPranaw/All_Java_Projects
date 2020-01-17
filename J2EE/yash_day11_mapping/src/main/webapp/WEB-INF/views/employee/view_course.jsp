<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

	<table align="center" border="1">
		<tr>
			<th>ID</th>
			
			<th>Course Name</th>
			<!-- <th>Employee Name</th> -->
		</tr>
		<c:forEach var="course" items="${emp_course_list}">
			<tr>
				<td>${course.courseId}</td>
				<td>${course.courseName}</td>
				<%-- <td>${course.empSet}</td> --%>
			</tr>
		</c:forEach>
	</table>

</body>
</html>