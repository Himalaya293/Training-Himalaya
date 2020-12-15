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
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>Name</td><td>Email</td><td>Password</td><td>Bloodgroup</td><td>Age</td><td>Prescription</td><td>Id</td><td>Action</td></tr>
<%
Pregistrationbean eb=(Pregistrationbean)session.getAttribute("bean");
if(eb!=null){
%>
</tr>
<td><%=eb.getName() %></td>
<td><%=eb.getEmail() %></td>
<td><%=eb.getPassword() %></td>
<td><%=eb.getBloodgroup() %></td>
<td><%=eb.getAge() %></td>
<td><%=eb.getPrescription() %></td>
<td><%=eb.getId() %></td>
<td><a href="update_patient_profile.jsp?id=<%=eb.getId()%>">Update</a></td>

<%} %>
</table>
</body>
</html>
















