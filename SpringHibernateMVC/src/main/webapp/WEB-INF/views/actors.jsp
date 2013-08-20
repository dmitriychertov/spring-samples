<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Actors</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet">
<script src="http://code.jquery.com/jquery.js"></script>
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- NAV BAR -->
	<div class="navbar navbar-fixed-top  navbar-inverse">
		<div class="navbar-inner">
			<a class="brand" href="#">{sakila}</a>
			<ul class="nav">
				<li class="active"><a href="#">Actors</a></li>
				<li><a href="#">Address</a></li>
				<li><a href="#">Category</a></li>
				<li><a href="#">City</a></li>
				<li><a href="#">Country</a></li>
				<li><a href="#">Customer</a></li>
				<li><a href="#">Film</a></li>
			</ul>
		</div>
	</div>
	<!-- NAV BAR -->
	<div class="container-fluid">
		<h3>Actors</h3>
		<div class="row-fluid">
			<div class="span2">
				<ul class="nav nav-tabs nav-stacked">
					<li><a href="#"><span class="label label-success">Total
								number of actors: ${actorsSize}</span></a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Profile</a></li>
				</ul>
			</div>
			<div class="span10">
				<ul class="breadcrumb">
					<li><a href="#">Home</a> <span class="divider">/</span></li>
					<li><a href="#">Actors</a> <span class="divider">/</span></li>
					<li class="active">All Actors</li>
				</ul>
				<c:if test="${search == 'true'}">
					<table
						class="table table-striped table-bordered table-hover table-condensed">
						<tr>
							<th>Name</th>
							<th>Last Updated</th>
						</tr>
						<c:if test="${empty actors}">
							<tr>
								<td colspan="2">No results found!</td>
							</tr>
						</c:if>
						<c:forEach var="actor" items="${actors}">
							<tr>
								<td>${actor.firstName} ${actor.lastName}</td>
								<td>${actor.lastUpdatedOn}</td>
							</tr>
						</c:forEach>
					</table>
				</c:if>

				<div class="pagination">
					<ul>
						<li class="disabled"><a href="#">First</a></li>
						<li class="disabled"><a href="#">Prev</a></li>
						<li class="active"><a href="#">1</a></li>
						<li class="active"><a href="#">2</a></li>
						<li class="active"><a href="#">3</a></li>
						<li class="active"><a href="#">4</a></li>
						<li class="active"><a href="#">5</a></li>
						<li class="active"><a href="#">Next</a></li>
						<li class="active"><a href="#">Last</a></li>
					</ul>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
