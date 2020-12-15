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


<%@page import="com.mvc.Apply_leaveapplicationbean,java.util.*" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>Name</td><td>Email</td><td>Reason</td><td>Doa</td><td>Doj</td><td>Department</td><td>Status</td><td>Manager_name</td></tr>
<%

int id=(int)session.getAttribute("id");
List<Apply_leaveapplicationbean> l=new Apply_leaveapplicationbean().status(id);
Iterator i=l.iterator();
while(i.hasNext()){
	Apply_leaveapplicationbean vb=(Apply_leaveapplicationbean)i.next();
%>
</tr>
<td><%=vb.getName() %></td>
<td><%=vb.getEmail() %></td>
<td><%=vb.getReason() %></td>
<td><%=vb.getDoa() %></td>
<td><%=vb.getDoj() %></td>
<td><%=vb.getDepartment() %></td>
<td><%=vb.getStatus() %></td>
<td><%=vb.getManager_name() %></td>


</tr>
<%} %>
</table>
</body>
</html>
</body>
</html>