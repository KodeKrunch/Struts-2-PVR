<%@page import="com.zen.beans.user.UserData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View User</title>
</head>
<style>

table, th, td {
  border: 1px solid black;
}

li a {
  display: block;  
  color: white;
  text-align: center;
  padding: 25px 17px;
  text-decoration: none;
 }
 
 ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
 }
 
 .navigate{
 text-align : right;
 }
 
 .username{
text-align : left; 
 }

 ul#menu li {
  /* float: right; */
  display:inline;
 } 
 
 h1{
 color : white;
 }

</style>
<body>
	<ul id="menu">
	  <li style="float:right;"><a href="logout"><b>Sign Out</b></a></li>
	  <li style="float:right;"><a class="active" href="profile"><b>View Profile</b></a></li>
	  <li style="float:right;"><a class="active" href="editprofile"><b>Edit Profile</b></a></li>
	  <li style="float:left;"> <h1> Hi... <% UserData object= (UserData) session.getAttribute("USER");
		  					 		out.print(object.getUserName());
		  				    %> 
		    </h1>
	  </li>
	</ul>
</body>
</html>