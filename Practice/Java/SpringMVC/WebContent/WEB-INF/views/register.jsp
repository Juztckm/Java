<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <spring:url value="/WEB-INF/resource/css/app.css" var="css"/>
<link rel="stylesheet" type="text/css"href="${css}"/> --%>
</head>
<body>
	Hello
	<form:form action="registeruser" method="GET" modelAttribute="userBean">
	<form:errors path="*"/><br/>
First name:<br />
		<form:input path="firstname" /><form:errors path="firstname"></form:errors>
		<br />
Last name :<br />
		<form:input path="lastname" />
		<br />
Email :<br />
		<form:input path="email" />
		<br />
Password :<br />
		<form:input path="passwd" />
		<br />
Age :<br />
		<form:input path="age" />
		<br />
<%-- Gender :<br />
		<form:radiobuttons path="gender" items="${gender}" />
		<br /> --%>
<!-- Date Of Joining:<br>
		<input type="date" name="doj">
		<br> -->
<%-- Designation :<br>
		<form:select path="desg" items="${desg}" multiple="false" />
		<br>
City :<br />
		<form:select path="city" items="${city }" multiple="false" />
		<br />
Technologies Learned :<br />
		<form:checkboxes items="${tech }" path="tech" />
		<br>
Area :<br />
		<form:select path="area" items="${area}" multiple="false"></form:select> --%>
		<br>
		<input type="submit" value="Submit">
		<%-- <form:radiobuttons path="gender" items="${gender} }"/>
	<form:select path="city" items="${city}" multiple="false"></form:select> --%>
	</form:form>
</body>
</html>