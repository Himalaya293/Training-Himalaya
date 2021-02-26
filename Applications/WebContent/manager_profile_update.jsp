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
String name=request.getParameter("name");
String email=request.getParameter("email");
String exp=request.getParameter("exp");
int age=Integer.parseInt(request.getParameter("age"));
String salary=request.getParameter("salary");
String manager=request.getParameter("manager");

ps=con.prepareStatement("update manager set name=?,email=?,exp=?,age=?,salary=?,manager=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,exp);
ps.setInt(4,age);
ps.setString(5,salary);
ps.setString(6,manager);
ps.setInt(7,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("manager_profile.jsp?msg=Updated");

%>