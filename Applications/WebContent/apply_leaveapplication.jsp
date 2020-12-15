<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/kims";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
%>
<%

String name=request.getParameter("name");
String email=request.getParameter("email");
String reason=request.getParameter("reason");
String doa=request.getParameter("doa");
String doj=request.getParameter("doj");
String department=request.getParameter("department");
int id=(Integer)session.getAttribute("id");

String sql="insert into leaveapplication(name,email,reason,doa,doj,department,id) values(?,?,?,?,?,?,?)";

ps=con.prepareStatement(sql);

ps.setString(1,name);
ps.setString(2, email);
ps.setString(3, reason);
ps.setString(4, doa);
ps.setString(5, doj);
ps.setString(6, department);
ps.setInt(7,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("leaveapplication.jsp?mssg=leave_applied");
%>