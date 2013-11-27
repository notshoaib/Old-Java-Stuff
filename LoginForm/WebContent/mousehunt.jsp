<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "com.fdmgroup.loginservlet.DTO, java.util.List;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<script type="text/javascript">
            // This function gets the current time and injects it into the DOM
            function updateClock() {
                // Gets the current time
                var now = new Date();
 
                // Get the hours, minutes and seconds from the current time
                var hours = now.getHours();
                var minutes = now.getMinutes();
                var seconds = now.getSeconds();
 
                // Format hours, minutes and seconds
                if (hours < 10) {
                    hours = "0" + hours;
                }
                if (minutes < 10) {
                    minutes = "0" + minutes;
                }
                if (seconds < 10) {
                    seconds = "0" + seconds;
                }
 
                // Gets the element we want to inject the clock into
                var elem = document.getElementById('clock');
 
                // Sets the elements inner HTML value to our clock data
                elem.innerHTML = hours + ':' + minutes + ':' + seconds;
            }
        </script>
		
	<script src="xmljs.js"></script>
  <head>

     <title>This is my title</title>
				<link rel="stylesheet" href="PanelStyleSample.css">
				<link rel="stylesheet" href="LeftPanelCss.css">
                
			
				 
                                    
  </head>
  <body onload="setInterval('updateClock()', 200);display();">


	
     <div class="header">
        Integrated Library System
						<div class="login" style="float:right">
								<section class="loginform cf">
<form name="login" action="page2.html" method="get" accept-charset="utf-8">
	<ul>
		<li><label for="usermail">Email</label>
		<input type="email" name="usermail" placeholder="yourname@email.com" required></li>
		<li><label for="password">Password</label>
		<input type="password" name="password" placeholder="password" required></li>
		<li>
		<input type="submit" value="Login"></li>
	</ul>
</form>
</section>
</div>
		<div>
		<form id="searchbox" action="">
    <input id="search" type="text" placeholder="Type here">
    <input id="submit" type="submit" value="Search">
</form>
	</div> <!--End of search-->
     </div> <!-- End of header div-->
    
     <div class="centerPanel">
     
     <div>
                <table border="1">
		<th>ISBN</th>
		<th>Bookname</th>
		<tr>
		<c:forEach items="${DTO}" var="info">
			<tr>
				<td><c:out value="${info.ISBN }"></c:out></td>
				<td><c:out value="${info.bookname }"></c:out></td>
				</c:forEach>
				</tr></table>
		</div>
     </div>
    
    
    <div class="leftPanel">
                This is my left panel
                                        <div id="navigation">
             <ul id="top-level">
                <li><a id= "Page1" href="#"></a>
                   <ul class="sub-level">
                      <li><a href="#">Sub Menu Item 1</a>
                         <ul class="sub-level">
                            <li><a href="#"></a></li>
                            <li><a href="#">Sub Sub Menu Item 2</a></li>
                            <li><a href="#">Sub Sub Menu Item 3</a></li>
                            <li><a href="#">Sub Sub Menu Item 4</a></li>
                         </ul>
                      </li>
                      <li><a href="#">Sub Menu Item 2</a></li>
                      <li><a href="#">Sub Menu Item 3</a></li>
                      <li><a href="#">Sub Menu Item 4</a></li>
                   </ul>
                </li>
                                
                <li><a id= "Page2" href="Aboutpg.html"></a></li>
                                <li><a id="Page3" href="Aboutpg.html"></a></li>
                                <li><a id="Page4" href="#"></a>
                   <ul class="sub-level">
                      <li><a href="#">Sub Menu Item 1</a></li>
                      <li><a href="#">Sub Menu Item 2</a></li>
                      <li><a href="#">Sub Menu Item 3</a>
                         <ul class="sub-level">
                            <li><a href="#">Sub Sub Menu Item 1</a></li>
                            <li><a href="#">Sub Sub Menu Item 2</a></li>                         
                         </ul>
                      </li>                     
                   </ul>
                </li>
                                <li><a id="Page5" href="#"></a>
                    <ul class="sub-level">
                      <li><a href="#">Sub Menu Item 1</a></li>
                      <li><a href="#">Sub Menu Item 2</a></li>                      
                   </ul>
                </li>
             </ul>
          </div> <!-- end of navigation div-->


     </div>   

     <div class="rightPanel">
               
				<script type="text/javascript">
 
      function changeCSS(cssFile, cssLinkIndex) {
 
        var oldlink = document.getElementsByTagName("link").item(cssLinkIndex);
 
        var newlink = document.createElement("link");
        newlink.setAttribute("rel", "stylesheet");
        newlink.setAttribute("type", "text/css");
        newlink.setAttribute("href", cssFile);
 
        document.getElementsByTagName("head").item(0).replaceChild(newlink, oldlink);
      }
    </script>

    <a href="#" onclick="changeCSS('PanelStyleSample.css', 0);">Blue Template</a>
    <a href="#" onclick="changeCSS('AlternateCss.css', 0);">Red Template</a>


     </div>

     <div class="footer" id="clock">
        This is my footer
     </div>

  </body>
</html>


<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title>Jaba Jstl</title> -->
<!-- <link rel="stylesheet" href="H:\workspace\LoginForm\WebContent\PanelStyleSample.css"> -->
<!-- <link rel="stylesheet" href="H:\workspace\LoginForm\WebContent\LeftPanelCss.css"> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<table border="1"> -->
<!-- 		<th>UserID</th> -->
<!-- 		<th>FirstName</th> -->
<!-- 		<th>LastName</th> -->
<!-- 		<tr> -->
<%-- 		<c:forEach items="${DTO}" var="info"> --%>
<!-- 			<tr> -->
<%-- 				<td><c:out value="${info.id }"></c:out></td> --%>
<%-- 				<td><c:out value="${info.firstname }"></c:out></td> --%>
<%-- 				<td><c:out value="${info.lastname }"></c:out></td> --%>
<%-- 				</c:forEach> --%>

<!-- 	</table> -->

<%-- 	<c:out value="I printed this from a JIPlet"> --%>
<%-- 	</c:out> --%>


<!-- </body> -->
<!-- </html> -->