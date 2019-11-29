<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="processForm" method="post" modelAttribute="employee">
First name:<form:input path="firstname" /> 
last name:<form:input path="lastname" /> 
<input type="submit"/>
</form:form>
</body>
</html>