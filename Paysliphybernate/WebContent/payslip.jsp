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
<center style="color:white;"><h1>WELCOME TO EMPLOYEE DEPARTMENT REPORTS</h1><br>
<a style="color:white;" href="./employee.jsp">Employee Registration Report</a>
<a style="color:white;" href="./grade.jsp">Employee Grade Report</a>
<a style="color:white;" href="./departmentwise.jsp">Employee Department Report</a>
<a style="color:white;" href="./designationwise.jsp">Employee Designation Report</a>
<a style="color:white;" href="./payslip.jsp">Employee Payroll</a>
<a   style="color:white;" href="./home.html">Home</a><br><br><br></center>
</center>
<br><br><br><br>
<div class="container">

<%@page import="com.motivity.Paysliplogic,com.motivity.Employee,com.motivity.Deduction,java.util.*" %>
<%
int aid=(int)session.getAttribute("aid");
List<Employee> ep=Paysliplogic.pslip(aid);

Iterator i=ep.iterator();
while(i.hasNext()){
	Employee epy=(Employee)i.next();
	
	%>
<table class="table table-bordered table-light">
<tr class="table-success">
<tr>
 <th>Eid:</th><td><%=epy.getEid() %></td></tr>
 <tr>
 <th>Doj:</th><td><%=epy.getEmail() %></td></tr>
 <tr>
 <th>Dob:</th><td><%=epy.getPassword() %></td></tr>
 <tr>
 <th>Address:</th><td><%=epy.getAddress() %></td></tr>
 <tr>
 <th>Deptcode:</th><td><%=epy.getDeptcode() %></td></tr>
 <tr>
 <th>Desgcode:</th><td><%=epy.getDesgcode() %></td></tr>
 <tr>
 <th>Gradecode:</th><td><%=epy.getGradecode() %></td></tr>
 <tr>
 <th>Pfno:</th><td><%=epy.getPfno() %></td></tr>
 <tr>
 <th>Pfuan:</th><td><%=epy.getPfuan() %></td></tr>
 <tr>
 <th>Casualleave:</th><td><%=epy.getCasualleave() %></td></tr>
 <tr>
 <th>Earnedleave:</th><td><%=epy.getEarnedleave() %></td></tr>
 <tr>
 <th>Sickleave:</th><td><%=epy.getSickleave() %></td></tr>
 <tr>
 <th>Salary:</th><td><%=epy.getSalary() %></td></tr>
</tr></table>
<br><br><br></div>
<%} %>
<% 
List<Deduction> epr=Paysliplogic.payroll(aid);
Iterator ip=epr.iterator();
while(ip.hasNext()){
	Deduction epry=(Deduction)ip.next();
	
	%>
	
<table class="table table-bordered table-light">
<tr class="table-success">
 <th>Pfamount:</th><td><%=epry.getPfamount() %></td></tr>
 <tr>
 <th>Proftax:</th><td><%=epry.getProftax() %></td></tr>
 <tr>
 <th>Incometax:</th><td><%=epry.getIncometax() %></td></tr>
 <tr>
 <th>Year:</th><td><%=epry.getYear() %></td></tr>
 <tr>
 <th>Month:</th><td><%=epry.getMonth() %></td></tr>
 <tr>
 <th>Ename:</th><td><%=epry.getEname() %></td></tr>
 </tr></table>
<br><br><br></div>
 
<%} %>
</body>
</html>