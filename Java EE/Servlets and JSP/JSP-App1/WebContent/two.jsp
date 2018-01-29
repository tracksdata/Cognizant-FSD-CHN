<%@page import="com.Employee"%>
<h1>Welcome to two.jsp</h1>

<%-- <h1>Emp Id  <%=request.getAttribute("empId") %>  </h1> --%>
<%-- <h1>Name  <%=request.getAttribute("empName") %>  </h1> --%>
<%-- <h1>Salary  <%=request.getAttribute("salary") %>  </h1> --%>


<h2>Employee Data</h2>

<%

Employee emp=(Employee) request.getAttribute("emp");


%>

<h2>EMp Id:  <%=emp.getEmpId()%></h2>
<h2>EMp Name:  <%=emp.getEmpName()%></h2>
<h2>Salary:  <%=emp.getSalary()%></h2>


