<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Animal</title>
</head>
<body>
	<form action="addAnimal" method="post">
		Zoo Name:<input
			type="text" name="zooName" size="25"/> 
		
		Name: <input
			type="text" name="animalName" size="25"/> 
		
		Weight: <input
			type="text" name="weight" size="25"/> 
		
		Length: <input
			type="text" name="length" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>