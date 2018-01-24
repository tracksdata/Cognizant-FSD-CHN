package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<h1>Welcome dear user " + request.getParameter("user"));
		out.println("<h1>First Line of SrvTwo</h1>");
		
		RequestDispatcher rd=request.getRequestDispatcher("SrvThr");
		rd.include(request, response);
		
		
		out.println("<h1>Last Line of SrvTwo</h1>");
		
		
		
		
		
		
		
		
	}

}
