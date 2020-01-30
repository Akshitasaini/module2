<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
CD added successfully<br/>
<br/>
CD  Title:${cd.title}<br/>
CD type:${cd.type }<br/>
CD Published date:${cd.date}<br/>
<a href="${pageContext.request.contextPath}/">home</a>
</body>
</html>