<!DOCTYPE html>
<html>
<body bgcolor="pink">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE HOME</h1></center>
<br><br><br>
<a href="emp_home.html">Home</a>
<a href="emp_profile.jsp">Profile</a>
<a href="leaveapplication.jsp">Leave Application</a>
<a href="leave_status.jsp">Leave Status</a>
<a href="index.html">Logout</a>
<br><br><br>

<%@page import="com.mvc.Eregistrationbean" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>name</td><td>email</td><td>password</td><td>gender</td><td>joiningdate</td><td>department</td><td>exp</td><td>Action</td></tr>
<%


Eregistrationbean eb=(Eregistrationbean)session.getAttribute("bean");
if(eb!=null){
%>
<tr>
<td><%=eb.getId() %></td>
<td><%=eb.getName() %></td>
<td><%=eb.getPassword() %></td>
<td><%=eb.getGender() %></td>
<td><%=eb.getJoiningdate() %></td>
<td><%=eb.getDepartment() %></td>
<td><%=eb.getExp() %></td>
<td><a href="update_emp_profile.jsp?id=<%=eb.getId()%>">Update</a></td>

<%} %>
</tr></table>
</body>
</html>

