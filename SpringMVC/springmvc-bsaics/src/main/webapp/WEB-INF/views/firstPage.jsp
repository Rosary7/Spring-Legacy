<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC - Session Attribute Test</title>
    </head>
    <body>
    <h2>Spring MVC - Storing String in Session Example</h2>
	<form:form method="post" action="secondPageUrl">
 
		<table>
			<tr>
				<td>Employee Full Name</td>
				<td><input type="text" name="fullName"/></td>
			</tr>
 
			<tr>
				<td colspan="2"><input type="submit" value="Go To Welcome Page" /></td>
			</tr>
		</table>
 
	</form:form>
    </body>
</html>
