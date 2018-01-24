package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set server response output type. (MIME)
		
		response.setContentType("text/html");
		
		// read client request parameters
		
		int empId=Integer.parseInt(request.getParameter("empId"));
		String s2=request.getParameter("empName");
		String gen=request.getParameter("gender");
		String hob[]=request.getParameterValues("hob");
		String courseName=request.getParameter("course");
		
		
		
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Employee Id: "+empId);
		out.println("<h1>Employee Name: "+s2);
		out.println("<h1>Gender: "+gen);
		out.println("<h1>Course Selected:: "+courseName);
		out.println("<h1>Selected Hobbies are: ");
		for(String h:hob) {
			out.println("<h1>"+h);
		}
		out.println("<h2><a href='form.html'>Add Another Employee</a>");
		
		
		
		System.out.println("--- empServlet service method");
	}

}
