<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handle login form</title>
</head>
<body>
	<%!String name;
	String password;
	%>
	
	<%name = request.getParameter("username");
	password = request.getParameter("password");
	%>
	
	<h3>Your name is <%=name %> and password is <%=password %></h3>
</body>
</html>