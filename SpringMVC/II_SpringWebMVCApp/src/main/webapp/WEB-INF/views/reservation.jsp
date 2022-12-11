<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="tagform" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Spring Form -->
<h3>Reservation Row</h3>
<tagform:form action="submitForm" modelAttribute="reserv">
	First Name: <tagform:input path="firstName"/><br/>
	Last Name: <tagform:input path="lastName"/><br/>
	Gender: Male:<tagform:radiobutton path="gender" value="Male"/>
	Female:<tagform:radiobutton path="gender" value="Female"/><br><br>
	Meals:
	Breakfast: <tagform:checkbox path="food" value="Breakfast"/>
	Lunch: <tagform:checkbox path="food" value="Lunch"/>
	Dinner: <tagform:checkbox path="food" value="Dinner"/>
	Leaving From:
	<tagform:select path="cityfrom">
		<tagform:option value="Chennai"></tagform:option>
		<tagform:option value="Mumbai"></tagform:option>
		<tagform:option value="Delhi"></tagform:option>
		<tagform:option value="Kolkata"></tagform:option>
	</tagform:select>
	Going To:
	<tagform:select path="cityto">
		<tagform:option value="Chennai"></tagform:option>
		<tagform:option value="Mumbai"></tagform:option>
		<tagform:option value="Delhi"></tagform:option>
		<tagform:option value="Kolkata"></tagform:option>
	</tagform:select><br/><br/>
	
	<input type="submit" value="submit">
</tagform:form>
</body>
</html>