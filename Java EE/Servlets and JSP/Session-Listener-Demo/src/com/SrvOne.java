package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>SrvOne Page</h1>");
		
		HttpSession session=request.getSession(true);
		
		if(request.getParameter("user").equals("admin")&& request.getParameter("pwd").equals("123")) {
			session.setAttribute("userName", request.getParameter("user"));
			response.sendRedirect("Welcome");
		}else {
			response.sendRedirect("login.html");
		}
		out.println("<h2>Number of page hits: "+getServletContext().getAttribute("pageCount"));
		
		
		
	}

}
