<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    
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
			<sf:form id="TRADE" method="POST" modelAttribute="request" >
				<sf:select type="text" path="Company" placeholder="Company Name" required="required">
					<sf:options items="companyList" itemValue="companyId" itemLabel="companyName" />
				</sf:select>
				<input type="number" name="Share" placeholder="# of Shares" required min="1">
				<input type="number" name="MinShare" placeholder="Min # of Shares" required min="1">
				<input type="number" step="any" name="LimitPrice" placeholder="Limit Price" required min=".01">
				Time in Force:
				<input type="date" name="TimeInForce" required="required">
				<sf:hidden path=""/>
				<input type="hidden" name="companyID" required="required">
				<select required name="role">
		 			<option >Buy Or Sell...</option>
		 			<option value="buy">Buy</option>
					<option value="sell">Sell</option>
				</select>
				<input type="hidden" id="RequestDate" name="RequestDate"  value="">
				<input type="submit" class="Button" value="submit">
			</sf:form>
			</div>
		</div>

</div>


</body>
</html>