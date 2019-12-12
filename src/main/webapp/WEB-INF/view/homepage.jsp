<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache">
	<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
	<title>Welcome</title>
	<link href="static/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/css/style.css" rel="stylesheet">
<body bgcolor="blue">

<div role="navigation">
	<div class="navbar navbar-inverse">
		<a href="/welcome  " class="navbar-brand">Home</a>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">

				<li><a href="/show-users">All Users</a></li>
				<li><a href="/welcome">Logout</a></li>
			</ul>
		</div>
	</div>
</div>


<div class="container" id="homediv">
	<div class="jumbotron text-center">
		<h1>Welcome </h1>
		<h3>Super Admin Access</h3>
	</div>
</div>







<script src="static/js/jquery-1.11.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
</body>
</html>