<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>id</td><td>name</td><td>email</td><td>phone</td><td>specialiazation</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
String email=(String)session.getAttribute("email");
ps=con.prepareStatement("select * from doctor where email=?");
ps.setString(1,email);
ResultSet x=ps.executeQuery();
while(x.next()){
%>
<tr>
<td><%=x.getInt("id") %></td>
<td><%=x.getString("name") %></td>
<td><%=x.getString("email") %></td>
<td><%=x.getLong("phone") %></td>
<td><%=x.getString("specialiazation") %></td>
<td><a href="update_doctor_profile.jsp?id=<%=x.getInt("id")%>">Update</a></td>
</tr>
<%} %>

</table>
</body>
</html>