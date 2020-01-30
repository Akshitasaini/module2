<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Internatinal and special edition CD</title>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
 <tr>
<td><h2>Internatinal and special edition CD: Add A New CD</h2></td>
 </tr>
</table>

 
 <form action="processForm" method="post">
  <div class="form-group">
    <label >CD Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>CD Type</label>
    <select class="form-control" name="type">
      <option value="Unknown">Select...</option>
      <option value="Internatinal Edition">Internatinal Edition</option>
      <option value="Special Edition">Special Edition</option>
     
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">YEAR</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="year" name="year">
  </div>
 <input type="submit"/> 
 <input type="reset"/> 
</form>
</body>
</html>