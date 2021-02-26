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
<form action="./emp_profile_update.jsp" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name")%>">
<input type="email" name="email" value="<%=rs.getString("email")%>">
<input type="gender" name="gender" value="<%=rs.getString("gender")%>">
<input type="joiningdate" name="joiningdate" value="<%=rs.getString("joiningdate")%>">
<select name="department">
<option value="<%=rs.getString("department")%>"><%=rs.getString("department")%></option>
<option value="DEVELOPER">DEVELOPER</option>
<option value="TESTER">TESTER</option>
<option value="OTHER">OTHER</option>
</select>
<select name="exp">
<option value="<%=rs.getString("exp")%>"><%=rs.getString("exp")%></option>
<option value="FRESHER">FRESHER</option>
<option value="EXPERIENCED">EXPERIENCED</option>
</select>
<input type="submit" value="update">
</form>
<%} %>

</body>
</html>
