<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body, html {
  height: 100%;
  margin: 0;
}
.bg {
  /* The image used */
  background-image: url("Screenshot (469).png");
  /* Full height */
  height: 100%; 
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>

<body bgcolor="lightskyblue" class="bg">
<center style="color:white;"><h1>WELCOME TO EMPLOYEE REPORTS</h1><br>
<a style="color:white;" href="./employee.jsp">Employee Registration Report</a>
<a style="color:white;" href="./grade.jsp">Employee Grade Report</a>
<a style="color:white;" href="./departmentwise.jsp">Employee Department Report</a>
<a style="color:white;" href="./designationwise.jsp">Employee Designation Report</a>
<a style="color:white;" href="./payslip.jsp">Employee Payroll</a>
<a   style="color:white;" href="./home.html">Home</a><br><br><br></center>
</center>
<br><br><br><br>
<div class="container">

<%@page import="com.motivity.Ereportlogic,com.motivity.Employee,java.util.*" %>
<table class="table table-bordered table-light">
<tr class="table-success">
<tr><td>Eid</td><td>Cname</td><td>Email</td><td>Password</td><td>Address</td><td>Deptcode</td><td>Desgcode</td><td>Gradecode</td><td>salary</td><td>Pfno</td><td>Pfuan</td>
<td>Casualleave</td><td>Earnedleave</td><td>Sickleave</td></tr>

<%
List<Employee> em=Ereportlogic.empdetails();
Iterator<Employee> i=em.iterator();
while(i.hasNext()){
	Employee emp=i.next();
	%>
<tr>
<td><%=emp.getEid() %></td>
<td><%=emp.getCname() %></td>
<td><%=emp.getEmail() %></td>
<td><%=emp.getPassword() %></td>
<td><%=emp.getAddress() %></td>
<td><%=emp.getDeptcode() %></td>
<td><%=emp.getDesgcode() %></td>
<td><%=emp.getGradecode() %></td>
<td><%=emp.getSalary() %></td>
<td><%=emp.getPfno() %></td>
<td><%=emp.getPfuan() %></td>
<td><%=emp.getCasualleave() %></td>
<td><%=emp.getEarnedleave() %></td>
<td><%=emp.getSickleave() %></td>
</tr></table>
<br><br><br></div>
<a style="color:white;" href="update_employee.jsp?eid=<%=emp.getEid()%>"><center>Update</center></a>



<%} %>
</body>
</html>