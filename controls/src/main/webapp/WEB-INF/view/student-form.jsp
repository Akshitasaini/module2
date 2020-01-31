<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<form:errors path = "firstName"></form:errors>
		<br><br>
	
		Last name: <form:input path="lastName" />
		<form:errors path = "lastName"></form:errors>
		<br><br>
	
	    Age: <form:input path="age"/>
	    <form:errors path = "age"></form:errors>
	    <br><br>
	    Email:<form:input path ="email"/>
	    <form:errors path = "email"></form:errors>
	    <br><br>
	    
	    zipCode:<form:input path = "zipCode"/>
	    <form:errors path = "zipCode"></form:errors>
	    <br><br>
	    
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				<form:errors path = "country"></form:errors>
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
<form:errors path = "favoriteLanguage"></form:errors>
		<br><br>

		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />
<form:errors path = "operatingSystems"></form:errors>
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>

</body>
</html>