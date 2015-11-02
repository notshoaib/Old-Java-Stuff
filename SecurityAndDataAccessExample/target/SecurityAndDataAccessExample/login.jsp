<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<h1>Login</h1>
		<p>
			This is the login page...
		</p>
		<form method="POST" action="j_security_check">
			<label>Username:<input type="text" name="j_username" /></label><br />
			<label>Password:<input type="password" name="j_password" /></label><br />
			<input type="submit" value="Login!">
		</form>
	</body>
</html>