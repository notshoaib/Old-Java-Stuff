<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Line chart</title>
<link href="resources/css/simple-sidebar.css" rel="stylesheet">
</head>
<body>


        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        NYC Causes of Death
                    </a>
                </li>
                <li>
                    <a href="/NYC_DEATH_DATA">Home</a>
                </li>
                <li>
                    <a href="linechart">View Chart</a>
                </li>
            </ul>
        </div>
<table class="highchart" 
  data-graph-container="#highchart-container" 
  data-graph-type="line"
  data-graph-height="1200"
  data-graph-container-before="1"
  >
  
  <caption>Column example</caption>
  <thead>
    <tr>
      <th>Year</th>
      <c:forEach var="year" items='${years}'>
      	<c:forEach var="yearlist" items='${map[year]}'>
      	
      	<c:if test="${year==2008}">
      	<th data-graph-hidden="1">
      	<c:out value="${yearlist.causeOfDeath}"/>
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