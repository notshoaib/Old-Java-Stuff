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
<link href="resources/style/TableStyleSheet.css" rel='stylesheet'
	type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Droid+Sans'
	rel='stylesheet' type='text/css' />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<title>Request Trade</title>
</head>
<body>
	<%@ include file="ShareholderHeader.jsp"%>

	<div class="ActivityContainer">
		<p>Request Trade:</p>
		<div class="History">
			<div class="request">
				<table class="table--class">
					<sf:form id="TRADE" method="POST" modelAttribute="request" action="completeRequest">
						<tr>
							<td>Select Company</td>
							<td>Select Number of Shares</td>
							<td>Select Minimum Shares</td>
							<td>Set Limit Price</td>
							<td>Set Stop Price</td>
							<td>Select Time In Force</td>
							<td>Select Trade Type</td>
						</tr>
						<tr>
							<td>
								<sf:select path="stock_id" required="required" mutltiple="false">
									<option label="--- Select Company ---" />
									<sf:options items="${compList}" itemValue="stockId" itemLabel="compName"/>
								</sf:select>
							</td>
							<td>
								<sf:input type="number" path="shares" placeholder="# of Shares" required="required" min="1" />
							</td>
							<td>
								<sf:input type="number" path="minimum_shares" placeholder="Min # of Shares" required="spring" min="1" />
							</td>
							<td>
								<sf:input type="number" step="any" path="limit_price" placeholder="Limit Price"  min="0" />
							</td>
							<td>
								<sf:input type="number" step="any" path="stop_price" placeholder="Stop Price"  min="0" />
							</td>
							<td>
								<sf:select path="timeInForce" required="required" mutltiple="false">
									<option label="--- Select Time in Force ---" />
									<sf:options items="${timeInForce}" itemLabel="type" />
								</sf:select>
							</td>
							<td>
								<sf:select path="requestType" required="required" multiple="false">
									<option label="---Buy Or Sell---" />
									<sf:options items="${buySell}" itemLabel="type" />
								</sf:select>
							</td>
						<tr>
							<td>Request Date</td>
						</tr>
							<tr>
								<td>
									<input id ="visibleDate" type="datetime" readonly>
<%-- 									<sf:hidden id="requestDate" path="requestDate" /> --%>
								</td>
							<tr>
						</tr>
						<tr>
							<td><input type="submit" class="Button" value="submit" /></td>
						</tr>
						<c:if test="${not empty success}">
							<h1>SUCCESS!!</h1>
						</c:if>
					</sf:form>
				</table>
			</div>
		</div>

	</div>
	<script type="text/javascript">
		var x = $("#requestDate").val(getDate());
		$("#visibleDate").val(new Date().toTimeString());
		$("#requestDate").val(new Date().getMilliseconds());
	</script>

</body>
</html>