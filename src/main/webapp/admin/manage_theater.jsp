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

h4{
text-align : center;
}


#table_id{
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#table_id td, #table_id th {
  border: 1px solid #ddd;
  padding: 8px;
}
#table_id tr:nth-child(even){background-color: #f2f2f2;}
#table_id tr:hover {background-color: #ddd;}
#table_id th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}

a{
	color : #945FB4;
}
</style>
<body>
	<%@ include file = "navigator.jsp" %> <br>

	<h1>Hello... <% HttpSession session2= ServletActionContext.getRequest().getSession();
					Admin admin= (Admin)session2.getAttribute("ADMIN");
					out.print(admin.getName());
					%></h1>
	<br><br><br>
	
	<table id="table_id">
		
		<tr>
			<td><h4><a href="${pageContext.request.contextPath }/admin/addcity">ADD CITY</a></h4></td>
		</tr>
		
		<tr>
			<td><h4><a href="${pageContext.request.contextPath }/admin/addtheater">ADD THEATER</a></h4></td>
		</tr>
		
		<tr>
			<td><h4><a href="${pageContext.request.contextPath }/admin/selectcityformovie">ADD MOVIES</a></h4></td>
		</tr>
		
		<tr>
			<td><h4><a href="${pageContext.request.contextPath }/admin/addmoviedates">ADD MOVIE DATES</a></h4></td>
		</tr>
		
		<tr>
			<td><h4><a href="/admin/addtimings/">ADD MOVIE TIMINGS</a></h4></td>
		</tr>
		
		<tr>
			<td><h4><a href="/admin/addtimings/">. . .GO BACK. . .</a></h4></td>
		</tr>
		
	</table>
	
</body>
</html>