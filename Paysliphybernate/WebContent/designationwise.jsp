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
<%@page import="com.motivity.Dsgreportlogic,com.motivity.Designation,java.util.*" %>
<table class="table table-bordered table-light">
<tr class="table-success">
<tr><td>Deptcode</td><td>Desgcode</td><td>Desgname</td><td>Eid</td></tr>

<%
String deptcode=(String)session.getAttribute("deptcode");
String desgcode=(String)session.getAttribute("desgcode");
int eid=(Integer)session.getAttribute("eid");
List<Designation> gm=Dsgreportlogic.dsgdetails();
Iterator<Designation> i=gm.iterator();
while(i.hasNext()){
	Designation dsgp=i.next();
	%>
	<tr>
<td><%=dsgp.getDeptcode() %></td>
<td><%=dsgp.getDesgcode() %></td>
<td><%=dsgp.getDesgname() %></td>
<td><%=dsgp.getEid() %></td>
</tr></table>
<a style="color:white;" href="update_designationwise.jsp?eid=<%=dsgp.getEid()%>"><center>Update</center></a>


<%} %>
</body>
</html>