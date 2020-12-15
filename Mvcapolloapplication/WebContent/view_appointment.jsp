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

<%@page import="com.mvcapollo.View_appointmentbean,java.util.*" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>Patientname</td><td>Phone</td><td>Email</td><td>Gender</td><td>Bloodgroup</td><td>Specialiazation</td><td>Doa</td><td>Toa</td><td>Status</td><td>Doctor_name</td><td>Action</td></tr>
<%
String specialiazation=(String)session.getAttribute("specialiazation");
List<View_appointmentbean> l=new View_appointmentbean().viewvalidate(specialiazation);
Iterator it=l.iterator();
while(it.hasNext()){
	View_appointmentbean vb=(View_appointmentbean)it.next();
%>
</tr>
<td><%=vb.getPatientname() %></td>
<td><%=vb.getPhone() %></td>
<td><%=vb.getEmail() %></td>
<td><%=vb.getGender() %></td>
<td><%=vb.getBloodgroup() %></td>
<td><%=vb.getSpecialiazation() %></td>
<td><%=vb.getDoa() %></td>
<td><%=vb.getToa() %></td>
<td><%=vb.getStatus() %></td>
<td><%=vb.getDoctor_name() %></td>
<%if(vb.getStatus().equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%}else{ %>
<td><a href="./accept_appointment?id=<%=vb.getId() %>">Accept</a></td>
<%} %>

</tr>
<%} %>
</table>
</body>
</html>