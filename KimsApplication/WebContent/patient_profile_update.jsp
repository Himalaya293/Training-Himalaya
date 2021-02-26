<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);

String name=request.getParameter("name");
String email=request.getParameter("email");
String bloodgroup=request.getParameter("bloodgroup");
int age=Integer.parseInt(request.getParameter("age"));
String prescription=request.getParameter("prescription");
int pid=Integer.parseInt(request.getParameter("pid"));

ps=con.prepareStatement("update patient set name=?,email=?,bloodgroup=?,age=?,prescription=? where pid=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,bloodgroup);
ps.setInt(4,age);
ps.setString(5,prescription);
ps.setInt(6,pid);
int  x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("patient_profile.jsp?msg=Updated");

%>