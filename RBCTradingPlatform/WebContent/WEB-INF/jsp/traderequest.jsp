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
<link href="resources/style/Form.css" rel='stylesheet'
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
				<table class="table--class">
					<sf:form id="TRADE" method="POST" modelAttribute="request" action="completeRequest">
						<fieldset>
							<legend>Request</legend>
							<div class="column">
									<ul class="input-list style-1 clearfix">
										<li>
											<label for="requestDate">Request Date</label>
											<input id ="visibleDate" type="text" readonly>
											<input type="hidden" name="dateLong" id="requestDate" />
										</li>
										<li>
<!-- 											<div class="dropdown"> -->
<!-- 												<button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Tutorials -->
												<label for="company">Select Company</label>
												<sf:select path="stock_id" required="required" mutltiple="false">
													<option label="--- Select Company ---" />
													<sf:options items="${compList}" itemValue="stockId" itemLabel="compName"/>
												</sf:select>
<!-- 											</div> -->
										</li>
									</ul>
								</div>
								<div class="column">
									<ul class="input-list style-1 clearfix">
										<li>
											<label for="numberOfShares">Number of Shares</label>
											<sf:input id="numberOfShares" type="text" path="shares" placeholder="# of Shares" required="required"/>
										</li>
										<li>
											<label for="minShares">Minimum Shares</label>
											<sf:input id="minShares" type="text" path="minimum_shares" placeholder="Min # of Shares" required="required" />
										</li>
										<li>
											<label for="limitPrice">Set Limit Price</label>
											<sf:input type="text" step="any" path="limit_price" placeholder="Limit Price"  min="0" />
										</li>
										<li>
											<label for="stopPrice">Set Stop Price</label>
											<sf:input type="text" step="any" path="stop_price" placeholder="Stop Price"  min="0" />
										</li>
									</ul>
								</div>
							<div class="column">
								<ul class="input-list style-1 clearfix">
									<li>
										<label for="timeInForce">Select Time</label>
										<sf:select path="timeInForce" required="required" mutltiple="false">
											<option label="--- Select Time in Force ---" />
											<sf:options items="${timeInForce}" itemLabel="type" />
										</sf:select>
									</li>
								</ul>
								<ul class="input-list style-1 clearfix">
									<li>
										<label for="tradeType">Select Trade Type</label>
										<sf:select path="requestType" required="required" multiple="false">
											<option label="---Buy Or Sell---" />
											<sf:options items="${buySell}" itemLabel="type" />
										</sf:select>
									</li>
								</ul>
							</div>
						</fieldset>	
						<input type="submit" class="Button" value="submit" />
						<c:if test="${not empty success}">
							<h1>SUCCESS!!</h1>
						</c:if>
					</sf:form>
				</table>
	</div>
	<script type="text/javascript">
		var x = new Date().toTimeString();
		$("#visibleDate").val(new Date().toTimeString());
		$("#requestDate").val(new Date().getTime());
	</script>

</body>
</html>