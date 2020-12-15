<!DOCTYPE html>
<html>
<body bgcolor="red">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">Profile</a>
<a href="appointment.jsp">Appointment</a>
<a href="appointment_status.jsp">Appointment Status</a>
<a href="index.html">Logout</a>
<br><br><br>

<%@page import="com.mvcapollo.Pregistrationbean" %>
<%
Pregistrationbean eb=(Pregistrationbean)session.getAttribute("bean");
if(eb!=null){
%>
<form action="./patient_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value="<%=eb.getId()%>">
<input type="text" name="name" value="<%=eb.getName()%>">
<input type="email" name="email" value="<%=eb.getEmail()%>">
<input type="text" name="bloodgroup" value="<%=eb.getBloodgroup()%>">
<input type="number" name="age" value="<%=eb.getAge()%>">
<select name="prescription">
<option value="<%=eb.getPrescription()%>"><%=eb.getPrescription()%></option>
<option value="DENTIST">DENTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>

</select>
<input type="submit" value="update">
</form>
<%} %>

</body>
</html>