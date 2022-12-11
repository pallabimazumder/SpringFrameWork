<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style>
	li{
		list-style-type:none;
	}

</style>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
<center>
	<p>Record Insereted with the following details</p>
	<br/>
	First Name: ${reservation.firstName }<br>
	Last Name: ${reservation.lastName}<br>
	Gender: ${reservation.gender}<br>
	
	<ul>
		<c:forEach items="${reservation.food}" var="meal">
			<li>${meal }</li>
		</c:forEach>
	</ul>
	
	Leaving From: ${reservation.cityfrom }<br>
	Going To: ${reservation.cityto }

</center>
</body>
</html>