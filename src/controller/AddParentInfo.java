package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Parent;
import dAO.DataAccess;

/**
 * Servlet implementation class AddParent
 */
@WebServlet("/AddParentInfo")
public class AddParentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("StudentName"));
		String username = request.getParameter("Username_parent");
		String password = request.getParameter("Password_parent");
		
		System.out.println(id);
		System.out.println(username);
		System.out.println(password);
		Parent p = new Parent(id,username,password);
		DataAccess.insertParent(p);
		response.sendRedirect(request.getContextPath()+"/welcome.jsp");
		
	}

}
