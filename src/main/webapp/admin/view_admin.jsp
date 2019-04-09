<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PVR Profile</title>
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

</style>
<body>
<%@ include file = "navigator.jsp" %> <br><br>

		<s:iterator var="admin_data" value="adminData">

	<table id= "table_id">
			<tr>
				<td> Name</td> <td> <s:property value="%{#admin_data.name}"/> </td>
			</tr>
			
			<tr>
				<td> Email </td> <td> <s:property value="%{#admin_data.email}"/> </td>
			</tr>
			
			<tr>
				<td> Password</td> <td> <s:property value="%{#admin_data.password}"/> </td>
			</tr>
			
			<tr>
				<td> Mobile </td> <td> <s:property value="%{#admin_data.mobile}"/> </td>
			</tr>
	</table>
		
 	</s:iterator>

	<form action="gotohome" method="get">
			<input type="submit" value="Go Back"/>
	</form>
</body>
</html>