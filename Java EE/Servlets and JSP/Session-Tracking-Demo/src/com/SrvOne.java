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
		out.println("<h1>Welcome to SrvOne</h1>");
		
		HttpSession session=request.getSession(true);
		session.setAttribute("user", request.getParameter("user"));
		
		out.println("<h1>Session Id: "+session.getId());
		out.println("<h1>Is New?: "+session.isNew());
		
		if(request.getParameter("user").equals("admin") && request.getParameter("pwd").equals("123"))
		response.sendRedirect("SrvTwo"); // discard output of SrvOne
		else
		response.sendRedirect("login.html");	
		
	}

}
