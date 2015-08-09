<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<!-- Meta Information -->
<title>Trading Platform Home</title>
<link href="resources/style/StyleSheet.css" rel="stylesheet"
	type="text/css" />
<link href="resources/style/lity.css" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Droid+Sans'
	rel='stylesheet' type='text/css' />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="resources/js/lity.min.js"></script>
</head>
<body>
<div class="Banner">
	<img id="Logo" src="resources/images/logo.jpg" />
	<p class="CallUs">Call Us: 567-8309</p>
	<c:if test="${empty userLogged}">
		<form action='#' onsubmit="lightbox('#inline');">
		<input type="submit" value="Login" class="Button">
		</form>

		<form action="#" onsubmit="lightbox('#inline2')">
		<input type="submit" value="Register" class="Button">
		</form>
		<c:if test="${not empty errorMessage}">
			<c:out value="${errorMessage}"/>			
		</c:if>
	</c:if>
</div>
<c:choose>
	<c:when test="${not empty userLogged}">
		<jsp:include page="ShareholderHeader.jsp"></jsp:include>
	</c:when>
	<c:otherwise>
		<!-- Page Contents -->
	
		<div class="MainContainer">
	<!-- 		<img class="CenterPicture" src="resources/images/main.jpg" /> -->
			<div class="CenterPicture" data-vide-bg="mp4: /Video/nt-3.3.mp4, webm: /Video/nt-3.3.webm, ogv: /Video/nt-3.3.ogv" data-vide-options="posterType: none, loop: true, muted: true, position: 50% 100%">
		  		<div style="position: absolute; z-index: -1; top: 0px; left: 0px; bottom: 0px; right: 0px; overflow: hidden; background-size: cover; background-repeat: no-repeat; background-position: 50% 100%;">
		    		<video loop="" autoplay="autoplay" style="visibility: visible; margin: auto;  z-index: -1; top: 100%; left: 50%; transform: translate(-50%, -100%); width: 1442px; height: auto;">
		     			<source src="resources/media/nt-3.mp4" type="video/mp4">
		      			<source src="resources/media/nt-3.webm" type="video/webm">
		      			<source src="resources/media/nt-3.ogv" type="video/ogv">
		    		</video>
		 		</div>
			</div>
			<div id="Opaque" class="Opacity">
			<c:choose>
				<c:when test="${not empty register}">
					<jsp:include page="register.jsp"/>
				</c:when>
				<c:otherwise>
					<h2>Cutting Edge Technology for Every Investor</h2>
					<p>View and manage your portfolio, your way. Our technology ensures a
					seamless investing experience for everyone across all devices and platforms.
					</p>
				</c:otherwise>
			</c:choose>
			</div>
			<div id="inline2" style="background:#fff" class="lity-hide">
				<p class="Title">Register</p>
				
					<sf:form modelAttribute="account"
			method="POST" action="completeRegistration">
				<fieldset>
					<sf:label path="username" for="username">User Name:</sf:label>
					<sf:input path="username" name="username" id="username"/>
					<sf:errors path="username" cssClass="formError" />
					<sf:label path="password" for="password">Password:</sf:label>
					<sf:input path="password" type="password" name="password" id="password" />
					<sf:errors path="password" cssClass="formError" />
					<input type="submit" value="Register" />
				</fieldset>
		</sf:form>
		</div>
			<div id="inline" style="background:#fff" class="lity-hide">
				<p class="Title">LOGIN</p>
				<sf:form action="Login" method="POST" modelAttribute="account">
					<fieldset>
						<sf:label path="username"> Username </sf:label>
						<sf:input type="text" path="username" placeholder="Username"
							required="true" />
						<sf:label path="password"> Password </sf:label>
						<sf:input type="password" path="password" placeholder="Password"
								required="true" pattern=".{6,}" />
							<input type="submit" value="Click Here" />
						</fieldset>
					</sf:form>
				</div>
			</div>
		</c:otherwise>
</c:choose>
	<div id="OnlineTrading">
		<a href="onlinetrading.html"><img class="CircleImage"
			src="resources/images/round-images1.png"></a>
		<p class="Title">Online Trading</p>
 		Our platform for trading stocks, Exchange Traded Funds (ETFs)and mutual
 		funds is powerful and flexible, without giving up the benefit of being
 		easy-to-use. Straightforward order entry screens allow you to execute your trades fast.
	</div>
	<div id="InvestmentProducts">
		<a href="investmentproducts.html"><img class="CircleImage"
			src="resources/images/round-images2.png"></a>
		<p class="Title">Investment Products</p>
		<p>
		Today's investment decisions are more complicated than ever, with a wider
		variety of asset classes, easier access to emerging markets, and increased
		economic uncertainty. To help our clients navigate such complexities, we
		leverage the products and services of TP's Global Asset Management's portfolio
		of solutions—designed to meet a variety of investment goals and risk profiles.
		</p>
	</div>
	<div id="OnlineBrokerage">
		<a href="onlinebrokerage.html"><img class="CircleImage"
			src="resources/images/round-images3.png"></a>
		<p>
		<p class="Title">Online Brokrage</p>
		Founded in 2015, The Trading Platform's mission is to "Create technology to provide
		liquidity on better terms. Compete on price, speed, size, diversity of global products
		and advanced trading tools.""

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
var lightbox = lity();
$("#email").attr('required','');
$("#password").attr('required','');
</script>
</body>
</html>