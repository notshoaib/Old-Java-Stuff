<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Trading Platform Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="The Trading Platform" />
<meta name="author" content="http://www.tradingplatform.com" />
<!-- css -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="resources/css/fancybox/jquery.fancybox.css" rel="stylesheet">
<link href="resources/css/jcarousel.css" rel="stylesheet" />
<link href="resources/css/flexslider.css" rel="stylesheet" />
<link href="resources/css/style.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="resources/css/reset.css">
<link rel="stylesheet" href="resources/css/style.css">


<!-- Theme skin -->
<link href="resources/skins/default.css" rel="stylesheet" />

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>
<div id="wrapper">
	<!-- start header -->
	<header>
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""><span>Trading</span>Platform</a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.html">Home</a></li>
                        <c:if test="${empty userLogged}">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Account<b class=" icon-angle-down"></b></a>
                            <ul class="dropdown-menu">
                            	<li><a class="cd-signin" href="#0">Login</a></li>
                            	<li><a class="cd-signup" href="#0">Register</a></li>
                            </ul>
                        </li>
                        </c:if>
                        <li><a href="resources/jsp/portfolio.html">Portfolio</a></li>
                        <li><a href="resources/jsp/blog.html">Blog</a></li>
                       	<c:if test="${not empty userLogged}">
                        	<li><a href="resources/jsp/contact.html">Log Off</a></li>
                        </c:if>
                    </ul>
                </div>
            </div>
        </div>
	</header>
	<!-- end header -->
	<section id="featured">
	<!-- start slider -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
	<!-- Slider -->
        <div id="main-slider" class="flexslider">
            <ul class="slides">
              <li>
                <img src="resources/img/slides/1.jpg" alt="" />
                <div class="flex-caption">
                    <h3>Modern Design</h3> 
					<p>Duis fermentum auctor ligula ac malesuada. Mauris et metus odio, in pulvinar urna</p> 
					<a href="#" class="btn btn-theme">Learn More</a>
                </div>
              </li>
              <li>
                <img src="resources/img/slides/2.jpg" alt="" />
                <div class="flex-caption">
                    <h3>Fully Responsive</h3> 
					<p>Sodales neque vitae justo sollicitudin aliquet sit amet diam curabitur sed fermentum.</p> 
					<a href="#" class="btn btn-theme">Learn More</a>
                </div>
              </li>
              <li>
                <img src="resources/img/slides/3.jpg" alt="" />
                <div class="flex-caption">
                    <h3>Clean & Fast</h3> 
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit donec mer lacinia.</p> 
					<a href="#" class="btn btn-theme">Learn More</a>
                </div>
              </li>
            </ul>
        </div>
	<!-- end slider -->
			</div>
		</div>
	</div>	
	
	

	</section>
	<section class="callaction">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="big-cta">
					<div class="cta-text">
						<h2><span>TP</span> Professional</h2>
						<div id="inline" style="background:#fff" class="lity-hide">
							<p class="Title">LOGIN</p>
							<sf:form action="Login" method="POST" modelAttribute="account">
								<fieldset>
									<sf:label path="username"> Username </sf:label>
									<sf:input type="text" path="username" placeholder="Username"
										required="true" />
									<sf:label path="password"> Password </sf:label>
									<sf:input type="password" path="password" placeholder="Password"
										required="true" pattern=".{6,}" />
									<input type="submit" value="Click Here" />
								</fieldset>
							</sf:form>
						</div>
					<c:if test="${not empty register}">
						<jsp:include page="register.jsp"/>
					</c:if>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<section id="content">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="row">
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Fully responsive</h4>
								<div class="icon">
								<i class="fa fa-desktop fa-3x"></i>
								</div>
								<p>
								 Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
								</p>
									
							</div>
							<div class="box-bottom">
								<a href="#">Learn more</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Modern Style</h4>
								<div class="icon">
								<i class="fa fa-pagelines fa-3x"></i>
								</div>
								<p>
								 Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
								</p>
									
							</div>
							<div class="box-bottom">
								<a href="#">Learn more</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Customizable</h4>
								<div class="icon">
								<i class="fa fa-edit fa-3x"></i>
								</div>
								<p>
								 Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
								</p>
									
							</div>
							<div class="box-bottom">
								<a href="#">Learn more</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Valid HTML5</h4>
								<div class="icon">
								<i class="fa fa-code fa-3x"></i>
								</div>
								<p>
								 Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
								</p>
									
							</div>
							<div class="box-bottom">
								<a href="#">Learn more</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- divider -->
		<div class="row">
			<div class="col-lg-12">
				<div class="solidline">
				</div>
			</div>
		</div>
		<!-- end divider -->
		<!-- Portfolio Projects -->
		<div class="row">
			<div class="col-lg-12">
				<h4 class="heading">Our Services</h4>
				<div class="row">
					<section id="projects">
					<ul id="thumbs" class="portfolio">
						<!-- Item Project and Filter Name -->
						<li class="col-lg-3 design" data-id="id-0" data-type="web">
						<div class="item-thumbs">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 1" href="resources/img/works/ipad.jpg">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src="resources/img/works/ipad.jpg" alt="Bigger is better. Increase your visibility of the markets with the largest mobile display available.">
						</div>
						</li>
						<!-- End Item Project -->
						<!-- Item Project and Filter Name -->
						<li class="item-thumbs col-lg-3 design" data-id="id-1" data-type="icon">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 2" href="resources/img/works/meeting.jpg">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src="resources/img/works/meeting.jpg" alt="Designed by professional traders looking for a better way to manage their trades using the Trading Platform. .">
						</li>
						<!-- End Item Project -->
						<!-- Item Project and Filter Name -->
						<li class="item-thumbs col-lg-3 photography" data-id="id-2" data-type="illustrator">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 3" href="resources/img/works/tradinggraph.jpg">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src="resources/img/works/tradinggraph.jpg" alt="">
						</li>
						<!-- End Item Project -->
						<!-- Item Project and Filter Name -->
						<li class="item-thumbs col-lg-3 photography" data-id="id-2" data-type="illustrator">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 4" href="resources/img/works/Wall_Street.jpg">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src="resources/img/works/Wall_Street.jpg" alt="In a world of 'round-the-clock financial information, and with new investment opportunities emerging daily, look to us to help you navigate the financial markets with a focus on today and an eye on the future">
						</li>
						<!-- End Item Project -->
					</ul>
					</section>
				</div>
			</div>
		</div>

	</div>
	</section>
	<footer>
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="widget">
					<h5 class="widgetheading">Get in touch with us</h5>
					<address>
					<strong>JVM Funds</strong><br>
					 Java Concourse suite 9000<br>
					 Gotham City 16425 Gotham </address>
					<p>
						<i class="icon-phone"></i> (212) 832-2000 - (206) 709-3100 <br>
						<i class="icon-envelope-alt"></i> money@tradingplatform.com
					</p>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="widget">
					<h5 class="widgetheading">Pages</h5>
					<ul class="link-list">
						<li><a href="#">Press release</a></li>
						<li><a href="#">Terms and conditions</a></li>
						<li><a href="#">Privacy policy</a></li>
						<li><a href="#">Career center</a></li>
						<li><a href="#">Contact us</a></li>
					</ul>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="widget">
					<h5 class="widgetheading">Latest News</h5>
