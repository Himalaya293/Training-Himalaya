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

<%@page import="com.mvc.Eregistrationbean" %>
<% 
Eregistrationbean eb=(Eregistrationbean)session.getAttribute("bean");
if(eb!=null){
%>
<form action="./emp_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value="<%=eb.getId()%>">
<input type="text" name="name" value="<%=eb.getName()%>">
<input type="email" name="email" value="<%=eb.getEmail()%>">
<input type="gender" name="gender" value="<%=eb.getGender()%>">
<input type="joiningdate" name="joiningdate" value="<%=eb.getJoiningdate()%>">
<select name="department">
<option value="<%=eb.getDepartment()%>"><%=eb.getDepartment()%></option>
<option value="DEVELOPER">DEVELOPER</option>
<option value="TESTER">TESTER</option>
<option value="OTHER">OTHER</option>
</select>
<select name="exp">
<option value="<%=eb.getExp()%>"><%=eb.getExp()%></option>
<option value="FRESHER">FRESHER</option>
<option value="EXPERIENCED">EXPERIENCED</option>
</select>
<input type="submit" value="update">

<%}%>

</form>
</body>
</html>