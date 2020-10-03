<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>  
			.error{color:red}  
		</style>  
    </head>
    <body>
    <h2>Spring MVC - Validation Example</h2>
	<form:form action="validationThirdPageUrl" modelAttribute="emp">  
	
		Username(*): <form:input path="name"/> 
		<form:errors path="name" cssClass="error"/><br><br>
		
		Age(*): <form:input path="age"/> 
		<form:errors path="age" cssClass="error"/><br><br>
		
		Address(*): <form:input path="address"/> 
		<form:errors path="address" cssClass="error"/><br><br>
		 
		Password(*): <form:password path="pass"/>    
		<form:errors path="pass" cssClass="error"/><br><br> 
		 
		<input type="submit" value="submit">  
		
	</form:form>  
    </body>
</html>
