<!DOCTYPE html>
<html>
<body bgcolor="red">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="view_appointment.jsp">Appointment details</a>
<a href="index.html">Logout</a>
<br><br><br>

<%@page import="com.mvcapollo.Dregistrationbean" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>Name</td><td>Password</td><td>Email</td><td>Phone</td><td>Specialiazation</td><td>Action</td></tr>
<%
Dregistrationbean lb=(Dregistrationbean)session.getAttribute("bean");
if(lb!=null){
%>
</tr>
<td><%=lb.getName() %></td>
<td><%=lb.getPassword() %></td>
<td><%=lb.getEmail() %></td>
<td><%=lb.getPhone() %></td>
<td><%=lb.getSpecialiazation() %></td>
<td><a href="update_doctor_profile.jsp?id=<%=lb.getId()%>">Update</a></td>

<%} %>

</table>
</body>
</html>