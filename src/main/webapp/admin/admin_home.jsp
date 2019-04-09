<%@page import="com.zen.beans.admin.Admin"%>
<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Account</title>
</head>
<style>
h1{
text-align : center;
}
</style>
<body>
	<%@ include file = "navigator.jsp" %> <br>

	<h1>Hello... <% HttpSession session2= ServletActionContext.getRequest().getSession();
					Admin admin= (Admin)session2.getAttribute("ADMIN");
					out.print(admin.getName());
					%></h1>

	
</body>
</html>