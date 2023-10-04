<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Animal</title>
</head>
<body>


	<form action="updateAnimal" method="post">
		New Animal Name: <input type="text" name="animalName" size="25" />
		New Weight: <input type="text" name="weight" size="25" /> 
		New Length: <input type="text" name="length" size="25" />g
		Enter the current animal name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>

</body>
</html>