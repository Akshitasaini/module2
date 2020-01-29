<%@page import="java.util.List"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="comm.example.model.Customer" %>
<%@page import="comm.example.service.CustomerService" %>
<%@page import="comm.example.service.CustomerServiceImpl" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css"
		  rel="stylesheet"
		  href="style.css" />

<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" 
crossorigin="anonymous">
<title>List Customers</title>
</head>
<body>
<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach var="tempCustomer" items="${customers}">
				<c:url var="updateUrl" value="updatecustomer.do">
				<c:param name="customerId" value="${tempCustomer.id}"/>
					</c:url>
					
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td><a href="${ updateUrl}">Update</a></td>
					</tr>
				
				</c:forEach>
					<c:forEach var="tempCustomer" items="${customers}">
					<c:url var ="deleteUrl" value="deletecustomer.do">
					<c:param name="customerId" value="${tempCustomer.id }"/>
					</c:url>
					
					</c:forEach>	
			</table>
  <a href="addcustomer.jsp" style="position: absolute; left: 20%; right: 20%; bottom: 5%; ">Submit Link button</a>
  
</body>
</html>