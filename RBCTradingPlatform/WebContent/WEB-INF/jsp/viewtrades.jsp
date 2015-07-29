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
			<c:forEach var="currentTrade" items='${requestScope.tradelist}'>
					<tr>
						<td>${current_trade.transactionTime}</td>
						</tr>
						</c:forEach>
			</div>
		</div>

</div>


</body>
</html>