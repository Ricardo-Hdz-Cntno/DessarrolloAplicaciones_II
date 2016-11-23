<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<title>Bootstrap sample| Home</title>
	<link href="/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="nav navbar-nav">
				<ul class="nav navbar-nav">
					<li><a href="/all-tasks">Manage Task</a></li>
					
					<li><a href="/all-rents">Manage Rent</a></li>
					
					<li><a href="/all-enterprices">Manage Enterprice</a></li>
						</ul>
					</div>
				</div>
			</div>
			
					<c:choose>
					<c:when test="${mode=='MODE_HOME'}">
					<div class="container">
					<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome</h1>
					</div>	
					</div>
					</c:when>
					</c:choose>
					
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>

</body>
</html>
