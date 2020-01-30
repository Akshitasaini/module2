<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Internatinal and special edition CD: Home</title>
</head>
<body>
<!-- Page Heading -->
 <table border="1">
 <tr>
<td><h2>Internatinal and special edition CD: Home</h2></td>
 </tr>
</table>
<p>
This is the Home page for Internatinal and special edition CD.
</p>

<h3>CD</h3>

 <ul>
 <li><a href="list.jsp">List all CD's</a></li>
 
 </ul>

 <h3>CD Administrator</h3>

 <ul>
 <li><a href="${pageContext.request.contextPath}/cd/showForm">Add a new CD</a></li>
 </ul>

</body>
</html>