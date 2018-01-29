<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<h1>Disp.jsp</h1>

<c:forEach var="city" items="${requestScope.myCities}">
<h2>${city} </h2>
</c:forEach>



<table border="1">

<tr>
	<th>Employee Id</th>
	<th>Name</th>
	<th>Salary</th>

</tr>

<c:forEach var="emp" items="${requestScope.employees}">

<tr>
	<td>${emp.empId}</td>
	<td>${emp.empName}</td>
	<td>${emp.salary}</td>
</tr>

</c:forEach>












</table>