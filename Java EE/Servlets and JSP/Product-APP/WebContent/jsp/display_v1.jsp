<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/jsp/banner.jsp"/>
<jsp:include page="/jsp/menu.jsp"/>

	<table align="center" cellpadding="5" cellspacing="5">
		<tr bgcolor="skyblue">
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Description</th>
			<th>Product Price</th>
			<th>Op1</th>
			<th>Op2</th>
		</tr>
		
		<c:forEach var="prod" items="${requestScope.products}">
			<tr>
				<td>${prod.prodId}</td>
				<td>${prod.prodName}</td>
				<td>${prod.description}</td>
				<td>${prod.price}</td>
				<td><a href="ProductController?menu=update1&prodId=${prod.prodId}">Update</a></td>
				<td><a href="ProductController?menu=delete&prodId=${prod.prodId}">Delete</a></td>
			</tr>
			
		</c:forEach>
		
	</table>


</body>
</html>