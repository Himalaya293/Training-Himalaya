package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;


public class Eloginbean {

	private String email,password;
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
public Eregistrationbean loginvalidate(String email,String password) throws ClassNotFoundException, SQLException {
	Connection con=ConnectionEx.Connectivity();
	PreparedStatement ps=con.prepareStatement("select * from employee where email=? and password=?");
	ps.setString(1,email);
	ps.setString(2,password);
	
	Eregistrationbean eb=new Eregistrationbean();
	
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		eb.setId(rs.getInt(1));
		eb.setName(rs.getString(2));
		eb.setEmail(rs.getString(3));
		eb.setPassword(rs.getString(4));
		eb.setGender(rs.getString(5));
		eb.setJoiningdate(rs.getString(6));
		eb.setDepartment(rs.getString(7));
		eb.setExp(rs.getString(8));
	return eb;
	}else {
		return null;
	}
}

}
