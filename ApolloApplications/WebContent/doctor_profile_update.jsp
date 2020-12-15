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
Long phone=Long.parseLong(request.getParameter("phone"));
String specialiazation=request.getParameter("specialiazation");
int id=Integer.parseInt(request.getParameter("id"));

ps=con.prepareStatement("update doctor set name=?,email=?,phone=?,specialiazation=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3,phone);
ps.setString(4,specialiazation);
ps.setInt(5,id);
int  x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("doctor_profile.jsp?msg=Updated");

%>