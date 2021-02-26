package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dprofilebean {
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
	public Dregistrationbean dprofilevalidate(String name,String email,String password,String phone,String specialiazation) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update patient set name=?,email=?,password=?,phone=?,specialiazation=? where id=?");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,password);
		ps.setString(4,phone);
		ps.setString(5,specialiazation);
		ps.setInt(6,id);
		
		Dregistrationbean lb=new Dregistrationbean();
		
		int x=ps.executeUpdate();
		if(x!=0){
			      lb.setName(name);
			      lb.setEmail(email);
			      lb.setPassword(password);
			      lb.setPhone(phone);
			      lb.setSpecialiazation(specialiazation);
			      lb.setId(id);
			      return lb;
			}else{
				return null;
		}
		
		
	}

}