<!-- 					<ul class="link-list"> -->
<!-- 						<li><a href="#">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></li> -->
<!-- 						<li><a href="#">Pellentesque et pulvinar enim. Quisque at tempor ligula</a></li> -->
<!-- 						<li><a href="#">Natus error sit voluptatem accusantium doloremque</a></li> -->
<!-- 					</ul> -->
				</div>
			</div>
			<div class="col-lg-3">
				<div class="widget">
					<ul class="social-network">
						<li><a href="https://developers.facebook.com/blog/" data-placement="top" title="Facebook"><i class="fa fa-facebook"></i></a></li>
						<li><a href="https://twitter.com/i/hello" data-placement="top" title="Twitter"><i class="fa fa-twitter"></i></a></li>
						<li><a href="http://blog.linkedin.com/" data-placement="top" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
						<li><a href="https://blog.pinterest.com/en" data-placement="top" title="Pinterest"><i class="fa fa-pinterest"></i></a></li>
						<li><a href="https://plus.google.com/+google/posts" data-placement="top" title="Google plus"><i class="fa fa-google-plus"></i></a></li>
					</ul>
					<div class="clear">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="sub-footer">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="copyright">
						<p>
							<span>&copy; Trading Platfrom 2015 All right reserved. By </span><a href="#" target="_blank">MA</a>
						</p>
					</div>
				</div>
				<div class="col-lg-6">
				</div>
				
			</div>
			</div>
		</div>
	</footer>
</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>
<!-- javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="resources/js/jquery.easing.1.3.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/jquery.fancybox.pack.js"></script>
<script src="resources/js/jquery.fancybox-media.js"></script>
<script src="resources/js/google-code-prettify/prettify.js"></script>
<script src="resources/js/portfolio/jquery.quicksand.js"></script>
<script src="resources/js/portfolio/setting.js"></script>
<script src="resources/js/jquery.flexslider.js"></script>
<script src="resources/js/animate.js"></script>
<script src="resources/js/custom.js"></script>
<script src="resources/js/modernizr.js"></script>

<script type="text/javascript">
$("#email").attr('required','');
$("#password").attr('required','');
</script>
</body>
</html>