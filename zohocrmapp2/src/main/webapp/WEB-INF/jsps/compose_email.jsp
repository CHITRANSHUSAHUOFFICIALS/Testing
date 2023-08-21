<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>C0mpose Email</title>
</head>
<body>
	<h2>Compose Your mail here</h2>
	<form action="bhejoEmail" method = "post">
		<pre>
		To  <input type ="text" name ="to" value = "${email}" />
		sub <input type ="text" name = "sub"/>
		Body<textarea name="body" rows="10" cols="50">
		    </textarea> 
		    <input type = "submit" value ="send"/>
		</pre>
		${msg}
	</form>
</body>
</html>