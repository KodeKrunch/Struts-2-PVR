<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Theater</title>
</head>
<style>

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
	<form action="${pageContext.request.contextPath}/admin/selecttheaterformovie" method="post">
			<table id="table_id">
				<tr><td><s:select name="cityId" label="Select City" list="listOfCities"/>
				</td></tr>
				<td><a href="${pageContext.request.contextPath}/admin/addcity"> If Not In the List, Add City </a> </td>
				
			</table>
	</form>		
	
</body>
</html>