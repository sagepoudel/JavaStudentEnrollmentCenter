<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin home page</title>
<meta name="author" content="your name" />
	<meta name="description" content="" />

<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->	
	<link rel="stylesheet" href="welcome.css" type="text/css" />
</head>
<body>

<!-- webpage content goes here in the body -->

	<div id="page">
		<div id="logo">
			<h1 id =logolink >Welcome Admin</h1>
		</div>
		<div id="nav">
			<ul>
				<li><a href="Index.jsp">Home Page</a></li>
				<li><a href="AddStudent.jsp">Add Student Information</a></li>
				<li><a href="AddParent.jsp">Add Parent Information</a></li>
				
			</ul>	
		</div>
		<a href="Index.jsp" style="float: right">Logout</a>
		<div id="content">
			<h2>Home</h2>
			<p>
				This is the page for admin.
			</p>
			<p> 
				Admin can add student informationa as well as add parent login information.
			</p>
		</div>
		<div id="footer">
			<p>
				Webpage made by <a href="/" target="_blank">[Saroj]</a>
			</p>
		</div>
	</div>
</body>
</html>

