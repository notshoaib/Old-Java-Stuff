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
<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<title>Request Trade</title>

<script>

		 function getDate()
		{
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

<div class="ActivityContainer">
	<p>Request Trade:</p>
		<div class="History">
		   <div class="request">
		   	<th>TABLE 1</th>
		   	<table>
				<tr>
					<td>Stock Exchange ID</td>
					<td>Stock ID</td>
					<td>Transaction Time</td>
					<td>Shares</td>
					<td>Share Price</td>
					<td>Price Total</td>
					<td>Buyer Id</td>
					<td>Seller Id</td>					
				</tr>
			<c:forEach var="currentTrade" items='${tradelist}'>

				<tr>
					<td>${currentTrade.stock_ex_id}</td>
					<td>${currentTrade.stock_id }</td>
					<td>${currentTrade.transactionTime}</td>
					<td>${currentTrade.shares}</td>
					<td>${currentTrade.share_price}</td>
					<td>${currentTrade.price_total}</td>
					<td>${currentTrade.buyer_id}</td>
					<td>${currentTrade.seller_id}</td>
				</tr>
			</c:forEach>
				</table>
			</div>
		</div>

</div>


</body>
</html>