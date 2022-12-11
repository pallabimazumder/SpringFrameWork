<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="regform" method="post">
	<label for="userid">Id:</label>
		<input type="text" name="userid">
	
		<label for="useremail">Email:</label>
		<input type="email" name="useremail">
		
		<label for="username">UserName:</label>
		<input type="text" name="username">
		
		<label for="userpwd">Password:</label>
		<input type="password" name="userpwd">
		
		<input type="submit" value="Register">
	</form>
</center>
</body>
</html>