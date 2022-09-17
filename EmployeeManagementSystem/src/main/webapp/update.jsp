 <%@ page import="com.example.demo.*" %>
    <%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<style>
.button-36 {
  background-image: linear-gradient(92.88deg, #455EB5 9.16%, #5643CC 43.89%, #673FD7 64.72%);
  border-radius: 8px;
  border-style: none;
  box-sizing: border-box;
  color: #FFFFFF;
  cursor: pointer;
  flex-shrink: 0;
  font-family: "Inter UI","SF Pro Display",-apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,Oxygen,Ubuntu,Cantarell,"Open Sans","Helvetica Neue",sans-serif;
  font-size: 16px;
  font-weight: 500;
  height: 4rem;
  padding: 0 1.6rem;
  text-align: center;
  text-shadow: rgba(0, 0, 0, 0.25) 0 3px 8px;
  transition: all .5s;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
}

.button-36:hover {
  box-shadow: rgba(80, 63, 205, 0.5) 0 1px 30px;
  transition-duration: .1s;
}

@media (min-width: 768px) {
  .button-36 {
    padding: 0 2.6rem;
  }
}

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

h1 {
  font-family:monospace;
  color:black;
}

body {
  background: #33CCCC; /* Fallback */
  animation: color 9s infinite linear;
  text-align: center;
  padding: 2em;
}
</style>

<center>
<div>
<%List<Employee> list=(List<Employee>)request.getAttribute("list");  %>
<table border="1" cellpadding = "10" cellspacing = "10" bordercolor = "red" bgcolor = "BlanchedAlmond" width="100%">
<tr><th>ID</th><th>Name</th><th>Father Name</th><th>Age</th><th>DOB</th><th>Address</th><th>Mob Number</th><th>Job Post</th></tr>
<% for(Employee s:list){%>
<tr><td><%=s.getId() %></td><td><%=s.getName() %></td><td><%=s.getFathername()%></td><td><%=s.getAge()%></td><td><%=s.getDob() %></td><td><%=s.getAddress()%></td><td><%=s.getNumber() %></td><td><%=s.getJobpost() %></td></tr>
<%}%> <br><br>
</table><br><br>
</div>
<div class="contents">
<h1><strong>UPDATE EMPLOYEE</strong></h1><br>
<form action="insert">
<input type="text" name="id" placeholder="Enter ID">&nbsp&nbsp&nbsp&nbsp
<input type="text" name="name" placeholder="Enter Name">&nbsp&nbsp&nbsp&nbsp
<input type="text" name="fname" placeholder="Enter Father's Name">&nbsp&nbsp&nbsp&nbsp
<input type="number" name="age" placeholder="Enter Age" pattern="/^-?\d+\.?\d*$/" onKeyPress="if(this.value.length==3) return false;" />&nbsp&nbsp&nbsp&nbsp
DOB:&nbsp&nbsp&nbsp&nbsp<input type="date" name="dob" placeholder="Choose DOB">&nbsp&nbsp&nbsp&nbsp
<input type="text" name="address" placeholder="Enter Address">&nbsp&nbsp&nbsp&nbsp<br><br><br>
<input type="number" name="number" placeholder="Enter Mob Number" pattern="/^-?\d+\.?\d*$/" onKeyPress="if(this.value.length==10) return false;" />&nbsp&nbsp&nbsp&nbsp
<input type="text" name="jobpost" placeholder="Enter Job Title"><br><br><br>
<button type="submit" class="button-36" role="button">Submit</button>

</form>
</div><br><br><br>

<a href="index.jsp" class="button-36">Goto Home</a><br><br><br>

</form>
</center>
</body>
</html>