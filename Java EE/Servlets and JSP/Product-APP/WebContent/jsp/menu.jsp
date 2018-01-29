<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<a href="${pageContext.request.contextPath}/index.jsp">Home</a> |
<a href="${pageContext.request.contextPath}/jsp/product.jsp">Add </a> |
<a href="${pageContext.request.contextPath}/ProductController?menu=listAll">Display </a> |
<a href="${pageContext.request.contextPath}/ProductController?menu=listAll_V1">Display_V1 </a> |
<a href="${pageContext.request.contextPath}/jsp/find.jsp">Find Product </a> |
<a href="${pageContext.request.contextPath}/jsp/update.jsp">Update</a> |
<a href="${pageContext.request.contextPath}/jsp/delete.jsp">Delete </a> 
</center>


</body>
</html>