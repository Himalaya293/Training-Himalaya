package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvcapollo.ConnectionEx;
import com.mvcapollo.Dregistrationbean;

public class Dloginbean {
	
	int id;
	private String email,password,specialiazation;
	
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
	
public Dregistrationbean loginvalidate(String email,String password) throws ClassNotFoundException, SQLException {
	Connection con=ConnectionEx.Connectivity();
	PreparedStatement ps=con.prepareStatement("select * from doctor where email=? and password=?");
	ps.setString(1,email);
	ps.setString(2,password);
	
	Dregistrationbean lb=new Dregistrationbean();
	
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		lb.setId(rs.getInt(1));
		lb.setName(rs.getString(2));
		lb.setPassword(rs.getString(3));
		lb.setEmail(rs.getString(4));
		lb.setPhone(rs.getString(5));
		lb.setSpecialiazation(rs.getString(6));
	return lb;
	}else {
		return null;
	}
}

public String getSpecialiazation() {
	return specialiazation;
}

public void setSpecialiazation(String specialiazation) {
	this.specialiazation = specialiazation;
}
}
