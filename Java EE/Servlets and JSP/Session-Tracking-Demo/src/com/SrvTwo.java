package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		try {
		HttpSession session=request.getSession(false);
		if(session.getAttribute("user")==null) {
			
		}
		session.setMaxInactiveInterval(5);
		out.println("<h1>Welcome user "+session.getAttribute("user")+"</h1>");
		response.setIntHeader("Refresh", 6);
		
		out.println("<h1><a href='SrvThr'>Logout</a>");
		}catch(Exception e) {
			response.sendRedirect("login.html");
		}
		
	}

}
