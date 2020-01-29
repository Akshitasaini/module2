<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false"%>
 <%@page import="java.util.List"%>
 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css"
		  rel="stylesheet"
		  href="style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="add-customer-style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="container">
		<h3>Save Customer</h3>
	
		<form action="customerupdate.do" method="POST">
		
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="fName" required="required" value="${customer.firstName }" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><input type="text" name="lName" required="required" value="${customer.lastName }"/></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><input type="email" name="email" required="required" value="${customer.email}"/></td>
					</tr>

					<tr>
					<input type="hidden" value="${customer.id}" name="id">
						<td><label></label></td>
						<td><input type="submit" value="Update" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
	
		
		</form>
		</div>
</body>
</html>