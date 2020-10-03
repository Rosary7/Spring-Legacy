<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC - Test @ControllerAdvice and @ExceptionHandler</title>
    </head>
    <body>
     <h2>Spring MVC - Test @ControllerAdvice and @ExceptionHandler</h2>
     <h4>
     This will throw two exceptions<br>
		1. When the firstName is less than 3 ,it will throw IOException<br>
		2. When the lastName is less than 3 it, will throw CustomException<br>
		Both the exceptions will be handled globally by our GlobalException class.
     </h4>
        <!--  For Spring 5 version : modelAttribute ="" , Spring 4 & less version:  commandName ="" -->
        <form:form action="exceptionThirdPageUrl" method="post" modelAttribute ="rb">   
			 <table>
			 <tr><td>First Name</td><td><form:input path="firstName"/> &nbsp; (greater than 3 chars)</td></tr>
			 <tr><td>Last Name</td><td><form:input path="lastName"/> &nbsp; (greater than 3 chars)</td></tr>
			 <tr><td>Email</td><td><form:input path="email"/></td></tr>
			 <tr><td>Profession</td><td><form:select path="profession" items="${professionList}"></form:select></td><td></td></tr>
			 <tr><td>Hobby</td><td><form:checkboxes items="${hobbyList}" path="hobby"/></td></tr>
			 <tr><td></td><td><input type="submit" value="Register"></td></tr>
			 </table>
		 </form:form>
    </body>
</html>
