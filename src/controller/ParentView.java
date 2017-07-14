package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;
import dAO.DataAccess;
import databaseConnection.DbConnection;

/**
 * Servlet implementation class ParentView
 */
@WebServlet("/ParentView")
public class ParentView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private PreparedStatement con;
	private static int id;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ParentView() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		username = request.getParameter("Username_parent");
		password = request.getParameter("Password_Parent");
		System.out.println(username);
		System.out.println(password);
		try {
			con = DbConnection.connect("Select * from Table_Plogin where Pusername = ? and Ppassword = ?");
			con.setString(1, username);
			con.setString(2, password);
			ResultSet rs = con.executeQuery();
			if(rs.next()){
	            System.out.println("Valid login!!");
				id = rs.getInt("sid");
				Student student = DataAccess.getStudentInfo(id);
				System.out.println(student.getStudent_Name());
				request.setAttribute("student", student);
				RequestDispatcher dispatcher = request.getRequestDispatcher("ParentView.jsp");
				dispatcher.include(request, response);
	        }else{
	        	System.out.println("Invalid login attempt!!");
	        	request.setAttribute("errorMessage", "Invalid user or password");
				RequestDispatcher dispatcher = request.getRequestDispatcher("ParentLogin.jsp");
				dispatcher.include(request, response);
	        }
		}
		catch (SQLException | ClassNotFoundException e) {
			System.err.println(e);

		}
	}
}
