package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SrvTwo
 */
public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		ServletContext application=getServletContext();
		ServletConfig config=getServletConfig();
	
		out.println("<h1>Welcome to SrvTwo Servlet</h1>");
		
		out.println("<h2>Company: "+application.getInitParameter("company"));
		out.println("<h2>Location: "+application.getInitParameter("loc"));
		out.println("<h2>Manager: "+application.getAttribute("mgrName"));
		
		out.println("<h2>Emp Id: : "+config.getInitParameter("empId"));
		out.println("<h2>Emp Name: : "+config.getInitParameter("empName"));
		
		
	}

}
