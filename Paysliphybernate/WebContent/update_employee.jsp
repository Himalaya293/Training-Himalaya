<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
   background-repeat: repeat;
  background-size: cover;
}
</style>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA" class="bg">
<br>
<center style="color:white;"><h1>WELCOME TO EMPLOYEE  REPORT</h1><br>
<a style="color:white;" href="./employee.jsp">Employee Registration Report</a>
<a style="color:white;" href="./grade.jsp">Employee Grade Report</a>
<a style="color:white;" href="./departmentwise.jsp">Employee Department Report</a>
<a style="color:white;" href="./designationwise.jsp">Employee Designation Report</a>
<a style="color:white;" href="./payslip.jsp">Employee Payroll</a>
<a   style="color:white;" href="./home.html">Home</a><br><br><br></center>

<br>
<div class="container">
        <div class="row justify-content-center align-items-center" style="height:10vh">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">

<%@page import="com.motivity.Employee,com.motivity.Ereportlogic,java.util.*" %>
<%
List<Employee> em=Ereportlogic.empdetails();
Iterator<Employee> i=em.iterator();
while(i.hasNext()){
	Employee ep=i.next();
	%>
<form action="./emp_profile_update" method="post" >
<div class="form-group">
<input type="text" class="form-control" name="cname" value="<%=ep.getCname()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="email" value="<%=ep.getEmail()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="password" value="<%=ep.getPassword()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="address" value="<%=ep.getAddress()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="deptcode" value="<%=ep.getDeptcode()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="desgcode" value="<%=ep.getDesgcode()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="gradecode" value="<%=ep.getGradecode()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="salary" value="<%=ep.getSalary()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="pfno" value="<%=ep.getPfno()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="pfuan" value="<%=ep.getPfuan()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="casualleave" value="<%=ep.getCasualleave()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="earnedleave" value="<%=ep.getEarnedleave()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="sickleave" value="<%=ep.getSickleave()%>"></div>

<input type="submit" class="btn btn-primary" value="update">

<%}%>
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>