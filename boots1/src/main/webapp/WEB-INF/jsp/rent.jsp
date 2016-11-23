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
					<li><a href="new-rent">Manage Rent</a></li>
					<li><a href="all-rents">All rents</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
	<c:when test="${mode=='MODE_HOME'}">
		<div class="container">
		<div class="jumbotron text-center" id="homeDiv">
			<h1>Welcome to Rent Manager</h1>
		</div>	
	</div>
	</c:when>		
	
	<c:when test="${mode=='MODE_RENTS' }">
	<div class="container text-center" id="rentsDiv">
		<h3>My Rent</h3>
		<hr/>
		<div class="table-reposive">
			<table class="table table-stiped table-bordered">
				<thead>
					<tr>
						<td>Id</td>
						<td>Fecha Alquiler</td>
						<td>Description</td>
						<td>Valor Alquiler</td>
						<td>Cantidad</td>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="rent" items="${rents}">
						<tr>
							<td>${rent.id}</td>
							<td><fmt:formatDate pattern="dd-mm-yyyy" value="${rent.dateRent}"/></td>
							<td>${rent.description}</td>
							<td>${rent.valueRent}</td>
							<td>${rent.quantity}</td>
							<td><a href="update-rent?id=${rent.id}">
							<span class="glyphicon glyphicon-pencil"></span>
							</a></td>
							<td><a href="delete-rent?id=${rent.id}">
							<span class="glyphicon glyphicon-trash"></span>
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</c:when>

	<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
		<div class="container text-center">
			<h3>Manager Rent</h3>
			<hr/>
			<form class="form-horizontal" method="POST" action="save-rent">
				<input type="hidden" name="id" value="${rent.id}"/>
				
				
				<div class="form-group">
					<label class="control-label col-md-3">Description</label>
					<div class="col-md-7">
						<input type="text" class="form-control" value="${rent.description}" 
						name="description"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-md-3">Value Rent</label>
					<div class="col-md-7">
						<input type="number" class="form-control" value="${rent.valueRent}" 
						name="valueRent"/>
					</div>
				</div>
				
				
				<div class="form-group">
					<label class="control-label col-md-3">Quantity</label>
					<div class="col-md-7">
						<input type="number" class="form-control" value="${rent.quantity}" 
						name="quantity"/>
					</div>
				</div>
				
				
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Save">
				</div>
				
			</form>
		</div>
		
	</c:when>
	
	
	</c:choose>
	
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>

</body>
</html>
