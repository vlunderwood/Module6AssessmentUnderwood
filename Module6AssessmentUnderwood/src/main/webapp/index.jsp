<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animal Data</title>
</head>
<body>
	<h1>Animal Data</h1>
	<form action="showAnimal" method="get">
		<input type="submit" value="Show Animals" />
	</form>
	<a href="update.jsp">Update Animals</a>
	<a href="delete.jsp">Delete Animals</a>
	<a href="add.jsp">Add Animals</a>
	<form action="showZoo" method="get">
		<input type="submit" value="Show Zoos" />
	</form>
	<a href="updateZoo.jsp">Update Zoo</a>
	<a href="deleteZoo.jsp">Delete Zoo</a>
	<a href="addZoo.jsp">Add Zoo</a>
</body>
</html>