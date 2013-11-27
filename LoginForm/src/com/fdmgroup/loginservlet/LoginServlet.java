package com.fdmgroup.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		

		
		PrintWriter out = response.getWriter();
		ServletConfig servConfig = getServletConfig();
		
//		out.println("<html>");
//		out.println("<head><title>This is stolen Data</title></head>");
//		out.println("<body>");
//		out.println("<h1>This is my response</h1>");
//		out.println(servConfig.getInitParameter("msg")+"Username: " + username + "<br/>");
//		out.println(servConfig.getInitParameter("msg")+"Password: " +"<font color=red>"+ password + "</font>"+"<br/>");
//		out.println("</body>");
//		out.println("</html>");
		
		
		DBExtractor dbe=new DBExtractor();
		
		if(dbe.verify(username, password)){
		RequestDispatcher rd = request.getRequestDispatcher("UserDb.jsp");
		request.setAttribute("DTO", dbe.getData());
		rd.forward(request, response);
	}
		else{
			RequestDispatcher rd = request.getRequestDispatcher("InvalidLogin.html");
			rd.forward(request, response);
		}
		
	}

}
