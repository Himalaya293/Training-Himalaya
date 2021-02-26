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
String manager_name=(String)session.getAttribute("name");
ps=con.prepareStatement("update leaveapplication set status=?,manager_name=? where id=?");
ps.setString(1,"Accepted");
ps.setString(2,manager_name);
ps.setInt(3,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("view_leaveapplication.jsp?msg=accepted");
%>
