<%@page import="comm.example.spring_dependency_injection.beans.CustomerDAOImpl"%>
<%@page import="comm.example.spring_dependency_injection.beans.CustomerDAO"%>
<%@page import="comm.example.spring_dependency_injection.beans.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<h3>Customer Relationship Management</h3>
	<a href="add-customer.jsp"><button>Add Customer</button></a>
	<%
		CustomerDAO dao = new CustomerDAOImpl();
		List<Customer> list = dao.getAllCustomers();	
	%>
	<table class="table">
		<thead class="black white-text">
			<tr>
				<th scope="col">Customer ID</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Address</th>
				<th scope="col">Customer Type</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<c:forEach var="customer" items="${list}">
					<td scope="row">${customer.id}</td>
					<td><c:out value="${customer.fName}"/></td>
					<td><c:out value="${customer.lName}"/></td>
					<td><c:out value="${customer.address}"/></td>
					<td><c:out value="${customer.customerType}"/></td>
				</c:forEach>
			</tr>
		</tbody>
	</table>
</body>
</html>