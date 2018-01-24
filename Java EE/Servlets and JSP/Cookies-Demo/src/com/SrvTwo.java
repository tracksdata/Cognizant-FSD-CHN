package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		Cookie[] cookies= request.getCookies();
		
		for(Cookie c:cookies) {
			if(c.getName().equals("user")) {
				out.println("<h1>Welcome dear "+c.getValue()+"</h1>");
			}
		}
		
		
		
		
		
		
		
		
	}

}
