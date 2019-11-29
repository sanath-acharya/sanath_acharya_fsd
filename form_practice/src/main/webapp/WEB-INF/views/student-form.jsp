<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
First name: <form:input path="firstName"/>
	<br>
	Last name: <form:input path="lastname"/>
	Country:
	<form:select path="contry">
		<form:options items="${student.countryOption }"/>
		
			</form:select>
	<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>

		Operating Systems:
		
		Linux <form:checkbox path="operatingSystem" value="Linux" />
		Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystem" value="MS Window" />

		<br><br>
	
		<input type="submit" value="Submit" />
	
</form:form>


</body>
</html>