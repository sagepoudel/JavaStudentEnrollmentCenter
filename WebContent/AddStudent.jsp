<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student form</title>
<link rel="stylesheet" href="view.css"  type="text/css">
</head>
<body id="main_body" >
	
	<div id="form_container">
	
		<h1><a>Add Student</a></h1>
		<form id="form_1125809" class="appnitro"  method="post" action="AddUser">
					<div class="form_description">
			<h2>Add Student Information</h2>
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="element_1">Name</label>
		<span>
			<input id="element_1_1" name= "Student_Name" type ="text" class="element text" >
			<label>*required</label>
			  
		</span>
		</li>		<li id="li_2" >
		<label class="description" for="element_2">Address</label>
		<span>
			<input id="element_2_1" name="Student_Address" class="element text" type="text"> 
			<label for="element_2_1">*required</label>
		</span>
		<li id="li_3" >
		<label class="description" for="element_3">Class</label>
		<span>
			<input id="element_2_3" name="Student_Class" class="element text" type="text"> 
			<label for="element_2_3">*required</label>
		</span>
		<li id="li_4" >
		<label class="description" for="element_4">Date of Birth</label>
		<span>
			<input id="element_2_4" name="Student_DOB" class="element text" type="text"> 
			<label for="element_2_4">*required</label>
		</span>
		<li id="li_5" >
		<label class="description" for="element_5">Parent's Name</label>
		<span>
			<input id="element_2_5" name="Parent_Name" class="element text" type="text"> 
			<label for="element_2_5">*required</label>
		</span>
		<li id="li_6" >
		<label class="description" for="element_6">Academic Grade</label>
		<span>
			<input id="element_2_6" name="Academic_Grade" class="element text" type="text"> 
			<label for="element_2_6">*required</label>
		</span>
		<li id="li_6" >
		<label class="description" for="element_6">Extra Curricular Grade</label>
		<span>
			<input id="element_2_6" name="Extra_Curricular" class="element text" type="text"> 
			<label for="element_2_6">*required</label>
		</span>
		 
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="1125809" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Add" />
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