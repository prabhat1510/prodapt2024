<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company App Form</title>
</head>
<body>
	<h1>Welcome To Company App</h1>
	<form action="/company/createcompany" method="post">
		<label for="name">Company Name:</label>
		<input type="text" id="name" name="name"><br>
		<label for="city">City:</label> 
		<input type="text" id="city" name="city"><br>
		<input type="submit" value="Add Company">
	</form>
		

</body>
</html>