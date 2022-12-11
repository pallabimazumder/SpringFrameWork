<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>About us page</h2>
<% 
	String serverMsg = (String)request.getAttribute("cname");
%>
<%= serverMsg %>
${cname};

empid {$eid};
empname {$ename};
</body>
</html>