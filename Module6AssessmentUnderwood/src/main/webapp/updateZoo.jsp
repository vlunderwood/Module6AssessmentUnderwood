<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Zoo</title>
</head>
<body>


	<form action="updateZoo" method="post">
		New Name: <input type="text" name="newName" size="25" />
		New Location: <input type="text" name="location" size="25" /> 
		Enter the current Zoo name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</html>