<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Employee Registration form</h1>

<form:form action="saveEmp.htm" method="post" commandName="empCmd">

Employee Id: <form:input path="empId"/> <br>
Employee Name: <form:input path="empName"/> <br>
Salary: <form:input path="salary"/> <br>
City: <form:input path="cityName"/> <br>
Select City: 
<form:select path="cityName">
<form:options items="${myCities}"/> <br>
</form:select> <br>
Select City: <form:radiobuttons path="cityName" items="${myCities}"/> <br>
Select City: <form:checkboxes items="${myCities}" path="cityName"/> <br>








</form:form>


</body>
</html>