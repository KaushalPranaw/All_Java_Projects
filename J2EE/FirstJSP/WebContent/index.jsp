<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome in JSP Page</h2>
<% out.print("pranaw"); %>
<%= " kaushal" %>
<%= "Current time : "+java.util.Calendar.getInstance().getTime() %>
<br>
 <%! int a=10;
 	int cube(int n)
 	{
 		return n*n*n;
 	}
 	%>
 <%= cube(10) %>
</body>
</html>