package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SrvOne extends HttpServlet {

	public SrvOne() {
		System.out.println("---- SrvOne Object Created");
	}

	
	
	
	FileInputStream fis=null;
	Properties props=null;
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("--- init method of SrvOne got called");
		try {
			
			fis=new FileInputStream("d:/works/data.properties");
			props=new Properties();
			props.load(fis);
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
	}

	@Override
	public void destroy() {

		System.out.println("--- destroy method of SrvOne got called");
	}

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h2> Welcome dear  "+props.getProperty("name")+"</h2>");
		out.println("<h2><a href='abc'>Go to Second Servlet</a></h2>");
		System.out.println("--- Service method of SrvOne got called");

	}

}
