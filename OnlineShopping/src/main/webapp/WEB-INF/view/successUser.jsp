<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<%
User user=(User)request.getAttribute("user");
out.println("<h2>");
out.println(user.getUsername());
out.println("registered Successfully");
out.println("</h2>");
%>
</body>
</html>