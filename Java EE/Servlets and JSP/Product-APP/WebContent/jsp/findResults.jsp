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
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Description</th>
			<th>Product Price</th>
		</tr>
		
		
			<tr>
				<td>${product.prodId}</td>
				<td>${product.prodName}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
			</tr>
			
		
		
	</table>


</body>
</html>