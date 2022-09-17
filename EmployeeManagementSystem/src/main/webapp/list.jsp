 <%@ page import="com.example.demo.*" %>
    <%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
@keyframes color {
  0%   { background: #33CCCC; }
  20%  { background: #33CC36; }
  40%  { background: #B8CC33; }
  60%  { background: #FCCA00; }
  80%  { background: #33CC36; }
  100% { background: #33CCCC; }
}
</style>
<meta charset="ISO-8859-1">
<title>EMS</title>
</head>
<style>
body {
  background: #33CCCC; /* Fallback */
  animation: color 9s infinite linear;
  text-align: center;
  padding: 2em;
}
</style>

<center>
<%List<Employee> list=(List<Employee>)request.getAttribute("list");  %>
<table border="1" cellpadding = "10" cellspacing = "10" bordercolor = "red" bgcolor = "BlanchedAlmond" width="100%">
<tr><th>ID</th><th>Name</th><th>Father Name</th><th>Age</th><th>DOB</th><th>Address</th><th>Mob Number</th><th>Job Post</th></tr>
<% for(Employee s:list){%>
<tr><td><%=s.getId() %></td><td><%=s.getName() %></td><td><%=s.getFathername()%></td><td><%=s.getAge()%></td><td><%=s.getDob() %></td><td><%=s.getAddress()%></td><td><%=s.getNumber() %></td><td><%=s.getJobpost() %></td></tr>
<%}%> <br><br>
</table><br><br>
<form action="findid">
<input type="text" name="id">
<input type="submit" value="Search"><br><br>

<form action="index.jsp">
<input type="submit" value="Home">
</form>
</center>
</body>
</html>