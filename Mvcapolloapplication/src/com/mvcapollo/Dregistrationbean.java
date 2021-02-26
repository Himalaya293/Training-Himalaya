package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Dregistrationbean {
    private int id;
    private String name,password,email,phone,specialiazation;
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecialiazation() {
		return specialiazation;
	}

	public void setSpecialiazation(String specialiazation) {
		this.specialiazation = specialiazation;
	}

	public PreparedStatement registrationvalidate(String name,String password,String email,String phone,String specialiazation) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("insert into doctor (name,password,email,phone,specialiazation) values(?,?,?,?,?)");	
		ps.setString(1, name);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setString(4,phone);
		ps.setString(5,specialiazation);
	    int x=ps.executeUpdate();
	    if(x!=0)
	    {
	    	return ps;
	    }else {
	    	return null;
	    }
		
		
	}

}
