<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="UTF-8"> -->
<title>Form Data</title>

<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.min.css">
</head>
<body>
	<div id="fb-root"></div>


	<form class="form-container" name="regForm" action="username"
		onsubmit="return validatePassword()" method="post">

		<div class="form-title">
			<h1>Register</h1>
			<h4>All fields required</h4>
		</div>
		<div class="form-title">First Name</div>
		<input class="form-field" type="text" placeholder="John"
			name="firstName" required /><br />
		<div class="form-title">Last Name</div>
		<input class="form-field" type="text" placeholder="Doe"
			name="lastName" required /><br />
		<div class="form-title">Email</div>
		<input class="form-field" type="email" placeholder="name@example.com"
			name="email" required /><br />
		<div class="form-title">Phone Number</div>
		<input class="form-field" type="tel" placeholder="Phone Number"
			name="phoneNum" required /><br /> <input type="radio" name="phone"
			value="home"> Home <input type="radio" name="phone"
			value="cell"> Cell <input type="radio" name="phone"
			value="work"> Work<br> <br> Gender: 
			<select id="pet-select">
			<option value="">--Please choose an option--</option>
			<option value="male">Man</option>
			<option value="female">Woman</option>
			<option value="na">Prefer not to answer</option>
		</select><br>
		<div class="form-title">Username</div>
		<input class="form-field" type="text" placeholder="Enter a username"
			name="Username" required /><br /> <label class="form-title">Password</label>
		<br>
		<p>* Must contain at least 8 characters and include at least 1
			uppercase letter, 1 lowercase letter, and 1 number.</p>
		<input class="form-field" type="PASSWORD"
			placeholder="Enter a password" name="password" id="userPassword"><br>
		<input type="radio" onclick="showPassword()">Show Password
		<div class="submit-container">
			<input class="submit-button" type="submit" value="Submit" />
		</div>
	</form>

	<table border="1">
		<c:forEach var="user" items="${users}">
			<tr>
				
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.email}</td>
				<td>${user.phoneNum}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
			</tr>

		</c:forEach>
	</table>

	<script src="js/script.js"></script>
	<div id="fb-root"></div>

</body>
</html>