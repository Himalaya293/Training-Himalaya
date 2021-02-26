<!DOCTYPE html>
<html>
<body bgcolor="light pink">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
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
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from doctor where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()){

%>
<form action="./doctor_profile_update.jsp" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name")%>">
<input type="email" name="email" value="<%=rs.getString("email")%>">
<input type="number" name="phone" value="<%=rs.getLong("phone")%>">
<select name="specialization">
<option value="<%=rs.getString("specialization")%>"><%=rs.getString("specialization")%></option>
<option value="DENTIST">DENTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>

</select>
<input type="submit" value="update">
</form>
<%} %>























