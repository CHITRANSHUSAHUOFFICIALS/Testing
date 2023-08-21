<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body>
	<h2>Contact info</h2>
	First Name : ${contact.firstName}<br/>
	Last Name : ${contact.lastName}<br/>
	Email : ${contact.email}<br/>
	Mobile :${contact.firstName}<br/>	
	Source : ${contact.source}<br/>
	
	<form action="convertLead" method ="post">
			<input type = "hidden" name = "id" value="${contact.id}"/>
			<input type = "submit" value = "Convert"/>
	</form>
</body>
</html>