<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>User Home Page</title>
	</head>
	<body>
		<h1>You are viewing a protected page after successfully logging in!</h1>
		<p>Welcome ${username}</p>
		<p>You live in ${userAddress}</p>
		<c:if test="${sessionScope.adminRole}">
			<h2>You are an admin!</h2>
		</c:if>
	</body>
</html>