<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
 <spring:message code=""/>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC - Test @ControllerAdvice and @ExceptionHandler</title>
    </head>
    <body>
    <h2> <spring:message code="app.lang.title"/> </h2>
    
	<!-- for selecting language -->
         <div>
            <button type="button" id="MenuButton">
               <spring:message code="app.lang.button"/> 
             </button>
             <br><br>
              <hr>
              
             <div> <spring:message code="app.lang.select"/>  </div>
             <br>
            
            <div class="menu">
               <a  href="?lang=en"><spring:message code="app.lang.english"/></a>  <br><br>
               <a  href="?lang=tm"><spring:message code="app.lang.tamil"/></a> <br><br>
               <a  href="?lang=cn"><spring:message code="app.lang.chinese"/></a>
            </div>
         </div>
   
    </body>
</html>
