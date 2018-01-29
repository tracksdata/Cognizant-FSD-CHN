<%@page import="com.Employee"%>
<%@page session="true" isErrorPage="true" %>

<h1>Welcome to one.jsp</h1>

<%

int empId= Integer.parseInt(request.getParameter("empId"));
String empName=request.getParameter("empName");
double salary=Double.parseDouble(request.getParameter("salary"));

Employee emp=new Employee();

emp.setEmpId(empId);
emp.setEmpName(empName);
emp.setSalary(salary);


request.setAttribute("emp", emp);

// request.setAttribute("empId", empId);
// request.setAttribute("empName", empName);
// request.setAttribute("salary", salary);

RequestDispatcher rd=request.getRequestDispatcher("two.jsp");
rd.forward(request, response);

%>

<%!

private String empName;

void test(){
	
}

%>