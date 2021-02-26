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

<%
Registrationbean lb=(Registrationbean)session.getAttribute("bean");
if(lb!=null){
%>
<form action="./manager_profile_update" align="center">
<input type="hidden" name="id" value="<%=lb.getId()%>">
<input type="text" name="name" value="<%=lb.getName()%>">
<input type="email" name="email" value="<%=lb.getEmail()%>">
<input type="text" name="exp" value="<%=lb.getExp()%>">
<input type="number" name="age" value="<%=lb.getAge()%>">
<input type="text" name="salary" value="<%=lb.getSalary()%>">
<select name="manager">
<option value="<%=lb.getManager()%>"><%=lb.getManager()%></option>
<option value="DEVELOPER">DEVELOPER </option>
<option value="TESTER">TESTER </option>
<option value="OTHER">OTHER</option>
</select>
<input type="submit" value="update">
</form>
<%} %>


</body>
</html>