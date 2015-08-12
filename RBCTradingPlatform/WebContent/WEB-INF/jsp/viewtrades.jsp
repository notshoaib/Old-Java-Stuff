<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/style/StyleSheet.css" rel="stylesheet"
	type="text/css" />
<link href="resources/style/TableStyleSheet.css" rel="stylesheet"
	type="text/css" />
<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<title>View Trades</title>

<script>

		 function getDate()
		{
			var result_from_Date_getTime = ${resultDate} 
			var date = new Date;
			date.setTime(result_from_Date_getTime);
			var day = date.getDate();
			var month = date.getMonth();
			var year = date.getFullYear();
			
			return day+" "+month+" "+year;				  
		}	
		 $(document).ready( function(){				
				document.getElementById("#RequestDate").value = getDate();
				
				$(form).submit(function() {
					  alert( "Request Submitted." );
				});
		    });
	</script>
</head>
<body>
<%@ include file="ShareholderHeader.jsp" %>
<div class="wrapper">
<div class="ActivityContainer">
		   	<p>View Trades:</p>
		   	<table class="table--class">
				<tr>
					<td>Stock Exchange ID</td>
					<td>Stock ID</td>
					<td>Transaction Time</td>
					<td>Shares</td>
					<td>Share Price</td>
					<td>Price Total</td>
					<td>Buyer ID</td>
					<td>Seller ID</td>					
				</tr>
			<c:forEach var="currentTrade" items='${tradelist}'>

				<tr>
					<td>${currentTrade.stockExId}</td>
					<td>${currentTrade.stockId }</td>
					<td>${currentTrade.transactionTime}</td>
					<td>${currentTrade.shares}</td>
					<td>${currentTrade.sharePrice}</td>
					<td>${currentTrade.priceTotal}</td>
					<td>${currentTrade.buyerId}</td>
					<td>${currentTrade.sellerId}</td>
				</tr>
			</c:forEach>
				</table>
			</div>
</div>


</body>
</html>