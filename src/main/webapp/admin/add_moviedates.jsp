<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
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
			<table id="table_id">
				<tr>
					<td>
						<label>Select City :</label>
					</td>
					<td>	
						<select id="citySelect" name="cityId"  onchange="getTheater()">
							<s:iterator var="city" value="listOfCities">
								<option> <s:property value="%{#city.cityName}"/> </option>
							</s:iterator>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Select Theater :</label>
					</td>
					<td>	
						<select id="theaterSelect" name="theaterId">
							<s:iterator var="theater" value="listOfTheaters">
								<option> <s:property value="%{#theater.theaterName}"/> </option>
							</s:iterator>
					</td>
				</tr>
			</table>

<script>
var timeout;
var request;

function getTheater()
{
	 var cityId= document.getElementById("citySelect");
	 
    if(!request)
    {
     
        $.ajax({
    		url : gettheater,
    		type : "get",
    		data: {
    		cityId : cityId,
    		},
    		success : function(data) {
    		console.log(data);
    			
    		}
    		});
    }
}
</script>

</body>
</html>