<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
	  <form method="post" action="${pageContext.request.contextPath}/emp/updateCourse"<%--  modelAttribute="selectedList" --%>>
	  
	
		<input type="hidden" name="id" value="${id}"> 
		<c:forEach items="${course_list}" var="course">
			 <input type="checkbox"  value="${course.courseName}" name="selected">${course.courseName}
			 
		</c:forEach>
		<input type="submit" value="add Course">
	 
	 </form> 
		
</body>
</html>
