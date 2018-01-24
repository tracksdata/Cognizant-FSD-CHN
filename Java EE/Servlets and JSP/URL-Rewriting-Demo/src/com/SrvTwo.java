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
		
		String userName=request.getParameter("s1");
		String pwd=request.getParameter("password");
		
		out.println("<h1>Welcome dear user "+userName+"</h1>");
		out.println("<h1>Password is "+pwd+"</h1>");
		
		
		
		
		
		
	}

}
