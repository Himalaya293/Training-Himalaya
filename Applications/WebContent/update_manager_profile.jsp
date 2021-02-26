<!DOCTYPE html>
<html>
<body bgcolor="green">
<br><br><br>
<center><h1>WELCOME TO MANAGER HOME</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>
<a href="manager_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
int id=(int)session.getAttribute("id");
ps=con.prepareStatement("select * from manager where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<form action="./manager_profile_update.jsp" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name")%>">
<input type="email" name="email" value="<%=rs.getString("email")%>">
<input type="text" name="exp" value="<%=rs.getString("exp")%>">
<input type="text" name="age" value="<%=rs.getInt("age")%>">
<input type="text" name="salary" value="<%=rs.getString("salary")%>">
<select name="manager">
<option value="<%=rs.getString("manager")%>"><%=rs.getString("manager")%></option>
<option value="DEVELOPER">DEVELOPER </option>
<option value="TESTER">TESTER </option>
<option value="OTHER">OTHER</option>
</select>
<input type="submit" value="update">
</form>
<%} %>