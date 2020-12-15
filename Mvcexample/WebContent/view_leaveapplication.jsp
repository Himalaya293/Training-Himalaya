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

<%@page import="com.mvc.View_applibean,java.util.*" %>
<table border="2" align="center" width="600" heigth="300" cellpadding="20">
<tr><td>Name</td><td>Email</td><td>Reason</td><td>Doa</td><td>Doj</td><td>Department</td><td>Status</td><td>Manager_name</td><td>Action</td></tr>
<%
 
String department=(String)session.getAttribute("manager");
List<View_applibean> l=new View_applibean().viewvalidate(department);
Iterator it=l.iterator();
while(it.hasNext()){
	View_applibean vb=(View_applibean)it.next();
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
<%if(vb.getStatus().equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%}else{ %>
<td><a href="./accept_leaveapplication?id=<%=vb.getId() %>">Accept</a></td>
<%} %>



</tr>
<%} %>
</table>
</body>
</html>