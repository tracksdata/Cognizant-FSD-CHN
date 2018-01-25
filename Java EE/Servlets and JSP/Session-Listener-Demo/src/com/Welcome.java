package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(false);
		out.println("<h1>Welcome to My Page dear </h1>"+session.getAttribute("userName"));
		out.println("<h1>Active Users: "+getServletContext().getAttribute("userCount"));
		out.println("<h1><a href='Logout'>Logout</a>");
		
	}

}
