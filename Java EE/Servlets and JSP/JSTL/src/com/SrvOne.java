package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	
		String cities[]= {"HYD","CHN","DELHI","MUMBAI","GOA"};
		
	    Employee e1=new Employee(10, "Praveen", 34973);
	    Employee e2=new Employee(11, "James", 4646);
	    Employee e3=new Employee(12, "Sarah", 3435);
	    Employee e4=new Employee(13, "Ozvitha", 7575);
	    Employee e5=new Employee(14, "Rose", 46677);
		
		List<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
	    
		
		request.setAttribute("myCities", cities);
		request.setAttribute("employees", emps);
		
		
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("disp.jsp");
		rd.forward(request, response);
		
		
	
	}

}
