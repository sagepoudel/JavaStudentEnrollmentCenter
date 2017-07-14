package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;
import dAO.DataAccess;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name=request.getParameter("Student_Name");
		String address=request.getParameter("Student_Address");
		String Sclass = request.getParameter("Student_Class");
		String dob = request.getParameter("Student_DOB");
		String pname = request.getParameter("Parent_Name");
		String academic = request.getParameter("Academic_Grade");
		String extra = request.getParameter("Extra_Curricular");
		
		System.out.println(name);
		System.out.println(address);
		
		//User u=new User(name, address);
		//System.out.println(u.getName());
		//DataAccess.insertUser(u);
	Student s = new Student(name,address,Sclass,dob,pname,academic,extra);
	DataAccess.insertStudent(s);
	response.sendRedirect(request.getContextPath()+"/AddParent.jsp");
	}

}
