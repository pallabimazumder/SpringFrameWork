<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ page import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>FeedBack Page</p>
<%
String name = (String)request.getAttribute("myname");
List<String> friendsname = (List<String>)request.getAttribute("friends");
for(String t:friendsname)
	out.println(t);
%>
<%=name %>

<p>I am ${myname}</p>
</body>
</html>