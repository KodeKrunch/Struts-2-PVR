<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit profile</title>
</head>
<style>

table, th, td {
  border: 1px solid black;
}

</style>
<body>
<%@ include file = "navigator.jsp" %> 
<s:iterator var="user_object" value="userObject">
	<form action="editsuccessful" method="post">
		<table>
			<s:textfield key = "Name" name = "userName" value="%{#user_object.userName}"/><br>
			<s:textfield key = "Email" name = "userEmail" value="%{#user_object.userEmail}" /><br>
			<s:textfield key = "Password" name = "userPassword"  value="%{#user_object.userPassword}"/><br>
			<s:textfield key = "Mobile" name = "userMobile" value="%{#user_object.userMobile}" /><br>
			 <s:radio label="Gender" name="userGender" list="#{'Male':'Male','Female':'Female'}"  />
		</table>	
			<input type="submit" value="Save"/>
	</form>
</s:iterator>
</body>
</html>