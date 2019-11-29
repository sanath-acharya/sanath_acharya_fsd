<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">

First Name:<form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"/><br/>
Last Name:<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/><br/>
Free Passes:<form:input path="freePass"/>
<form:errors path="freePass" cssClass="error"/><br/>
Postal Code:<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/><br/>
			<input type="submit">
			
			
</form:form>
	
</body>
</html>