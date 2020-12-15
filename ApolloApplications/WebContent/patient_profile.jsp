<!DOCTYPE html>
<html>
<body bgcolor="red">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>name</td><td>email</td><td>password</td><td>bloodgroup</td><td>age</td><td>prescription</td><td>Id</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
int id=(int)session.getAttribute("id");
ps=con.prepareStatement("select * from patient where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("password") %></td>
<td><%=rs.getString("bloodgroup") %></td>
<td><%=rs.getInt("age") %></td>
<td><%=rs.getString("prescription") %></td>
<td><%=rs.getInt("id") %></td>
<td><a href="update_patient_profile.jsp?id=<%=rs.getInt("id")%>">Update</a></td>
</tr>

<%} %>

</table>
</body>
</html>