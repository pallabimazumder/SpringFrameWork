<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Entry form</title>
</head>
<body>
<center>
<f:form action="msgagain" modelAttribute="empobj">
	User Name : <f:input path="uname"/><br><br>
	Password : <f:input path="upass"/><br><br>
	<f:errors path="upass" cssClass="error"/>
	<input type="submit" value="Submit Here"/>
</f:form>
</center>
</body>
</html>