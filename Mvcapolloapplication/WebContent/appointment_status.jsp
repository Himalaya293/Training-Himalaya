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

<%@page import="com.mvcapollo.Apply_appointmentbean,java.util.*" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>Patient_Name</td><td>Phone</td><td>Email</td><td>gender</td><td>bloodgroup</td><td>Prescription</td><td>doa</td><td>toa</td><td>Status</td><td>doctor_name</td></tr>
<%
int id=(int)session.getAttribute("id");
List<Apply_appointmentbean> l=new Apply_appointmentbean().status(id);
Iterator i=l.iterator();
while(i.hasNext()){
	Apply_appointmentbean vb=(Apply_appointmentbean)i.next();
%>
<tr>
<td><%=vb.getPatientname() %></td>
<td><%=vb.getPhone()%></td>
<td><%=vb.getEmail()%></td>
<td><%=vb.getGender()%></td>
<td><%=vb.getBloodgroup()%></td>
<td><%=vb.getSpecialiazation()%></td>
<td><%=vb.getDoa()%></td>
<td><%=vb.getToa()%></td>
<td><%=vb.getStatus()%></td>
<td><%=vb.getDoctor_name()%></td>

</tr>
<%} %>
</table>
</body>
</html>