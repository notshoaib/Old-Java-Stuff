package com.fdm.SecurityAndDataAccessExample;

import java.io.IOException;
import java.security.Principal;
import java.sql.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.DataSource;

public class HomePageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		//This Servlet will only run if the User has logged in successfully
		//Tomcat will populate the Session and Principal for us with the User's username and role(s)
		HttpSession session = request.getSession();
		Principal p = request.getUserPrincipal();
		//Check if the user is an Admin
		if(request.isUserInRole("admin_user")){
			session.setAttribute("adminRole", true);
		}
		String username = p.getName();
		
		//Make a call to the DAO to get some information about the user from the database
		DatabaseAccessObject dao = new DatabaseAccessObject();
		String address = dao.getUserAddress(username);
		
		request.setAttribute("username", username);
		request.setAttribute("userAddress", address);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/protectedHomePage.jsp");
		rd.forward(request, response);
	}
}