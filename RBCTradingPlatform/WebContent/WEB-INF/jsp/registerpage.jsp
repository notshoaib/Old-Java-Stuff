<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trading Platform Home</title>
<link href="resources/style/StyleSheet.css" rel="stylesheet"
	type="text/css" />
<link href="resources/style/FormStyleSheet.css" rel="stylesheet"
	type="text/css" />
<link href='http://fonts.googleapis.com/css?family=Droid+Sans'
	rel='stylesheet' type='text/css' />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<script>
	function showLogin() {
		document.getElementById("loginContainer").style.display = 'block';
	}
	function hideLogin() {
		document.getElementById("loginContainer").style.display = 'none';
	}
</script>


<div class="Banner">
	<img id="Logo" src="resources/images/logo.jpg" />
	<p class="CallUs">Call Us: 567-8309</p>
	<button onclick="showLogin()" class="Button">Login</button>
	<!-- 		<form action="registerpage.html"> -->
	<!-- 		     <input type="submit" value="Register" class="Button"> -->
	<!-- 		</form> -->
	<!-- 		<p class="CallUs">Login Failed</p> -->
</div>
</head>
<body>
	<!-- Page Contents -->

	<div class="MainContainer">
		<img class="CenterPicture" src="resources/images/main.jpg" />


		<div id="Opaque" class="Opacity">
			<h2>Registration</h2>
			<table id="registration"border="20">
				<tbody>
					<sf:form id="registrationform" modelAttribute="account"
						method="POST" action="CompleteRegistration">
						<tr>
							<td>
								<sf:label path="username" for="username">User Name:</sf:label>
							</td>
							<td>
								<sf:input path="username" name="username" id="username"/>
								<sf:errors path="username" cssClass="formError" />
							</td>
						</tr>
						<tr>
							<td>
								<sf:label path="password" for="password">Password:</sf:label>
							</td>
							<td>
								<sf:input path="password" type="password" name="password" id="password" />
								<sf:errors path="password" cssClass="formError" />
							</td>
								<c:if test="${not empty errorMessage}">
   									<c:out value="${errorMessage}"/>
								</c:if>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Register" /></td>
						</tr>
					</sf:form>
				</tbody>
			</table>
		</div>
		<div id="loginContainer">
			<sf:form id="login" action="Login" method="post">
				<fieldset>
					<p class="Title">LOGIN</p>
					<input type="text" name="username" placeholder="Username" required>
					<input type="password" name="password" placeholder="Password"
						required pattern=".{6,}"> <br> <input type="submit"
						class="Button" value="login">
					<button onclick="hideLogin()" class="Button">cancel</button>
				</fieldset>
			</sf:form>
		</div>

	</div>
	<div id="OnlineTrading">
		<a href="onlinetrading.html"><img class="CircleImage"
			src="resources/images/round-images1.png"></a>
		<p>
		<p class="Title">Online Trading</p>
		Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec
		vestibulum urna. Mauris condimentum consectetur magna, ut molestie
		lorem elementum eget. Praesent lectus dui, dictum consequat molestie
		quis, bibendum a risus.
		</p>
	</div>
	<div id="InvestmentProducts">
		<a href="investmentproducts.html"><img class="CircleImage"
			src="resources/images/round-images2.png"></a>
		<p>
		<p class="Title">Investment Products</p>
		Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec
		vestibulum urna. Mauris condimentum consectetur magna, ut molestie
		lorem elementum eget. Praesent lectus dui, dictum consequat molestie
		quis, bibendum a risus.
		</p>
	</div>
	<div id="OnlineBrokerage">
		<a href="onlinebrokerage.html"><img class="CircleImage"
			src="resources/images/round-images3.png"></a>
		<p>
		<p class="Title">Online Brokrage</p>
		Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec
		vestibulum urna. Mauris condimentum consectetur magna, ut molestie
		lorem elementum eget. Praesent lectus dui, dictum consequat molestie
		quis, bibendum a risus.
		</p>
	</div>
	<div id="TPServices">
		<a href="tpservices.html"><img class="CircleImage"
			src="resources/images/round-images4.png"></a>
		<p>
		<p class="Title">TP Services</p>
		Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec
		vestibulum urna. Mauris condimentum consectetur magna, ut molestie
		lorem elementum eget. Praesent lectus dui, dictum consequat molestie
		quis, bibendum a risus.
		</p>
	</div>
<script type="text/javascript">
$("#email").attr('required','');
$("#password").attr('required','');
</script>
</body>
</html>