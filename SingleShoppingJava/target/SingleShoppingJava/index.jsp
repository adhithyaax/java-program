<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Shop &mdash; Free Website Template, Free HTML5 Template by gettemplates.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by gettemplates.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="gettemplates.co" />

	<!-- 
	//////////////////////////////////////////////////////

	FREE HTML5 TEMPLATE 
	DESIGNED & DEVELOPED by FreeHTML5.co
		
	Website: 		http://freehtml5.co/
	Email: 			info@freehtml5.co
	Twitter: 		http://twitter.com/fh5co
	Facebook: 		https://www.facebook.com/fh5co

	//////////////////////////////////////////////////////
	 -->

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet"> -->
	<!-- <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i" rel="stylesheet"> -->
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="<c:url value="/resource/css/animate.css"/>">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="<c:url value="/resource/css/icomoon.css"/>">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="<c:url value="/resource/css/bootstrap.css"/>">

	<!-- Flexslider  -->
	<link rel="stylesheet" href="<c:url value="/resource/css/flexslider.css"/>">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="<c:url value="/resource/css/owl.carousel.min.css"/>">
	<link rel="stylesheet" href="<c:url value="/resource/css/owl.theme.default.min.css"/>">

	<!-- Theme style  -->
	<link rel="stylesheet" href="<c:url value="/resource/css/style.css"/>">

	<!-- Modernizr JS -->
	<script src="<c:url value="/resource/js/modernizr-2.6.2.min.js"/>"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->


</head>
<body>
<h2>Welcome OnlineShopping</h2>
   <%@ include file="WEB-INF/jsp_pages/Header.jsp"%>
 <a href="loginpage"><h4>Login</h4></a>
<a href="register"><h4>Register</h4></a>


<%--<img src="<c:url value="/resource/images/img_bg_4.jpg"/>">--%>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
Manage account: <a href="delete">delete account</a>
	<!-- jQuery -->
	<script src="<c:url value="/resource/js/jquery.min.js"/>"></script>
	<!-- jQuery Easing -->
	<script src="<c:url value="/resource/js/jquery.easing.1.3.js"/>"></script>
	<!-- Bootstrap -->
	<script src="<c:url value="/resource/js/bootstrap.min.js"/>"></script>
	<!-- Waypoints -->
	<script src="<c:url value="/resource/js/jquery.waypoints.min.js"/>"></script>
	<!-- Carousel -->
	<script src="<c:url value="/resource/js/owl.carousel.min.js"/>"></script>
	<!-- countTo -->
	<script src="<c:url value="/resource/js/jquery.countTo.js"/>"></script>
	<!-- Flexslider -->
	<script src="<c:url value="/resource/js/jquery.flexslider-min.js"/>"></script>
	<!-- Main -->
	<script src="<c:url value="/resource/js/main.js"/>"></script>



</body>
</html>