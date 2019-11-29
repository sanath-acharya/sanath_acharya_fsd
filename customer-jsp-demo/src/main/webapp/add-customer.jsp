<%@page import="java.util.List"%>
<%@page import="comm.example.spring_dependency_injection.beans.Customer"%>
<%@page import="comm.example.spring_dependency_injection.beans.DAO.*" %>
<html>
<head>
<title>Main Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<%
		List<String> list = (List<String>) request.getAttribute("ERROR");
		if (list != null) {
			for (String str : list) {
				out.println("<font color='red'>" + str + "<br/>");
			}
		}
		out.println("</font>");
	%>
	<h2>Index Page</h2>
	<form action="controller.do" method="post">
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
