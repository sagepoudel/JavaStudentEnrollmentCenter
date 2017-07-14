package controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseConnection.DbConnection;

/**
 * Servlet implementation class AdminInfo
 */
@WebServlet("/AdminInfo")
public class AdminInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PreparedStatement con;
	private String username;
	private String password;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		username = request.getParameter("Username_admin");
		password = request.getParameter("Password_admin");
		try {
			con = DbConnection.connect("Select *from Table_admin where Username_admin = ? and Password_admin = ?");
			con.setString(1, username);
			con.setString(2, password);
			ResultSet rs = con.executeQuery();
			if(rs.next()){
				response.sendRedirect(request.getContextPath() + "/welcome.jsp");
			}else{
				System.out.println("Invalid login attempt!!");
	        	request.setAttribute("errorMessage", "Invalid user or password");
				RequestDispatcher dispatcher = request.getRequestDispatcher("AdminLogin.jsp");
				dispatcher.include(request, response);
			}
		} catch (SQLException e) {
			e.getStackTrace();
		}

	}
}
