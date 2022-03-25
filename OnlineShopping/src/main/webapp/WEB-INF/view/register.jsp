<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h3>Register User</h3>
	<form:form method="post" action="saveuser" modelAttribute="users">
	<form:label path="username">Username</form:label>
	<form:input path="username"/><br/>
	<form:label path="email">Email</form:label>
	<form:input path="email"/><br/>
	<form:label path="password">Password</form:label>
	<form:input path="password"/><br/>
	<form:label path="shipping_address">Shipping Address</form:label>
	<form:input path="shipping_address"/><br/>
	<form:label path="billing_address">Billing Address</form:label>
	<form:input path="billing_address"/><br/>
	<input type="submit" value="save"/>
	</form:form>
</body>
</html>