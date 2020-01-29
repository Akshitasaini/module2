<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css"
		  rel="stylesheet"
		  href="style.css" />
<title>Insert title here</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>ID</th>
			</tr>
		</thead>
		<c:forEach var="tempCustomer" items="${customer}"><tbody>
		
			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td>${tempCustomer.id}</td>
			</tr>
		</tbody></c:forEach>
	</table>
</body>
</html>