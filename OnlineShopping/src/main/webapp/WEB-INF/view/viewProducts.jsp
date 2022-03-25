<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.Product,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Products</title>
</head>
<body>
<%
	out.println("View Products available");
	List<Product> productlist=(List)request.getAttribute("productlist");
	out.println("<ul>");
	for(Product p: productlist)
	{
		out.println("<li>");
		out.println(p.getProduct_name());
		out.println("Rs. "+p.getPrice());
		out.println("</li>");
		
	}
	out.println("</ul>");
%>
</body>
</html>