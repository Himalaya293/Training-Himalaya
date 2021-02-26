<!DOCTYPE html>
<html>
<body bgcolor="pink">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE HOME</h1></center>
<br><br><br>
<a href="emp_home.html">Home</a>
<a href="emp_profile.jsp">Profile</a>
<a href="leaveapplication.jsp">Leave Application</a>
<a hreaf="leave_status.jsp">Leave Status</a>
<a href="index.html">Logout</a>
<br><br><br>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" width="800" height="300" cellpadding="20" align="center">
<tr><td>Name</td><td>Email</td><td>Reason</td><td>Doa</td><td>Doj</td><td>Department</td><td>Status</td><td>Manager_name</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);

int id=(Integer)session.getAttribute("id");
ps=con.prepareStatement("select * from leaveapplication where id=?");
ps.setInt(1,id);
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

</tr>
<%} %>
</table>
</body>
</html>
