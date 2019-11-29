<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    <%@page import="com.example.model.*"%>
<%@page import="com.example.DAO1.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> this is custoer page</h1>
<%

List<String>list=(List<String>) request.getAttribute("ERROR");
if(list!=null){
	for(String str:list){
		out.println("<font color='red'>"+str+"<br/>	");
		
	}out.println("</font>");
	
}


%>
<h2>index page</h2>
<form action="Controller.do" method="post">
		First Name: <input type="text" name="fName"><br /> Last Name:
		<input type="text" name="lName"><br /> Address:
		<textarea name="address"></textarea><br /> 
		CustomerType: <select name="custType">
			<option value="Unknown">Select</option>
			<option value="Regular">Regular</option>
			<option value="Premium">Premium</option>
		</select><br /> <input type="submit"><input type="reset">
	</form>
</body>
</html>