<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<form action="registrationSuccessful" style="border:1px solid #ccc" method="post">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	<table>
	
		<tr>
			<td><label for="name"><b>Name</b></label></td>
		    <td><input type="text" placeholder="Enter Name" name="userName" required><br></td>
    	</tr>
    	<tr>
		    <td><label for="email"><b>Email</b></label></td>
		    <td><input type="text" placeholder="Enter Email" name="userEmail" required><br></td>
		</tr>
    	<tr>
    		<td><label for="psw"><b>Password</b></label></td>
    		<td><input type="password" placeholder="Enter Password" name="userPassword" required><br></td>
		</tr>
    	<tr>
   			<td> <label for="mob"><b>Mobile</b></label></td>
   			 <td><input type="text" placeholder="Enter Mobile" name="userMobile" required><br></td>
   		</tr>
    	<tr>
    			<td> <label for="mob"><b>Gender</b></label></td>
			   <td><select name="userGender">
			   	<option value="male">Male</option>
			   	<option value="female">Female</option>
			   </select><br></td>
  		 </tr>
    
   </table>
   
    <div class="clearfix">
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>