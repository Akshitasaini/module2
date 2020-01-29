<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
     <%@ page isELIgnored="false"%>
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
<title>Delete Dat</title>
</head>
<body>
<form action="deletecustomer.do" method ="POST">
<table>
<tr>
<td>Enter ID To Delete</td>
<td><input type="text" required="required" value="${customer.id }" name="id"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Delete"/></td>
</tr>
</table>
</form>
</body>
</html>