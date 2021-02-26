<!DOCTYPE html>
<html>
<body bgcolor="orange">
<br><br><br>
<center><h1>WELCOME TO MANAGER HOME</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>
<a href="manager_profile.jsp">Profile</a>
<a href="view_leaveapplication.jsp">Leave Application details</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" width="800" height="300" cellpadding="20" align="center">
<tr><td>Name</td><td>Email</td><td>Reason</td><td>Doa</td><td>Doj</td><td>Department</td><td>Status</td><td>Manager_name</td><td>Action</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);

String department=(String)session.getAttribute("manager");
ps=con.prepareStatement("select * from leaveapplication where department=?");
ps.setString(1,department);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
<td><%=rs.getString(8)%></td>
<td><%=rs.getString(9)%></td>
<%if(rs.getString(8).equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%}else{ %>
<td><a href="accept_leaveapplication.jsp?id=<%=rs.getInt(1) %>">Accept</a></td>
<%} %>

</tr>
<%} %>
</table>
</body>
</html>