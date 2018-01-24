package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome to SrvOne Servlet</h1>");
		
		// setAttribute to set any object to a scoped object

		request.setAttribute("empName", "Praveen");
		request.setAttribute("empName", "Praveen S");
		ServletConfig config=getServletConfig();
		
		config.getServletContext().setAttribute("empName", "Praveen - Config");
		
		getServletContext().setAttribute("empName", "Praveen-Context");
		out.println("<h1>EMp name- request: "+request.getAttribute("empName"));
		out.println("<h1> Emp Name-> config: "+config.getServletContext().getAttribute("empName"));
		out.println("<h1> Emp Name-> context: "+getServletContext().getAttribute("empName"));
		
		
		
		
		
	}

}
