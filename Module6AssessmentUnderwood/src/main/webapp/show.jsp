<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animals</title>
</head>
<body>
	List of all animals:
	<table>
		<c:forEach items="${requestScope.allAnimals}" var="currentanimal">
			<tr>
				<td>${currentanimal.animalName}|</td>
				<td>${currentanimal.weight}|</td>
				<td>${currentanimal.length}|</td>
				<td>${currentanimal.zoo.name}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>


</body>
</html>