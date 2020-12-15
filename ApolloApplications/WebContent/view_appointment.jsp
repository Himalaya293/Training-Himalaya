<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctot_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="view_appointment.jsp">Appointment Details</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" width="800" height="300" cellpadding="20" >
<tr><td>Patient_Name</td><td>Phone</td><td>Email</td><td>gender</td><td>bloodgroup</td><td>Specialiazation</td><td>doa</td><td>toa</td><td>Status</td><td>doctor_name</td><td>Action</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);

String specialiazation=(String)session.getAttribute("specialiazation");
ps=con.prepareStatement("select * from appointment where specialiazation=? ");
ps.setString(1,specialiazation);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getLong(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
<td><%=rs.getString(8)%></td>
<td><%=rs.getString(9)%></td>
<td><%=rs.getString(10)%></td>
<td><%=rs.getString(11)%></td>
<%if(rs.getString(10).equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%}else{ %>
<td><a href="accept_appointment.jsp?id=<%=rs.getInt(1) %>">Accept</a></td>
<%} %>

</tr>
<%} %>
</table>




</body>
</html>