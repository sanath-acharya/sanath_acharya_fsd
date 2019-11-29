<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
   

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the homepage sanath!</p>
        
       <form action="/formController" method="get">
        <label> first name</label>
     <input name="firstName" type="text"
value="Ravi"/>
        <br>
        
        
        <label> password :</label>
      <input name="pass" type="password value="pasword"/>
        
        <input type="submit" value="save" class="save"/>
        
       <form>
    </body>
</html>
