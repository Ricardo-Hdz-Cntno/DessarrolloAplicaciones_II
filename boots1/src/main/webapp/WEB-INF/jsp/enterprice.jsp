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
					<li><a href="new-enterprice">Manage Enterprice</a></li>
					<li><a href="all-enterprices">All enterprices</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
	<c:when test="${mode=='MODE_HOME'}">
		<div class="container">
		<div class="jumbotron text-center" id="homeDiv">
			<h1>Welcome to Enterprice Manager</h1>
		</div>	
	</div>
	</c:when>
	
	<c:when test="${mode=='MODE_HOME'}">
		<div class="container">
		<div class="jumbotron text-center" id="homeDiv">
			<h1>Welcome to Enterprice Manager</h1>
		</div>	
	</div>
	</c:when>
	
	<c:when test="${mode=='MODE_ENTERPRICES' }">
	<div class="container text-center" id="enterpricesDiv">
		<h3>My Enterprice</h3>
		<hr/>
		<div class="table-reposive">
			<table class="table table-stiped table-bordered">
				<thead>
					<tr>
						<td>Id</td>
						<td>Name</td>
						<td>Description</td>
						<td>Date fundation</td>
						<td>Status</td>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="enterprice" items="${enterprices}">
						<tr>
							<td>${enterprice.id}</td>
							<td>${enterprice.name}</td>
							<td>${enterprice.description}</td>
							<td><fmt:formatDate pattern="dd-mm-yyyy" value="${enterprice.dateFundation}"/></td>
							<td>${enterprice.status==true?'YES':'NO'}</td>
							<td><a href="update-enterprice?id=${enterprice.id}">
							<span class="glyphicon glyphicon-pencil"></span>
							</a></td>
							<td><a href="delete-enterprice?id=${enterprice.id}">
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
			<h3>Manager Enterprice</h3>
			<hr/>
			<form class="form-horizontal" method="POST" action="save-enterprice">
				<input type="hidden" name="id" value="${enterprice.id}"/>
				<div class="form-group">
					<label class="control-label col-md-3">Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" value="${enterprice.name}"
						name="name"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-md-3">Description</label>
					<div class="col-md-7">
						<input type="text" class="form-control" value="${enterprice.description}" 
						name="description"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-md-3">Status</label>
					<div class="col-md-7">
						<input type="radio" class="col-sm-1" name="status" value="true"/>
						<div class="col-sm-1">Yes</div>
						<input type="radio" class="col-sm-1" name="status" value="false"
								checked="checked"/>
						<div class="col-sm-1">No</div>
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
