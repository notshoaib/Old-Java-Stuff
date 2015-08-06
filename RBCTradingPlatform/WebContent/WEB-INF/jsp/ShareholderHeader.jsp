<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'/>

    <div class="Banner"> 
	<img id="Logo" src="resources/images/logo.jpg" />
	    <p class="CallUs">Call Us: 567-8309</p>
	    <form action="logout" method="post">
		     <input type="submit" value="Logout" class="Button">
		</form>       
    </div>
    
<div class="MainContainer">
		<img class="CenterPicture" src="resources/images/main.jpg" />
		
		
		<div id="Opaque" class="Opacity">
		
        <p class="Title"> Welcome Shareholder: ${sessionScope.user.username}!</p>

        What would you like to do:
		<div id="menu" class="UserMenu">
			<form action="viewtrades" method="get">
				<input type="submit" class="Button" value="View Trade History">
			</form>
			<form action="outstandingRequest" method="get">
				<input type="submit" class="Button" value="View Outstanding Requests">
			</form>
			<form action="createRequest" method="get">
				<input type="submit" class="Button" value="Request Trade">
			</form>
			<form action="portfolio" method="get">
				<input type="submit" class="Button" value="View Portfolio">
			</form>
		</div>
		
		</div>	
	
</div>