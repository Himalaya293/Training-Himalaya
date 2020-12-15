<!DOCTYPE html>
<html>
<body bgcolor="pink">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE HOME</h1></center>
<br><br><br>
<a href="emp_home.html">Home</a>
<a href="emp_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>name</tr></td>email</tr></td>password</tr></td>gender</tr></td>joiningdate</tr></td>department</tr></td>exp</tr></td>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
int id=(int)session.getAttribute("id");
ps=con.prepareStatement("select * from employee where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("password") %></td>
<td><%=rs.getString("gender") %></td>
<td><%=rs.getString("joiningdate") %></td>
<td><%=rs.getString("department") %></td>
<td><%=rs.getString("exp") %></td>
<td><a href="update_emp_profile.jsp?pid=<%=rs.getInt("id")%>">Update</a></td>
</tr>

<%} %>

</table>
</body>
</html>