<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="styles/StyleSheet.css" rel="stylesheet" type="text/css" />
	<link href="styles/FormStyleSheet.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
Thank you for Registering <br>
your username is your ${requestScope.first}.${requestScope.last}

              <form action="/">
				<input type="submit" class="Button" value="Return">
			</form>
</body>
</html>