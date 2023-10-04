<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animals</title>
</head>
<body>
	List of all zoos and animals:
	<table>
		<c:forEach items="${requestScope.allZoos}" var="currentzoo">
			<tr>
				<td>${currentzoo.name}|</td>
				<td>${currentzoo.location}</td>

			</tr>
			<c:forEach items="${currentzoo.animals}" var="currentanimal">
				<tr>
					<td>${currentanimal.animalName}|</td>
					<td>${currentanimal.weight}|</td>
					<td>${currentanimal.length}</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>