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
					<td>Request ID</td>
					<td>Shareholder ID</td>
					<td>Request date</td>
					<td>Request Type</td>
					<td>Status</td>
					<td>Stock Exchange ID</td>
					<td>Stock Id</td>
					<td>Shares</td>		
					<td>Minimum Shares</td>	
					<td>Time in Force</td>	
					<td>Limit Price</td>	
					<td>Stop Price</td>				
				</tr>
			<c:forEach var="currentRequest" items='${requestlist}'>

				<tr>
					<td>${currentRequest.request_id}</td>
					<td>${currentRequest.shareholder_id}</td>
					<td>${currentRequest.requestDate }</td>
					<td>${currentRequest.requestType}</td>
					<td>${currentRequest.status}</td>
					<td>${currentRequest.stockExId}</td>
					<td>${currentRequest.stock_id}</td>
					<td>${currentRequest.shares}</td>
					<td>${currentRequest.minimum_shares}</td>
					<td>${currentRequest.timeInForce}</td>
					<td>${currentRequest.limit_price}</td>
					<td>${currentRequest.stop_price}</td>

				</tr>
			</c:forEach>
				</table>
			</div>
		</div>

</div>


</body>
</html>