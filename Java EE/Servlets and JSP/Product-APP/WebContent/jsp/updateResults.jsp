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

	<form action="${pageContext.request.contextPath}/ProductController?menu=update2" method="post" >

		<table align="center" cellpadding="5" cellspacing="5">
			<tr>

				<td>Product Id</td>
				<td><input type="text" name="prodId" value="${prod.prodId}" readonly="readonly"></td>

			</tr>
			
			<tr>

				<td>Product Name</td>
				<td><input type="text" name="prodName" value="${prod.prodName}"></td>

			</tr>
			
			<tr>

				<td>Description</td>
				<td><textarea name="description">${prod.description }</textarea> </td>

			</tr>
			<tr>

				<td>Price</td>
				<td><input type="text" name="price" value="${prod.price}"></td>

			</tr>
			
			<tr>
				<th colspan="2">
					${param.msg}
				</th>
			
			</tr>
			
			<tr>
				<th colspan="2">
					<input type="submit" value="Update Product">
				</th>
			</tr>

		</table>


	</form>
	
	<hr/>

</body>
</html>