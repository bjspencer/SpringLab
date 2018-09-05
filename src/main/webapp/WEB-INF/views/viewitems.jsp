<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>View Items</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet"
	href="https://bootswatch.com/4/flatly/bootstrap.min.css">
</head>
<body>
	<h1>Items</h1>

	<table>

		<tr>
			<th class="text-left">Item</th>
			<th class="text-left">Description</th>
			<th class="text-left">Price</th>
		</tr>
		<c:forEach var="items" items="${items}">
			<tr>
				<td>${items.name}</td>
				<td>${items.description}</td>
				<td>${items.price}</td>
				<td><a href="updateform?id=${items.name}">Edit</a></td>
				<td><a href="delete?id=${cust.customerID}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>