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
String gender=request.getParameter("gender");
String joiningdate=request.getParameter("joiningdate");
String department=request.getParameter("department");
String exp=request.getParameter("exp");

ps=con.prepareStatement("update employee set name=?,email=?,gender=?,joiningdate=?,department=?,exp=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,gender);
ps.setString(4,joiningdate);
ps.setString(5,department);
ps.setString(6,exp);
ps.setInt(7,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("emp_profile.jsp?msg=Updated");

%>