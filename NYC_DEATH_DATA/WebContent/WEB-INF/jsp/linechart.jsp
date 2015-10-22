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
  data-graph-container="#highchart-container" 
  data-graph-type="line"
  use data-graph-container-before="1">
  
  <caption>Column example</caption>
  <thead>
    <tr>
      <th>Year</th>
      <c:forEach var="year" items='${years}'>
      	<c:forEach var="yearlist" items='${map[year]}'>
      	
      	<c:if test="${year==2008}">
      	<th>
      	<c:out value="${yearlist.cause}"/>
      	</th>
      	</c:if>
      
      	</c:forEach>
	  </c:forEach>
    </tr>
  </thead>
		<tbody>
			<c:forEach var="year" items='${years}'>
			<tr>
				<td><c:out value="${year}"/>
				<c:forEach var="yearsum" items='${map[year]}'>
					

						<td><c:out value="${yearsum.count}" /></td>


						
					
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