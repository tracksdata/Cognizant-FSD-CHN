package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		out.println("<h1>Welcome to SrvTwo Servlet</h1>");
		out.println("<h1>Emp name -> request: "+request.getAttribute("empName"));
		out.println("<h1> Emp Name-> config: "+config.getServletContext().getAttribute("empName"));
		out.println("<h1> Emp Name-> context: "+getServletContext().getAttribute("empName"));
		
		
		
	}

}
