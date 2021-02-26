<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="view_appointment.jsp">Appointment details</a>
<a href="index.html">Logout</a>
<br><br><br>

<%@page import="com.mvcapollo.Dregistrationbean" %>
<% 
Dregistrationbean lb=(Dregistrationbean)session.getAttribute("bean");
if(lb!=null){
%>
<form action="./doctor_profile_update" method="post" align="center">
<input type="hidden" name="id" value="<%=lb.getId()%>">
<input type="text" name="name" value="<%=lb.getName()%>">
<input type="email" name="email" value="<%=lb.getEmail()%>">
<input type="number" name="phone" value="<%=lb.getPhone()%>">
<select name="specialiazation">
<option value="<%=lb.getSpecialiazation()%>"><%=lb.getSpecialiazation()%></option>
<option value="DENTIST">DENTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>

</select>
<input type="submit" value="update">
</form>
<%} %>

</body>
</html>