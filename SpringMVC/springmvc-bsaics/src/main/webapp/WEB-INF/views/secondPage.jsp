<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Spring MVC - Storing String in Session Example</title>
    </head>
    <body>
        <h2>Spring MVC - Storing String in Session Example</h2>
	
	    <b>Print using EL:</b><br>
		<b>Welcome ${sessionScope.empFullName} !!!!!</b><br><br>
		
		<b>Print using JSTL's c:out:</b><br>
		<b> <c:out value ="${sessionScope.empFullName}" /> </b>
		
		 
		
    </body>
</html>
