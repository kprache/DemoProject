package coditas.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
//@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Hello Admin");
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		if(uname.equals("Billo")&& password.equals("Army@1234"))
		{
			response.sendRedirect("member.jsp");
		}
		else
		{
			response.sendRedirect("Error.jsp");
		}
		
		
	}

}
