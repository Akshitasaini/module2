<%@page import="comm.example.model.Customer"%>
<%@page import="comm.example.dto.CustomerDTO"%>
<%@page import="comm.example.dto.CustomerDTOImpl"%>
<%@page import="comm.example.mapper.CustomerMapper"%>
<%@page import="comm.example.servlet.CustomerController"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>ALL CUSTOMERS</title>
</head>
<body>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">UID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
<%
List<Customer> list=(List<Customer>)request.getAttribute("SUCCESS");

CustomerMapper impl=new CustomerMapper();
for(Customer c:list){
CustomerDTO dto=impl.customertoCustomerDTO(c);%>


	<tbody>
    <tr>
      <td><%out.println(dto.getUId()); %></td>
      <td><%out.println(dto.getFristName()); %></td>
      <td><%out.println(dto.getLastName()); %></td>
      <td><%out.println(dto.getEmail()); %></td>
    </tr>
 
  </tbody>
<%}%>

</table>
</body>
</html>