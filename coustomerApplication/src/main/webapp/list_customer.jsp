<%@ page language="java"
 contentType="text/html; charset=ISO-8859-1"
 
    pageEncoding="ISO-8859-1"
    
       %>
      
  <%@page import="java.util.List" %>
 <%@page import="com.example.DAO1.*" %>
 <%@page import="com.example.model.*" %>
 

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">



</head>
<body>

	<h3>Customer Relationship Management</h3>
	<a href="add_customer.jsp"><button>Add Customer</button></a>
	
	
	<table class=table>
		<thead class="black white-text">
			<tr>
				<th scope="col">Customer ID</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Address</th>
				
			</tr>
			
		</thead>
		<tbody>
			
				<c:forEach var="customer" items="${LIST}">
				<tr>
					
					<td scope="row">${customer.id}</td>
					<td scope="row">${customer.fname}</td>
					<td scope="row">${customer.lname }</td>
					<td scope="row"> ${customer.address }</td>
					 </tr>
				</c:forEach>
				
			
		
		</tbody>
	</table>


<div>

<h1>hello this  is the main page</h1>

</div>

</body>
</html>