<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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