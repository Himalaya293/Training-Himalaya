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

<%@page import="com.mvc.Registrationbean" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>Name</td><td>Email</td><td>Password</td><td>Exp</td><td>Age</td><td>Salary</td><td>Manager</td><td>Action</td></tr>


<%
Registrationbean lb=(Registrationbean)session.getAttribute("bean");
if(lb!=null){
%>
<tr>
<td><%=lb.getName() %></td>
<td><%=lb.getEmail() %></td>
<td><%=lb.getPassword() %></td>
<td><%=lb.getExp() %></td>
<td><%=lb.getAge() %></td>
<td><%=lb.getSalary() %></td>
<td><%=lb.getManager() %></td>
<td><a href="update_manager_profile.jsp?id=<%=lb.getId()%>">Update</a></td>

<%} %>
</tr></table>
</body>
</html>
