
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="Model.Student" %>
<%@page import="databaseConnection.DbConnection" %>
<%@page import="dAO.DataAccess" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parent's view</title>
</head>
<body id="main_body" >
	
	<div id="form_container">
	<a href="Index.jsp" style="float: right">Logout</a>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption>List of Students</caption>
            <tr>
                <th>Student Name</th>
                <th>Class</th>
                <th>Data of Birth</th>
                <th>Academic Grade</th>
                <th>Extra Curricular</th>
            
                
            </tr>
         
         <% 
         //String name = (String)request.getAttribute("student");
         //String s=(String) request.getAttribute("student");
        // Student student = DataAccess.getStudentInfo(4);
			//System.out.println(s);
         
         //String a = student.getStudent_Name();
         //String b = student.getStudent_class();
         //String c =student.getStudent_Dob();
         //String d =s.getAcademic_Grade();
         //String e =s.getExtra_Curricular();
         //System.out.println(s);
         out.println("check");
         String name = null;
         String Sclass = null;
         String dob = null;
         String grade = null;
         String extra = null;
        // out.println((String)request.getAttribute("student"));
          //String msg = null;
         //if(request.getAttribute("student") != null) {
        	  Student sts = (Student)request.getAttribute("student");
        	  name = sts.getStudent_Name();
        	   Sclass = sts.getStudent_class();
               dob =sts.getStudent_Dob();
              grade =sts.getAcademic_Grade();
              extra =sts.getExtra_Curricular();
        	//  out.println(msg);
         //}
         %>
           	   <tr>
           	  		<td><%= name%></td>
           	  		<td><%= Sclass%></td>
           	  		<td><%= dob%></td>
           	  		<td><%= grade%></td>
           	  		<td><%= extra%></td>
                    
                  </tr>  
                            
                  
               
        </table>
    </div>
    </div>
</body>

</body>
</html>