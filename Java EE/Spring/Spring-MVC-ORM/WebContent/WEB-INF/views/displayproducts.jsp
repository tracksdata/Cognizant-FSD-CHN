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
	<br />

	<table align="center" cellpadding="5" cellspacing="5" border="1">

		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Description</th>
		</tr>



		<c:forEach var="prod" items="${products}">
			<tr>
				<td>${prod.prodId}</td>
				<td>${prod.prodName}</td>
				<td>${prod.price}</td>
				<td>${prod.description}</td>
			</tr>
		</c:forEach>






	</table>

<h3><a href="${pageContext.request.contextPath }/index.jsp">Home</a></h3>

</body>
</html>