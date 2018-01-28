<%@page import="java.util.Date,java.io.*" %>
<%@page import ="java.awt.*" %>

<h1>New:  ${pageContext.request.contextPath} </h1>
<h1><a href='${pageContext.request.contextPath}/jsp/test.jsp'>Test JSP</a> </h1>
<h1>Date: <%=new Date() %></h1>
<h1>Welcome to JSP</h1>
<button>Click Me</button> <br>
<input>

<%
String s1="Praveen";
out.println("<h1>Name is "+s1+"</h1>");
request.setAttribute("user", "Admin");
%>

<%
out.println("<h1>Another Scriptlet: "+s1);
%>

<h1>User Name: <%=request.getAttribute("user") %> </h1>
<h1>My Name is <%=s1%> </h1>

<%!

String getMessage(){
	return "Hello";
}

%>



<h1>Message:  <%=getMessage()%></h1>








