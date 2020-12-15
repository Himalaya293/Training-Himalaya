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

String patientname=request.getParameter("patientname");
long phone=Long.parseLong(request.getParameter("phone"));
String email=request.getParameter("email");
String gender=request.getParameter("gender");
String bloodgroup=request.getParameter("bloodgroup");
String specialiazation=request.getParameter("specialiazation");
String doa=request.getParameter("doa");
String toa=request.getParameter("toa");

String sql="insert into appointment(patientname,phone,email,gender,bloodgroup,specialiazation,doa,toa) values(?,?,?,?,?,?,?,?)";

ps=con.prepareStatement(sql);

ps.setString(1, patientname);
ps.setLong(2, phone);
ps.setString(3, email);
ps.setString(4, gender);
ps.setString(5, bloodgroup);
ps.setString(6, specialiazation);
ps.setString(7, doa);
ps.setString(8, toa);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("appointment.jsp?mssg=applied_appointment");
%>




