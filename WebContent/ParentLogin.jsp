<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parent Login Page</title>
 <link rel="stylesheet" type="text/css" href="view.css" media="all">
</head>
<body id="main_body" >
	
	<div id="form_container">
	
		<h1><a>Parent Login</a></h1>
		
		
		
		
		<form id="form_112580" class="appnitro"  method="POST" action="ParentView">
					<div class="form_description">
			<h2>Parent Login</h2>
		</div>						
		
		<div style="color:red"><%
    if(null!=request.getAttribute("errorMessage"))
    {
        out.println(request.getAttribute("errorMessage"));
    }
%></div>

			<ul >

			
					<li id="li_1" >
		<label class="description" for="element_1">Username</label>
		<span>
			<input id="element_1_1" name= "Username_parent" type ="text" class="element text" >
			<label>*required</label>
			  
		</span>
		</li>		<li id="li_2" >
		<label class="description" for="element_2">Password</label>
		<span>
			<input id="element_2_1" name="Password_Parent" class="element text" type="password"> 
			<label for="element_2_1">*required</label>
		</span>
		 
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="1125809" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" />
		</li>
			</ul>
		</form>	
		<div id="footer">
			Generated by <a href="http://www.phpform.org">pForm</a>
		</div>
	</div>
	<img id="bottom" src="bottom.png" alt="">
</body>
</html>