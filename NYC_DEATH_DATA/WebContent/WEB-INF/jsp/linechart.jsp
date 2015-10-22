<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="highchart" 
  data-graph-container=".. .. .highchart-container" 
  data-graph-type="line">
  <caption>Column example</caption>
  <thead>
    <tr>
      <th>Year</th>
      <c:forEach var="leadingcause" items='${codset}'>	
	  <th><c:out value="${leadingcause}"/></th>
	  </c:forEach>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="year" items='${years}'>	
    <tr>    
    
	  <td><c:out value="${year}"/></td>
	  
	  <c:forEach var="leadingcause" items='${dataset}'>	
	  <td><c:out value="${leadingcause.count}"></c:out></td>
	  </c:forEach>

    </tr>
  </c:forEach>

  </tbody>
</table>
<script src="resources/js/jquery.js" type="text/javascript"></script>
<script src="resources/js/highcharts.js" type="text/javascript"></script>
<script src="resources/js/jquery.highchartTable.js" type="text/javascript"></script>
<script>
$(document).ready(function() {
	  $('table.highchart').highchartTable();
	});
</script>
</body>
</html>