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
<center style="color:white;"><h1>WELCOME TO EMPLOYEE DESIGNATION REPORT</h1><br>
<a style="color:white;" href="./departmentwise.jsp">Employee Department Report</a>
<a   style="color:white;" href="./home.html">Home</a><br><br><br></center>

<br>
<div class="container">
        <div class="row justify-content-center align-items-center" style="height:10vh">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">

<%@page import="com.motivity.Dreportlogic,com.motivity.Department,java.util.*" %>
<%
List<Department> gm=Dreportlogic.ddetails();
Iterator<Department> i=gm.iterator();
while(i.hasNext()){
	Department dp=i.next();
	%>
<form action="./department_update" method="post" >
<div class="form-group">
<input type="text" class="form-control" name="deptcode" value="<%=dp.getDeptcode()%>"></div>
<div class="form-group">
<input type="text" class="form-control" name="deptname" value="<%=dp.getDeptname()%>"></div>
<div class="form-group">
<input type="number" class="form-control" name="eid" value="<%=dp.getEid()%>"></div>

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