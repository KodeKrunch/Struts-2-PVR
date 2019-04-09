<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add City</title>
</head>
<style>

table, th, td {
  border: 1px solid black;
}

h1{
text-align: center;
}
a{
 text-color : #945FB4;
}

</style>
<body>
<%@ include file = "navigator.jsp" %> 

<h1>Enter Details</h1>
	<form action="${pageContext.request.contextPath}/admin/addsuccessfully" method="post">
		<table>
			<s:textfield key = "City Name" name = "cityName"/><br>
			<s:textfield key = "State" name = "stateName" /><br>
			<s:textfield key = "Country" name = "countryName"/><br>
		</table>	
			<input type="submit" value="Add"/>
	</form>
</body>
</html>