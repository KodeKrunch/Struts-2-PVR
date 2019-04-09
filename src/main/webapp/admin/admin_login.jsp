<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="/resources/imgs/home.png" type="image/gif" sizes="20x20">
<title>Admin</title>
</head>

<style>
body {
font-family: Arial, Helvetica, sans-serif;
}
/* Full-width input fields */
input[type=text], input[type=password] {
	font-size:20px;
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
/* Set a style for all buttons */
button {
	font-size:15px;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
}
button:hover {
    opacity: 0.8;
}
/* Extra styles for the cancel button */
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}
/* Center the image and position the close button */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}
img.avatar {
    width: 18%;
    border-radius: 50%;
}
.container {
    padding: 16px;
}
span.psw {
    float: right;
    padding-top: 16px;
}
/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
   background-color: rgb(0,0,0);  /* Fallback color */
   background-color: rgba(0,0,0,0.4);  /* Black w/ opacity */ 
    padding-top: 60px;
}
/* Modal Content/Box */
.modal-content {
    background-color: #fefefe;
    margin: 5% auto 1% auto; /* 5% from the top, 5% from the bottom and centered */
   /* border: 1px solid #888; */
    width: 80%; /* Could be more or less, depending on screen size */
}
/* The Close Button (x) */
.close {
    position: absolute;
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
}
.close:hover,
.close:focus {
    color: red;
    cursor: pointer;
}
/* Add Zoom Animation */
.animate {
    -webkit-animation: animatezoom 0.6s;
    animation: animatezoom 0.6s
}
@-webkit-keyframes animatezoom {
    from {-webkit-transform: scale(0)} 
    to {-webkit-transform: scale(1)}
}
    
@keyframes animatezoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
}
/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}

</style>

<Body>
	<center>
		<h3>Admin Login</h3>
	</center>

	
    <div class="container">
    <form action="${pageContext.request.contextPath}/admin/login" method="post">
    
      <label for="uname"><b>E-mail</b></label>
      <input type="text" name="userEmail" />
      <label for="psw"><b>Password</b></label>
      <input type="password" name="userPassword" />
      
      <center>
     	 <button type="submit"><b>Login</button>
      </center>
     </form>
    </div>
 

</Body>
</html>